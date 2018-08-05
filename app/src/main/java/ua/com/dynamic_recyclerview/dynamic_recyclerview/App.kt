package ua.com.dynamic_recyclerview.dynamic_recyclerview

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ua.com.dynamic_recyclerview.dynamic_recyclerview.server.Api
import java.io.IOException


class App : Application() {


    @Throws(IOException::class)
    fun connectServer() : Api? {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit.create(Api::class.java);
    }
}