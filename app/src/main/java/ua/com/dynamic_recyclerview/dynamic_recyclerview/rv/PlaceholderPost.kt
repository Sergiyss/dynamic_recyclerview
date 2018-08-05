package ua.com.dynamic_recyclerview.dynamic_recyclerview.rv

import com.google.gson.annotations.SerializedName

data class PlaceholderPost(@SerializedName("userId") val userId : Int,
                           @SerializedName("id") val id : Int,
                           @SerializedName("title") val title : String,
                           @SerializedName("body") val body : String)