package com.eaz.myshowlist.ui.main

import com.eaz.myshowlist.vo.ShowType
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class PageViewModelTest {

    private lateinit var pageVM: PageViewModel

    @Before
    fun setup() {
        pageVM = PageViewModel()
    }

    @Test
    fun getShowMovies() {
        val movies = pageVM.getShow(ShowType.MOVIE)
        assertNotNull(movies)
        assertEquals(10, movies.size)
    }

    @Test
    fun getShowTvSeries() {
        val tvSeries = pageVM.getShow(ShowType.SERIES)
        assertNotNull(tvSeries)
        assertEquals(10, tvSeries.size)
    }
}