package com.translate589.styledankotest

import android.content.Context
import android.view.ViewManager
import android.widget.TextView
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.textView

inline fun ViewManager.styleTextView(context: Context? = null,
                                     init:(@AnkoViewDslMarker TextView).() -> Unit = {})
        : TextView = textView {}.apply(init)

inline fun ViewManager.styleTextView(context: Context? = null,
                                     style:(@AnkoViewDslMarker TextView).() -> Unit = {},
                                     init:(@AnkoViewDslMarker TextView).() -> Unit = {})
        : TextView = textView {}.apply(style).apply(init)

