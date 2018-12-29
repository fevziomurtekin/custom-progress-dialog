package com.fevziomurtekin.custom_progress_dialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fevziomurtekin.customprogress.Dialog
import com.fevziomurtekin.customprogress.Type

class MainActivity : AppCompatActivity() {

    private lateinit var progressbar : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressbar = findViewById(R.id.progress)
        progressbar.settype(Type.WEDGES)
        progressbar.setdurationTime(100)
        progressbar.show()


    }
}
