package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.animation.AnimationUtils
import com.google.android.material.snackbar.Snackbar
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button4.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)


       val overlay = findViewById<View>(R.id.main)
        overlay.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_FULLSCREEN)




        }

    override fun onClick(v: View?) {

            when (v?.id) {
                R.id.button1 -> {
                    FancyToast.makeText(
                        this, "This is a Success toast", FancyToast
                            .LENGTH_SHORT, FancyToast.SUCCESS, true
                    )
                        .show()
                    button2.clearAnimation()
                }
                R.id.button4 -> {
                    var snack = Snackbar.make(main, "This is a Snackbar" ,Snackbar.LENGTH_LONG)
                    snack.view.setBackgroundColor(Color.BLACK)
                    snack.setActionTextColor(Color.GRAY)
                    snack.setAction("Dismiss", View.OnClickListener {

                    })
                    snack.show()
                    button2.clearAnimation()
                }
                R.id.button3 -> {
                    textView.text = "This is a text View"
                    button2.clearAnimation()

                }
                R.id.button2 ->{
                    var anim = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.shake)
                    button2.startAnimation(anim)

                }


            }

    }

}

