package com.example.blueprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import com.google.ar.sceneform.ux.ArFragment
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  fragment: ArFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   setSupportActionBar(toolbar)

        fragment = supportFragmentManager.findFragmentById((R.id.sceneform_fragment)) as ArFragment
    }

//    override fun onResume() {
//        super.onResume()
//
//        if(!CameraPermissionHelper.hasCameraPermission(this)){
//
//        }
//    }
}
