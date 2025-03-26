package com.shaishab316.englishstudy.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shaishab316.englishstudy.Data
import com.shaishab316.englishstudy.R
import com.shaishab316.englishstudy.adapter.Adapter
import com.shaishab316.englishstudy.adapter.List
import com.shaishab316.englishstudy.adapter.Main
import com.shaishab316.englishstudy.toast
import java.util.Locale


abstract class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<Data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main).apply {
            recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
                setHasFixedSize(true)
            }
        }
        supportActionBar?.apply {
            title = title()
            setDisplayHomeAsUpEnabled(true)
        }
        arrayList = ArrayList()
        loadData()
        loadRecyclerView(recyclerView, arrayList, url())
    }

    fun add(
        text: String? = null, image: Int? = null,
    ) {
        arrayList.add(Data(text, image))
    }

    abstract fun loadData()
    open fun url(): String? = null
    abstract fun title(): String
    abstract fun loadRecyclerView(
        recyclerView: RecyclerView, arrayList: ArrayList<Data>, url: String? = null,
    )

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        (menu!!.findItem(R.id.bar_search).actionView as SearchView).setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                update(newText)
                return false
            }
        })

        return true
    }

    fun update(newText: String?) {
        val newList: ArrayList<Data> = ArrayList()
        for (item in arrayList) {
            if (item.text?.lowercase(Locale.getDefault())!!
                    .contains(newText!!.lowercase(Locale.ROOT))
            ) {
                newList.add(item)
            }
        }
        if (newList.isEmpty()) {
            "No Lesson Found.." toast applicationContext
        } else {
            (recyclerView.adapter as Adapter).updateList(newList)
        }
    }
}

abstract class Home : MainActivity() {
    override fun loadRecyclerView(
        recyclerView: RecyclerView, arrayList: ArrayList<Data>, url: String?,
    ) {
        recyclerView.apply {
            adapter = Main(this@Home, arrayList, url)
            layoutManager = GridLayoutManager(applicationContext, 2).apply {
                orientation = RecyclerView.VERTICAL
            }
        }
    }
}

abstract class Sub : MainActivity() {
    override fun loadRecyclerView(
        recyclerView: RecyclerView, arrayList: ArrayList<Data>, url: String?,
    ) {
        recyclerView.apply {
            adapter = List(this@Sub, arrayList, url)
            layoutManager = LinearLayoutManager(applicationContext).apply {
                orientation = RecyclerView.VERTICAL
            }
        }
    }
}