package com.eaz.myshowlist.ui.detail

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.eaz.myshowlist.R
import com.eaz.myshowlist.utils.FakeDummy
import org.junit.Rule
import org.junit.Test

class ShowDetailActivityTest {

    private val showDummy = FakeDummy.generateDummyShow()[0]

    @Rule @JvmField
    val activityRule = object  : ActivityTestRule<ShowDetailActivity>(ShowDetailActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val context = InstrumentationRegistry.getInstrumentation().targetContext
            return Intent(context, ShowDetailActivity::class.java).apply {
                putExtra(ShowDetailActivity.ARG_SHOW_ID, showDummy.id)
            }
        }
    }

    @Test
    fun loadShow() {
        onView(withId(R.id.tv_title_show_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_show_detail)).check(matches(withText(showDummy.title)))
        onView(withId(R.id.iv_poster_show_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc_show_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc_show_detail)).check(matches(withText(showDummy.description)))
    }
}