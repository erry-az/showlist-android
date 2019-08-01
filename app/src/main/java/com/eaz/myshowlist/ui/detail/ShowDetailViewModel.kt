package com.eaz.myshowlist.ui.detail

import androidx.lifecycle.ViewModel
import com.eaz.myshowlist.utils.Dummy
import com.eaz.myshowlist.vo.Show

class ShowDetailViewModel : ViewModel() {
    fun getDetailShow(showID: Int) : Show {
        return Dummy.getDummyByID(showID)
    }
}