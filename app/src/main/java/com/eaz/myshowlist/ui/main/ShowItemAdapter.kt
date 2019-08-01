package com.eaz.myshowlist.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.eaz.myshowlist.R
import com.eaz.myshowlist.vo.Show

class ShowItemAdapter(private val callback: (id: Int) -> Unit) :
    RecyclerView.Adapter<ShowItemAdapter.ShowItemViewHolder>() {

    private val shows: MutableList<Show> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ShowItemViewHolder(
            inflater.inflate(R.layout.item_show, parent, false),
            callback
        )
    }

    override fun getItemCount(): Int {
        return shows.size
    }

    override fun onBindViewHolder(holder: ShowItemViewHolder, position: Int) {
        holder.setWithShow(shows[position])
    }

    fun changeShows(shows: List<Show>) {
        this.shows.clear()
        this.shows.addAll(shows)
        notifyDataSetChanged()
    }

    open class ShowItemViewHolder(v: View, private val callback: (id: Int) -> Unit) : RecyclerView.ViewHolder(v) {
        private val tvTitle: TextView = v.findViewById(R.id.tv_title_item_show)
        private val tvDesc: TextView = v.findViewById(R.id.tv_desc_item_show)
        private val tvDate: TextView = v.findViewById(R.id.tv_date_item_show)
        private val ivPoster: ImageView = v.findViewById(R.id.iv_poster_item_show)
        private val cvItem: CardView = v.findViewById(R.id.cv_item_show)

        fun setWithShow(show: Show) {
            tvTitle.text = show.title
            tvDesc.text = show.description
            tvDate.text = show.releaseDate

            if (show.poster != null) ivPoster.setImageResource(show.poster)

            cvItem.setOnClickListener {
                callback(show.id)
            }
        }
    }
}