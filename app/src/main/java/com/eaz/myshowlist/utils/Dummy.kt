package com.eaz.myshowlist.utils

import com.eaz.myshowlist.vo.Show
import com.eaz.myshowlist.vo.ShowType

class Dummy {
    companion object {
        fun generateDummyShow() : List<Show> {
            return listOf(
                Show(0,"movie","", 2.0, ShowType.MOVIE, "2 June 2019"),
                Show(1,"series","", 2.0, ShowType.SERIES, "2 June 2019")
            )
        }

        fun getDummyByID(showID: Int) : Show {
            return generateDummyShow().first { it.id == showID }
        }
    }
}