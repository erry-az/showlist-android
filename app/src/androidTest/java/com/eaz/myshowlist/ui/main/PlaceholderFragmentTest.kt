package com.eaz.myshowlist.ui.main

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.eaz.myshowlist.R
import com.eaz.myshowlist.testing.SingleFragmentActivity
import com.eaz.myshowlist.utils.RecyclerViewItemCountAssertion
import com.eaz.myshowlist.vo.ShowType
import org.junit.Rule
import org.junit.Test

class PlaceholderFragmentTest {
    @Rule @JvmField
    val activityRule: ActivityTestRule<SingleFragmentActivity> = ActivityTestRule(SingleFragmentActivity::class.java)

    @Test
    fun loadMovieContent() {
        activityRule.activity.setFragment(PlaceholderFragment.newInstance(ShowType.MOVIE))
        onView(withId(R.id.rv_show_fragment_main)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_show_fragment_main)).check(RecyclerViewItemCountAssertion(10))
    }

    @Test
    fun loadSeriesContent() {
        activityRule.activity.setFragment(PlaceholderFragment.newInstance(ShowType.SERIES))
        onView(withId(R.id.rv_show_fragment_main)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_show_fragment_main)).check(RecyclerViewItemCountAssertion(10))
    }
}