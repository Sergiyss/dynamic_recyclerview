package ua.com.dynamic_recyclerview.dynamic_recyclerview.rv

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup


class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.TestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.TestViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.TestViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}