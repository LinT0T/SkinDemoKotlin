package com.lint0t.ddd

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {
    private var skinPath //皮肤包路径
            : String? = null
    private var skinPath2 //皮肤包路径2
            : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_default.setOnClickListener(this)
        btn_blue.setOnClickListener(this)
        btn_diy.setOnClickListener(this)
        skinPath = "/sdcard/Download/blue-skin.skin"
        skinPath2 = "/sdcard/Download/svgSkin.skin"

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_default -> {
                println("1")
                SkinManager.instance.restoreDefaultTheme()
            }
            R.id.btn_blue -> {
                println("2")
                SkinManager.instance.loadSkin(skinPath)
            }
            R.id.btn_diy -> {
                println("3")
                SkinManager.instance.loadSkin(skinPath2)
            }
        }
    }
}