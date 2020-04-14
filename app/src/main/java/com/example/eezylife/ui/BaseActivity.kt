package com.example.eezylife.ui

import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.eezylife.R
import com.hedyhidoury.calendar.horizontallibrary.listener.OnDatePickedListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


open class BaseActivity : AppCompatActivity() {
    var toolbar: Toolbar? = null
    var title: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setToolBar(titleText: String) {
        toolbar = findViewById(R.id.toolbar)
        title = findViewById(R.id.title)
        title?.maxLines = 1
        title?.ellipsize = TextUtils.TruncateAt.END

        title?.text = titleText
        toolbar?.contentInsetStartWithNavigation = 0
        setSupportActionBar(toolbar)

        toolbar?.setNavigationIcon(R.drawable.ic_back)

    }
}