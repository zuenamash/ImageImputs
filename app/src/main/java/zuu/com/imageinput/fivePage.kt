package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fivePage : AppCompatActivity() {

    lateinit var btngo: Button
    lateinit var btnBehind: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_page)
        btngo=findViewById(R.id.btngo)
        btngo.setOnClickListener {
            var intent= Intent(this,pageSix::class.java)
            startActivity(intent)
        }
        btnBehind=findViewById(R.id.btnBehind)
        btnBehind.setOnClickListener {
            var intent= Intent(this,pageFour::class.java)
            startActivity(intent)
        }


    }
}