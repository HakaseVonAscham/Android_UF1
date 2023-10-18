package cat.pedralbes.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.view.View
import android.widget.Button
import android.view.AbsSavedState
import android.widget.TextView

class SecondActivity: AppCompatActivity() {

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_second)

        var textView: TextView = findViewById(R.id.textView)
        val colorString = intent?.extras?.getString("color").toString()
        setContentView(R.layout.activity_second)
    }
}