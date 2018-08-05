package ua.com.dynamic_recyclerview.dynamic_recyclerview.server

import android.os.AsyncTask
import android.util.Log
import ua.com.dynamic_recyclerview.dynamic_recyclerview.App
import ua.com.dynamic_recyclerview.dynamic_recyclerview.rv.PlaceholderPost


class ConnectToServer : AsyncTask<Int, Void, String>() {

    override fun doInBackground(vararg p0: Int?): String {
        val api: Api? = App().connectServer()
        val call = api!!.listRepos(p0[0]!!)

        val contributors = call.execute().body()
        for (contributor in contributors!!) {
            Log.e("Server", "${contributor.userId} -- ${ contributor.title } --> ${ contributor.body }")
        }

        return ""
    }
}