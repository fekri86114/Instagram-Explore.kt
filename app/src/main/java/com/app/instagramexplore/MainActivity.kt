package com.app.instagramexplore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.instagramexplore.databinding.ActivityMainBinding
import com.app.kotlinandroidtraining.NetworkChecker
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = listOf(
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img1.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img2.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img3.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img4.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img5.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img6.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img7.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img8.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img9.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img10.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img11.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img12.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img13.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img14.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img15.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img16.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img17.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img18.png"
        )

        if ( NetworkChecker(this).isInternetConnected ) {

            //use glide:
            val glide = Glide.with(this)

            glide.load( url[0] )
                .error(R.drawable.broken_img)
                .into(binding.img1)

            glide.load( url[1] )
                .error(R.drawable.broken_img)
                .into(binding.img2)

            glide.load( url[2] )
                .error(R.drawable.broken_img)
                .into(binding.img3)

            glide.load( url[3] )
                .error(R.drawable.broken_img)
                .into(binding.img10)

            glide.load( url[4] )
                .error(R.drawable.broken_img)
                .into(binding.img11)

            glide.load( url[5] )
                .error(R.drawable.broken_img)
                .into(binding.img18)

            glide.load( url[6] )
                .error(R.drawable.broken_img)
                .into(binding.imageView5)

            glide.load( url[7] )
                .error(R.drawable.broken_img)
                .into(binding.imageView6)

            glide.load( url[8] )
                .error(R.drawable.broken_img)
                .into(binding.imageView7)

            glide.load( url[9] )
                .error(R.drawable.broken_img)
                .into(binding.imageView9)

            glide.load( url[10] )
                .error(R.drawable.broken_img)
                .into(binding.imageView10)

            glide.load( url[11] )
                .error(R.drawable.broken_img)
                .into(binding.imageView12)

            glide.load( url[12] )
                .error(R.drawable.broken_img)
                .into(binding.imageView23)

            glide.load( url[13] )
                .error(R.drawable.broken_img)
                .into(binding.imageView24)

            glide.load( url[14] )
                .error(R.drawable.broken_img)
                .into(binding.imageView26)

            glide.load( url[15] )
                .error(R.drawable.broken_img)
                .into(binding.imageView27)

            glide.load( url[16] )
                .error(R.drawable.broken_img)
                .into(binding.imageView28)

            glide.load( url[17] )
                .error(R.drawable.broken_img)
                .into(binding.imageView30)

        }
        else {
            Toast.makeText(this, "Check your internet", Toast.LENGTH_SHORT).show()
        }

    }
}