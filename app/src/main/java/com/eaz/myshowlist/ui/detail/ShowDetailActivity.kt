package com.eaz.myshowlist.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.eaz.myshowlist.R

class ShowDetailActivity : AppCompatActivity() {

    private lateinit var showDetailViewModel: ShowDetailViewModel

    companion object {
        const val ARG_SHOW_ID = "show_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)

        val ivPoster = findViewById<ImageView>(R.id.iv_poster_show_detail)
        val tvTitle = findViewById<TextView>(R.id.tv_title_show_detail)
        val tvDate = findViewById<TextView>(R.id.tv_date_show_detail)
        val tvRating = findViewById<TextView>(R.id.tv_rating_title_show_detail)
        val rbRating = findViewById<RatingBar>(R.id.rb_rating_show_detail)
        val tvDesc = findViewById<TextView>(R.id.tv_desc_show_detail)

        showDetailViewModel = ViewModelProviders.of(this).get(ShowDetailViewModel::class.java).apply {
            val showID = intent.getIntExtra(ARG_SHOW_ID, -1)
            if (showID == -1) finish()
            else getDetailShow(intent.getIntExtra(ARG_SHOW_ID, -1)).let {
                if(it.poster != null) ivPoster.setImageResource(it.poster)
                tvTitle.text = it.title
                tvDate.text = it.releaseDate
                tvRating.text = it.rating.toString()
                tvDesc.text = it.description
                rbRating.rating = it.rating.toFloat()
            }
        }
    }
}
