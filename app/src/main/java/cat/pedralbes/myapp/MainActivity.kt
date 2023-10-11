package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textData: EditText
    private lateinit var viewer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.textButton)
        textData = findViewById(R.id.textInput)
        viewer = findViewById(R.id.textViewer)
    }

    fun sendText(view: View) {
        val text = "Text Updated!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
        viewer.setText(textData.text)
    }
}