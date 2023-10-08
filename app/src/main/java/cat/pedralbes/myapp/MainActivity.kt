package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

abstract class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var text: EditText
    private lateinit var viewer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.textButton)
        text = findViewById(R.id.textInput)
        viewer = findViewById(R.id.textViewer)
    }

    fun sendMeesage(view: View) {
        val text = "Button pressed!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
        viewer.setText(text.toString())
    }
}