package com.example.blueprint


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Window
import android.view.Gravity
import android.view.WindowManager
import android.widget.ImageView
import android.widget.PopupWindow


class MainActivity : AppCompatActivity() {

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        //CK - hide notification bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //CK - created timer here to have Splash Screen showing for 1 seconds
        Thread.sleep(1000)

        setContentView(R.layout.activity_main)

        //Button to start Scan activity and open the Scan environment
        capture_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainJava::class.java)
            startActivity(intent)
        }

        //Button to start ArActivity and open the place environment
        place_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, ArActivity::class.java)
            startActivity(intent)
        }

        //Button to open how-top page
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


