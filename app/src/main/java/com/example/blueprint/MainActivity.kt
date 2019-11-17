package com.example.blueprint

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


import android.os.Build
import android.provider.MediaStore
import android.widget.Toast
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Window
import android.view.Gravity;
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupWindow
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        //CK - hide notification bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //CK - created timer here to have Splash Screen showing for 3 seconds
        Thread.sleep(2000)

        setContentView(R.layout.activity_main)


        capture_btn.setOnClickListener{
            //start scan activity
        }

        place_btn.setOnClickListener (object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@MainActivity, ArActivity::class.java)
                startActivity(intent)
            }
        })

        howto_btn.setOnClickListener {
            val window = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.popup, null)
            window.contentView = view
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            imageView.setOnClickListener {
                window.dismiss()
            }
            window.showAtLocation(findViewById(R.id.main), Gravity.CENTER,0,0)
        }
    }


}


