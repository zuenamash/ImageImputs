package zuu.com.imageinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageOne : AppCompatActivity() {

lateinit var btnNext:Button
lateinit var btnBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_page_one)
      btnNext=findViewById(R.id.btnNext)
      btnNext.setOnClickListener {
           var intent=Intent(this,pageThree::class.java)
          startActivity(intent)
       }
       btnBack=findViewById(R.id.btnBack)
       btnBack.setOnClickListener {
           var intent=Intent(this,MainActivity::class.java)
           startActivity(intent)
      }


    }
}