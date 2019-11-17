package com.example.blueprint

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException
import java.text.SimpleDateFormat
import android.os.Bundle
import android.os.Build
import android.provider.MediaStore
import android.widget.Toast
import android.net.Uri
import android.os.Environment
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.util.*

class MainActivity : AppCompatActivity() {
    /*
    private val PERMISSION_CODE = 1000
    private val IMAGE_CAPTURE_CODE = 1001
    private val SELECT_PICTURE = 1002
    var currentPath: String? = null

    var image_uri: Uri? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
//        Camera View
        capture_btn.setOnClickListener{
            if(checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                //Permission was not enabled
                val permission = arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                requestPermissions(permission, PERMISSION_CODE)
                Toast.makeText(this, "Skrt", Toast.LENGTH_SHORT).show()

            }else{
                //permission was enabled
                openCamera()
            }
        }

        //Scanning a photo from the lib
        scan_btn.setOnClickListener{
                openLib()
            }

        //Opening AR World with drag and drop features
        ar_btn.setOnClickListener{
            if(checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                //Permission was not enabled
                val permission = arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                requestPermissions(permission, PERMISSION_CODE)
                Toast.makeText(this, "Skrt", Toast.LENGTH_SHORT).show()

            }else{
                //permission was enabled
                openAr()
            }
        }
    }

    private fun openCamera(){
        /*
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")*/
        //var newFile: File? = null
        //newFile = createImage()
        //var photoURI = FileProvider.getUriForFile(this."com.coutocode.cameraexample.fileprovider", new_File)
        //cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,photoUri)
        //image_uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)

       // image_uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, newFile)

        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, image_uri)
        startActivityForResult(cameraIntent, IMAGE_CAPTURE_CODE)

    }

    private fun openLib(){
        val libIntent = Intent()
        libIntent.type = "Image/s"
        libIntent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(libIntent,"Select Picture to be Scanned"), SELECT_PICTURE)
    }

    private fun openAr(){
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode){
            PERMISSION_CODE ->{
                if(grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    openCamera()
                }else{
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == SELECT_PICTURE && resultCode == Activity.RESULT_OK)
        {
            try {
               /* val uri = data!!.data*/
            }catch (e: IOException)
            {
                e.printStackTrace()
            }
        }
    }
    override fun onResume() {
        super.onResume()

//        if(!CameraPermissionHelper.hasCameraPermission(this)){

//        }
    }*/
}


