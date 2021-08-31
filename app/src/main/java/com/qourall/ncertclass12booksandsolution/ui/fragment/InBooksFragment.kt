
package com.qourall.ncertclass12booksandsolution.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.activity.MainActivity
import com.qourall.ncertclass12booksandsolution.ui.adapters.InBooksAdapter
import com.qourall.ncertclass12booksandsolution.ui.viewModel.InBooksViewModel

class InBooksFragment : Fragment() {

    private val args: InBooksFragmentArgs by navArgs()
    private lateinit var inBooksViewModel : InBooksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inBooksViewModel = ViewModelProviders.of(this).get(InBooksViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_in_books, container, false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.in_books_recycler_view)
        val inBookLayoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = inBookLayoutManager
        recyclerView.setHasFixedSize(true)

        if(args.language == "English"){
            val inBooksArray = inBooksViewModel.InBooksDetailEn(args.position)
            recyclerView.adapter = InBooksAdapter(requireContext(), inBooksArray , ::onClickI)
        }
        else{
            val inBooksArray = inBooksViewModel.InBooksDetailHi(args.position)
            recyclerView.adapter = InBooksAdapter(requireContext(), inBooksArray , ::onClickI)
        }


        (activity as MainActivity).supportActionBar?.title = args.title


        return  root
    }


    private fun onClickI(position:Int, view : View){

        val title1 = args.title

        if (args.position == 0){
            val title = resources.getStringArray(R.array.class12_mathematics_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 1){
            val title = resources.getStringArray(R.array.class12_physics_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 2){
            val title = resources.getStringArray(R.array.class12_accountancy_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 3){
            val title = resources.getStringArray(R.array.class12_sanskrit_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 4){
            val title = resources.getStringArray(R.array.class12_hindi_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 5){
            val title = resources.getStringArray(R.array.class12_english_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 6){
            val title = resources.getStringArray(R.array.class12_biology_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 7){
            val title = resources.getStringArray(R.array.class12_history_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 8){
            val title = resources.getStringArray(R.array.class12_geography_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 9){
            val title = resources.getStringArray(R.array.class12_psychology_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 10){
            val title = resources.getStringArray(R.array.class12_sociology_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 11){
            val title = resources.getStringArray(R.array.class12_chemistry_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 12){
            val title = resources.getStringArray(R.array.class12_political_science_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 12){
            val title = resources.getStringArray(R.array.class12_economic_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 14){
            val title = resources.getStringArray(R.array.class12_businessstudies_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 15){
            val title = resources.getStringArray(R.array.class12_mathematics_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 16){
            val title = resources.getStringArray(R.array.class12_heritagecrafts_books)[position]
            details(position , title1 , title , view)
        }
        if (args.position == 17){
            val title = resources.getStringArray(R.array.class12_newagegraphicsdesign_books)[position]
            details(position , title1 , title , view)
        }
    }
    private fun details(position: Int, title1 : String, title : String, view: View ){
        val action = InBooksFragmentDirections.actionInBooksFragmentToIndexBookFragment(position , title1 , title, args.language)
        Navigation.findNavController(view).navigate(action)
    }
}
