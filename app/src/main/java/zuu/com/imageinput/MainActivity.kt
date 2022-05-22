package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnHoover: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHoover=findViewById(R.id.btnHover)
        btnHoover.setOnClickListener {
            var intent= Intent(this,pageOne::class.java)
            startActivity(intent)
        }
    }
}