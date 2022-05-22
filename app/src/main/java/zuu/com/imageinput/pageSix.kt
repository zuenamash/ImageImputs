package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class pageSix : AppCompatActivity() {
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_six)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            var intent=Intent(this,fivePage::class.java)
            startActivity(intent)
        }
    }
}