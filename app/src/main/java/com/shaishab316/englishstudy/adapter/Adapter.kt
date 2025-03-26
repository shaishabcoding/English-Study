package com.shaishab316.englishstudy.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shaishab316.englishstudy.Data
import com.shaishab316.englishstudy.R
import com.shaishab316.englishstudy.go
import com.shaishab316.englishstudy.open
import com.shaishab316.englishstudy.toClass

abstract class Adapter(
    private val context: Context,
    private var arrayList: ArrayList<Data>,
    private val url: String? = null,
) : RecyclerView.Adapter<ContentHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ContentHolder(LayoutInflater.from(parent.context).inflate(layout, parent, false))

    abstract val layout: Int
    override fun getItemCount() = arrayList.size

    override fun onBindViewHolder(holder: ContentHolder, position: Int) {
        holder.apply {
            arrayList[position].apply {
                text?.apply {
                    textView.text = text
                    itemView.setOnClickListener {
                        context.apply {
                            if (toClass() != null) {
                                go(toClass())
                            } else {
                                "Google Translate".let {
                                    if (text == it) {
                                        open(
                                            "https://translate.google.com/?hl=bn&sl=en&tl=bn&op=translate&title=",
                                            it
                                        )
                                    } else open(url, text)
                                }
                            }
                        }
                    }

                }
                image?.let {
                    imageView.setImageResource(it)
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public fun updateList(newList: ArrayList<Data>) {
        arrayList = newList
        notifyDataSetChanged()
    }

}

class ContentHolder(
    itemView: View,
    val textView: TextView = itemView.findViewById(R.id.name),
    val imageView: ImageView = itemView.findViewById(R.id.image),
) : RecyclerView.ViewHolder(itemView)

class Main(
    context: Context,
    arrayList: ArrayList<Data>,
    url: String? = null,
    override val layout: Int = R.layout.grid_model,
) : Adapter(context, arrayList, url)

class List(
    context: Context,
    arrayList: ArrayList<Data>,
    url: String? = null,
    override val layout: Int = R.layout.list_model,
) : Adapter(context, arrayList, url)
