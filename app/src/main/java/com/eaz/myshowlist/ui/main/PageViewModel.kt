package com.eaz.myshowlist.ui.main

import androidx.lifecycle.ViewModel
import com.eaz.myshowlist.utils.Dummy
import com.eaz.myshowlist.vo.Show
import com.eaz.myshowlist.vo.ShowType

class PageViewModel : ViewModel() {

    fun getShow(showType: ShowType) : List<Show> {
        return Dummy.generateDummyShow().filter {
            it.showType == showType
        }
    }

}