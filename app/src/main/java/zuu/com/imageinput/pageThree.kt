package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageThree : AppCompatActivity() {
    lateinit var btnFoward:Button
    lateinit var btnprev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_three)
        btnFoward=findViewById(R.id.btnFoward)
        btnFoward.setOnClickListener {
            var intent= Intent(this,pageFour::class.java)
            startActivity(intent)
        }
        btnprev=findViewById(R.id.btnprev)
        btnprev.setOnClickListener {
            var intent= Intent(this,pageOne::class.java)
            startActivity(intent)
        }
    }
    }
