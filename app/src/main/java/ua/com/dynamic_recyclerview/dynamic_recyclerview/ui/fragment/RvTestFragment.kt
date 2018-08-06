package ua.com.dynamic_recyclerview.dynamic_recyclerview.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ua.com.dynamic_recyclerview.dynamic_recyclerview.R


class RvTestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_recyclerview,
                container, false)

        return rootView
    }
    companion object {
        val TAG = "RvTestFragment"
    }


}