package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(String(),"Created")
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

    fun saveData(view: View) {
        val text = "Saved"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
    }
}