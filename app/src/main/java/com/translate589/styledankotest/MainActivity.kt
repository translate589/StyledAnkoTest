package com.translate589.styledankotest

import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TestActivityUI().setContentView(this)
    }

    class TestActivityUI: AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
            verticalLayout {
                lparams(matchParent, matchParent)

                textView {
                    text = "default style textView"
                }.lparams(wrapContent, wrapContent)

                textView {
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    gravity = Gravity.CENTER
                    includeFontPadding = false
                    textSize = sp(20f).toFloat()
                    backgroundColor = Color.BLUE

                    text = String.format("테스트1\n테스트2\n테스트3")
                    maxLines = 2
                    textColor = Color.YELLOW
                }.lparams(dip(180),dip(80))

                styleTextView(style = {
                    ViewStyleHelper.setViewStyleHelper(ViewStyleHelper.Style.TestSampleStyle,this)
                }, init = {
                    text = String.format("테스트1\n테스트2\n테스트3")
                    maxLines = 2
                    textColor = Color.YELLOW
                }).lparams(dip(180),dip(80))
            }
        }
    }
}
