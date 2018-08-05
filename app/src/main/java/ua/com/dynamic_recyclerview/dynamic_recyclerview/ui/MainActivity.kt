package ua.com.dynamic_recyclerview.dynamic_recyclerview.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import ua.com.dynamic_recyclerview.dynamic_recyclerview.R
import ua.com.dynamic_recyclerview.dynamic_recyclerview.server.ConnectToServer


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texts.text = "RecyclerView Start Prodject"

        Log.d(TAG, "Status Active")

        ConnectToServer().execute(1)

    }

    companion object {
        val TAG = "MainActivity"
    }
}
