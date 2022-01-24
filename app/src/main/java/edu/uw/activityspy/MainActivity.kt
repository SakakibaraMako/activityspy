package edu.uw.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    var event_name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        event_name = "onCreate"
        logging()
        if (savedInstanceState != null) {
            Log.i(TAG, savedInstanceState.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        event_name = "onStart"
        logging()
    }

    override fun onResume() {
        super.onResume()
        event_name = "onResume"
        logging()
    }

    override fun onPause() {
        super.onPause()
        event_name = "onPause"
        logging()
    }

    override fun onStop() {
        super.onStop()
        event_name = "onStop"
        logging()
    }

    override fun onRestart() {
        super.onRestart()
        event_name = "onRestart"
        logging()
    }

    override fun onDestroy() {
        super.onDestroy()
        event_name = "onDestroy"
        logging()
        Log.e(TAG, "We're going down, Captain!")
    }

    fun logging(): Unit {
        Log.i(TAG, "${event_name} event fired")
    }
}