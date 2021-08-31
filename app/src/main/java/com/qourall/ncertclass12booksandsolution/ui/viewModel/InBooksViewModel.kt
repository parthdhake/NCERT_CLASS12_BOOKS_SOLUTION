package com.qourall.ncertclass12booksandsolution.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.qourall.ncertclass12booksandsolution.R
import java.util.*
import kotlin.collections.ArrayList

class InBooksViewModel(application: Application) : AndroidViewModel(application){

    fun InBooksDetailEn(position : Int) : Array<String>{

        if (position == 0) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_books)
            return array
        }

        if (position == 1) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_physics_books)
            return array
        }

        if (position == 2) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_books)
            return array
        }

        if (position == 3) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_sanskrit_books)
            return array
        }

        if (position == 4) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_hindi_books)
            return array
        }

        if (position == 5) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_english_books)
            return array
        }

        if (position == 6) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_biology_books)
            return array
        }
        if (position == 7) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_history_books)
            return array
        }

        if (position == 8) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_geography_books)
            return array
        }

        if (position == 9) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_psychology_books)
            return array
        }

        if (position == 10) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_sociology_books)
            return array
        }

        if (position == 11) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_books)
            return array
        }

        if (position == 12) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_political_science_books)
            return array
        }

        if (position == 13) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_economic_books)
            return array
        }

        if (position == 14) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_books)
            return array
        }

        if (position == 15) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_books)
            return array
        }

        if (position == 16) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_heritagecrafts_books)
            return array
        }

        if (position == 17) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_newagegraphicsdesign_books)
            return array
        }

        else return emptyArray()
    }
    fun InBooksDetailHi(position : Int) : Array<String>{

        if (position == 0) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_books_hi)
            return array
        }

        if (position == 1) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_physics_books_hi)
            return array
        }

        if (position == 2) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_books_hi)
            return array
        }

        if (position == 3) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_sanskrit_books)
            return array
        }

        if (position == 4) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_hindi_books)
            return array
        }

        if (position == 5) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_english_books)
            return array
        }

        if (position == 6) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_biology_books_hi)
            return array
        }
        if (position == 7) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_history_books_hi)
            return array
        }

        if (position == 8) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_geography_books_hi)
            return array
        }

        if (position == 9) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_psychology_books_hi)
            return array
        }

        if (position == 10) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_sociology_books_hi)
            return array
        }

        if (position == 11) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_books_hi)
            return array
        }

        if (position == 12) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_political_science_books_hi)
            return array
        }

        if (position == 13) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_economic_books_hi)
            return array
        }

        if (position == 14) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_books_hi)
            return array
        }

        if (position == 15) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_books_hi)
            return array
        }

        if (position == 16) {
            val array : Array<String> = getApplication<Application>().resources.getStringArray(R.array.class12_heritagecrafts_books_hi)
            return array
        }

        else return emptyArray()
    }
}