package com.qourall.ncertclass12booksandsolution.ui.viewModel

import androidx.lifecycle.ViewModel
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.data.model.Details

class BooksViewModel : ViewModel(){

    fun BooksDetail() : ArrayList<Details>{

        val arrayList = ArrayList<Details>()
        arrayList.add(
            Details(
                R.drawable.function,
                "Mathematics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.molecules,
                "Physics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.ruler,
                "Accountancy"
            )
        )
        arrayList.add(
            Details(
                R.drawable.meditation,
                "Sanskrit"
            )
        )
        arrayList.add(
            Details(
                R.drawable.hindi,
                "Hindi"
            )
        )
        arrayList.add(
            Details(
                R.drawable.dictionary,
                "English"
            )
        )
        arrayList.add(
            Details(
                R.drawable.molecules,
                "Biology"
            )
        )
        arrayList.add(
            Details(
                R.drawable.history,
                "History"
            )
        )
        arrayList.add(
            Details(
                R.drawable.earth,
                "Geography"
            )
        )
        arrayList.add(
            Details(
                R.drawable.thinking,
                "Psychology"
            )
        )
        arrayList.add(
            Details(
                R.drawable.mind,
                "Sociology"
            )
        )
        arrayList.add(
            Details(
                R.drawable.flask,
                "Chemistry"
            )
        )
        arrayList.add(
            Details(
                R.drawable.conference,
                "Political Science"
            )
        )
        arrayList.add(
            Details(
                R.drawable.budget,
                "Economics"
            )
        )
        arrayList.add(
            Details(
                R.drawable.budget,
                "Business Studies"
            )
        )
        arrayList.add(
            Details(
                R.drawable.house,
                "Home and Science"
            )
        )
        arrayList.add(
            Details(
                R.drawable.history,
                "Heritage Crafts"
            )
        )
        arrayList.add(
            Details(
                R.drawable.ruler,
                "New Age Graphics Design"
            )
        )

        return  arrayList
    }

}