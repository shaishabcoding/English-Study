package com.shaishab316.englishstudy

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.shaishab316.englishstudy.activity.Web


/**for start new activity*/
infix fun Intent.start(context: Context) {
    context.startActivity(this)
}

/**for showing toast message*/
infix fun String.toast(
    context: Context,
) {
    Toast.makeText(
        context, this, Toast.LENGTH_SHORT
    ).show()
}

/**for view animation*/
fun View.anim(
    context: Context, position: Int,
) {
    startAnimation(
        AnimationUtils.loadAnimation(
            context,
            if (position % 2 == 0) R.anim.anim_slide_in_left else R.anim.anim_slide_in_right
        )
    )
}

/**show error message*/
fun Activity.errorMessage() {
    resources.getString(R.string.unknown_media) toast this
}


@SuppressLint("QueryPermissionsNeeded")
infix fun Activity.open(url: String) {
    Intent(Intent.ACTION_VIEW, Uri.parse(url)!!).apply {
        resolveActivity(packageManager)?.let {
            this start this@open
        } ?: errorMessage()
    }
}

/**get text intent extra*/
infix fun Intent.get(text: String): String = getStringExtra(text)!!

/**hide view*/
fun View.hide() {
    visibility = View.GONE
}

/**display view*/
fun View.show() {
    visibility = View.VISIBLE
}

/**get view by id*/
infix fun <T : View?> View.view(id: Int): T = findViewById<T>(id)

public const val root = "file:///android_asset"

public fun Context.open(url: String?, title: String?) {
    startActivity(Intent(this, Web::class.java).apply {
        putExtra("url", url)
        putExtra("title", title)
    })
}

public fun Context.go(mClass: Class<*>?) {
    startActivity(Intent(this, mClass))
}