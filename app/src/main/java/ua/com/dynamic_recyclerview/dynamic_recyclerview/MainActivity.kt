package ua.com.dynamic_recyclerview.dynamic_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texts.text = "RecyclerView Start Prodject"

        Log.d(TAG, "Status Active")
    }

    companion object {
        val TAG = "MainActivity"
    }
}
