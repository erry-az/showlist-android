package com.eaz.myshowlist.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.eaz.myshowlist.R
import com.eaz.myshowlist.ui.detail.ShowDetailActivity
import com.eaz.myshowlist.vo.Show
import com.eaz.myshowlist.vo.ShowType

class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel
    private lateinit var showList: List<Show>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            showList = getShow(arguments?.getSerializable(ARG_SHOW_TYPE) as ShowType)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val rvShow: RecyclerView = root.findViewById(R.id.rv_show_fragment_main)

        rvShow.adapter = ShowItemAdapter {
            startActivity(
                Intent(activity, ShowDetailActivity::class.java).apply {
                    putExtra(ShowDetailActivity.ARG_SHOW_ID, it)
                }
            )
        }.apply {
            changeShows(showList)
        }

        return root
    }

    companion object {
        private const val ARG_SHOW_TYPE = "show_type"

        @JvmStatic
        fun newInstance(showType: ShowType): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_SHOW_TYPE, showType)
                }
            }
        }
    }
}