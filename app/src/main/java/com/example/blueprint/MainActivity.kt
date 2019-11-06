package com.example.blueprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        //CK - created timer here to have Splash Screen showing for 3 seconds
        val timer = object : Thread() {
            override fun run() {
                try {
                    //Display for 3 seconds
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    // TODO: handle exception
                    e.printStackTrace()
                } finally {
                    //Goes to Activity  StartingPoint.java(STARTINGPOINT)
                    val openstartingpoint = Intent("x.y.z.START")
                    startActivity(openstartingpoint)
                }
            }
        }
        timer.start()

        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

//        if(!CameraPermissionHelper.hasCameraPermission(this)){
//
//        }
    }
}
