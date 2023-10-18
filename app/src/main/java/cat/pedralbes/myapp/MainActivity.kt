package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(String(),"Created")

        val firstname: EditText = findViewById<EditText>(R.id.Firstname)
        val lastname: EditText = findViewById<EditText>(R.id.Lastname)
        val age: EditText = findViewById<EditText>(R.id.Age)
        val username: EditText = findViewById<EditText>(R.id.Username)
        val password: EditText = findViewById<EditText>(R.id.Password)
    }

    fun sendMeesage(view: View) {
        val text = "Registred!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(String(),"Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i(String(),"Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(String(),"Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(String(),"Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(String(),"Destroied")
    }

}