package com.translate589.styledankotest

import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

/**
 * @author Translate589
 * set Style with View
 */
// TODO : 따로 테스트 어플로 결과 확인 해볼 것
object ViewStyleHelper {
    enum class Style {
        TestSampleStyle,
        TestYourStyle,
    }

    /**
     * @param style : ViewStyleHelper.style
     * @param view : Target View
     * @param font : typeface 생성 시 context 가 필요 하므로 인자로 받도록 함.
     */
    fun setViewStyleHelper(style:Style, view: View, font:Typeface? = null) {
        when(style) {
            ViewStyleHelper.Style.TestSampleStyle -> setSampleStyle(view,font)
            ViewStyleHelper.Style.TestYourStyle -> setTestStyle2(view,font)
        }
    }

    private fun setSampleStyle(view:View, font:Typeface?) {
        with(view as TextView) {
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            gravity = Gravity.CENTER
            includeFontPadding = false
            textSize = sp(20f).toFloat()
            textColor = Color.RED
            maxLines = 1
            backgroundColor = Color.BLUE

            font?.let {
                typeface = it
            }

            this.layoutParams.let {
                it.width = matchParent
                it.height = dip(100f)
            }
        }
    }

    private fun setTestStyle2(view:View, font:Typeface?) {
        TODO("Test Your Style")
    }
}