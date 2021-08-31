package com.qourall.ncertclass12booksandsolution.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.adapters.BooksAdapter
import com.qourall.ncertclass12booksandsolution.ui.viewModel.BooksViewModel

class NcertBooksHiFragment : Fragment() {

    private val booksViewModel : BooksViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_ncert_books_hi, container, false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.books_recycler_view_hi)
        val booksLayoutManager : GridLayoutManager = GridLayoutManager(requireContext() , 2 , LinearLayoutManager.VERTICAL , false)

        recyclerView.layoutManager = booksLayoutManager
        recyclerView.setHasFixedSize(true)

        val booksArray = booksViewModel.BooksDetail()
        recyclerView.adapter = BooksAdapter(requireContext() , booksArray , ::onClickI)
        return root

    }

    private fun onClickI(position:Int, view : View){
        Toast.makeText(requireContext() , position.toString() , Toast.LENGTH_SHORT).show()
        val action = NcertBooksHiFragmentDirections.actionNcertBooksHiFragmentToInBooksFragment(position , booksViewModel.BooksDetail()[position].text , "Hindi")
        Navigation.findNavController(view).navigate(action)
    }


    companion object {
        fun create(): NcertBooksHiFragment {
            return NcertBooksHiFragment()
        }
    }

}