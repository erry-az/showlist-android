package com.eaz.myshowlist.ui.detail

import com.eaz.myshowlist.vo.Show
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class ShowDetailViewModelTest {
    private lateinit var showDetailVM: ShowDetailViewModel

    @Before
    fun setUp() {
        showDetailVM = ShowDetailViewModel()
    }

    @Test
    fun getDetailShow() {
        val showID = 1
        val show = showDetailVM.getDetailShow(1)
        assertNotNull(show)
        assertEquals(show::class.java, Show::class.java)
        assertEquals(showID, show.id)
    }
}