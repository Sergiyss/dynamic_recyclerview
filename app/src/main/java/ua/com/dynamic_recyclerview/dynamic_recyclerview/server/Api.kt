package ua.com.dynamic_recyclerview.dynamic_recyclerview.server

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ua.com.dynamic_recyclerview.dynamic_recyclerview.rv.PlaceholderPost


interface Api {

    @GET("posts")
    fun listRepos(@Query("userId") userId: Int) : Call<ArrayList<PlaceholderPost>>

}