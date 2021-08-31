package com.qourall.ncertclass12booksandsolution.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.adapters.ResourceStore
import com.qourall.ncertclass12booksandsolution.ui.adapters.ViewPagerAdapter

class NcertBooksFragment : Fragment() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager2



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ncert_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabs : TabLayout = view.findViewById(R.id.tab_layout)
        viewPager = view.findViewById(R.id.pager)

        viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = getString(ResourceStore.tabList[position])
        }.attach()
    }
}