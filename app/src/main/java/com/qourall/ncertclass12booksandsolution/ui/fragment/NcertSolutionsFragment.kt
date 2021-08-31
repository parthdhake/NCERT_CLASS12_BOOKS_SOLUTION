package com.qourall.ncertclass12booksandsolution.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.data.model.Details
import com.qourall.ncertclass12booksandsolution.ui.adapters.SolutionsAdapter

class NcertSolutionsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_ncert_solutions, container, false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.solutions_recycler_view)
        val SolutionsLayoutManager: GridLayoutManager =
            GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = SolutionsLayoutManager
        recyclerView.setHasFixedSize(true)

        val SolutionsArray = SolutionsDetail()
        recyclerView.adapter = SolutionsAdapter(requireContext(), SolutionsArray)
        return root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    fun SolutionsDetail(): ArrayList<Details> {

        val arrayList = ArrayList<Details>()
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.bg_splash_gradient,
                "Mathematics"
            )
        )

        return arrayList
    }
}