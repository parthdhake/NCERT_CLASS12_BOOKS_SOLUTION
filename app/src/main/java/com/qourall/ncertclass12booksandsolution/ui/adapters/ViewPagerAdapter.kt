package com.qourall.ncertclass12booksandsolution.ui.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.fragment.NcertBooksEnFragment
import com.qourall.ncertclass12booksandsolution.ui.fragment.NcertBooksHiFragment

private const val ARG_OBJECT = "object"

class ViewPagerAdapter(f : Fragment) : FragmentStateAdapter(f){
    override fun getItemCount(): Int {
        return ResourceStore.tabList.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                val fragment = NcertBooksEnFragment()
                fragment.arguments = Bundle().apply {
                    // Our object is just an integer :-P
                    putInt(ARG_OBJECT, position + 1)
                }
                return fragment
            }
            else -> {
                val fragment = NcertBooksEnFragment()
                fragment.arguments = Bundle().apply {
                    // Our object is just an integer :-P
                    putInt(ARG_OBJECT, position + 1)
                }
                return fragment
            }
        }
    }
}


interface ResourceStore {
    companion object {
        val tabList = listOf(
            R.string.tab1, R.string.tab2
        )
        val pagerFragments = listOf(
            NcertBooksEnFragment(), NcertBooksHiFragment())
    }
}