package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageFour : AppCompatActivity() {
    lateinit var btnNextPage5: Button
    lateinit var btnBackPage5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_four)

        btnNextPage5=findViewById(R.id.btnNextPage5)
        btnNextPage5.setOnClickListener {
            var intent= Intent(this,fivePage::class.java)
            startActivity(intent)
        }
        btnBackPage5=findViewById(R.id.btnBackPage5)
        btnBackPage5.setOnClickListener {
            var intent= Intent(this,pageThree::class.java)
            startActivity(intent)
        }
    }
    }
