package com.lint0t.ddd

import android.view.View
import android.widget.TextView

/**
收集要换肤的内容
 */
class SkinItem(private val view: View?, private val attrs: List<SkinAttr>?) {
    fun apply() {
        if (view == null || attrs == null) return
        for (attr in attrs) {
            val attrName = attr.attrName
            val attrType = attr.attrType
            val resName = attr.resName
            val resId = attr.resId
            if ("background" == attrName) {
                if ("color" == attrType) {
                    view.setBackgroundColor(
                        SkinManager.instance.getColor(resName, resId)
                    )
                } else if ("drawable" == attrType) {
                    view.background =
                        SkinManager.instance.getDrawable(resName, resId)
                }
            } else if ("textColor" == attrName) {
                if (view is TextView && "color" == attrType) {
                    view.setTextColor(
                        SkinManager.instance.getColor(resName, resId)
                    )
                }
            }
        }
    }

}