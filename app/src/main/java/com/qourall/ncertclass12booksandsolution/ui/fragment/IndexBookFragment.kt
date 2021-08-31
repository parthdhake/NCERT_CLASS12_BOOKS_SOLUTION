package com.qourall.ncertclass12booksandsolution.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.activity.MainActivity
import com.qourall.ncertclass12booksandsolution.ui.activity.PdfActivity
import com.qourall.ncertclass12booksandsolution.ui.adapters.IndexBooksAdapter
import com.qourall.ncertclass12booksandsolution.ui.viewModel.IndexViewModel

class IndexBookFragment : Fragment() {

    private val args: IndexBookFragmentArgs by navArgs()
    private lateinit var indexViewModel : IndexViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        indexViewModel = ViewModelProviders.of(this).get(IndexViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_index_book, container, false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.index_books_recycler_view)
        val indexLayoutManager = LinearLayoutManager(requireContext() , LinearLayoutManager.VERTICAL , false)

        recyclerView.layoutManager = indexLayoutManager
        recyclerView.setHasFixedSize(true)


        (activity as MainActivity).supportActionBar?.title = args.titleTo

        if (args.language == "English"){
            val booksArray = indexViewModel.detailsEn(args.title , args.position)
            recyclerView.adapter = IndexBooksAdapter(requireContext() , booksArray , ::onClickI)
        }
        else{
            val booksArray = indexViewModel.detailsHi(args.title , args.position)
            recyclerView.adapter = IndexBooksAdapter(requireContext() , booksArray , ::onClickI)
        }
        return root
    }

    private fun onClickI(position:Int, view : View){

        val intent = Intent(requireContext() , PdfActivity::class.java)


       if (args.language == "English"){
           var i = 0
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lemh1ps.pdf" , intent)
                   1 -> intent("lemh101.pdf" , intent)
                   2 -> intent("lemh102.pdf" , intent)
                   3 -> intent("lemh103.pdf" , intent)
                   4 -> intent("lemh104.pdf" , intent)
                   5 -> intent("lemh105.pdf" , intent)
                   6 -> intent("lemh106.pdf" , intent)
                   7 -> intent("lemh1a1.pdf" , intent)
                   8 -> intent("lemh1a2.pdf" , intent)
                   9 -> intent("lemh1an.pdf" , intent)
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lemh2ps.pdf" , intent)
                   1 -> intent("lemh201.pdf" , intent)
                   2 -> intent("lemh202.pdf" , intent)
                   3 -> intent("lemh203.pdf" , intent)
                   4 -> intent("lemh204.pdf" , intent)
                   5 -> intent("lemh205.pdf" , intent)
                   6 -> intent("lemh206.pdf" , intent)
                   7 -> intent("lemh207.pdf" , intent)
                   8 -> intent("lemh2an.pdf" , intent)
                   9 -> intent("lemh2sm.pdf" , intent)
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("leph1ps.pdf" , intent)
                   1 -> intent("leph101.pdf" , intent)
                   2 -> intent("leph102.pdf" , intent)
                   3 -> intent("leph103.pdf" , intent)
                   4 -> intent("leph104.pdf" , intent)
                   5 -> intent("leph105.pdf" , intent)
                   6 -> intent("leph106.pdf" , intent)
                   7 -> intent("leph107.pdf" , intent)
                   8 -> intent("leph108.pdf" , intent)
                   9 -> intent("leph1an.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("leph2ps.pdf" , intent)
                   1 -> intent("leph201.pdf" , intent)
                   2 -> intent("leph202.pdf" , intent)
                   3 -> intent("leph203.pdf" , intent)
                   4 -> intent("leph204.pdf" , intent)
                   5 -> intent("leph205.pdf" , intent)
                   6 -> intent("leph206.pdf" , intent)
                   7 -> intent("leph207.pdf" , intent)
                   8 -> intent("leph208.pdf" , intent)
               }
           }
           i += 1

                   if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("leac1ps.pdf" , intent)
                   1 -> intent("leac101.pdf" , intent)
                   2 -> intent("leac102.pdf" , intent)
                   3 -> intent("leac103.pdf" , intent)
                   4 -> intent("leac104.pdf" , intent)
                   5 -> intent("leac105.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("leac2ps.pdf" , intent)
                   1 -> intent("leac201.pdf" , intent)
                   2 -> intent("leac202.pdf" , intent)
                   3 -> intent("leac203.pdf" , intent)
                   4 -> intent("leac204.pdf" , intent)
                   5 -> intent("leac205.pdf" , intent)
                   6 -> intent("leac206.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhsk1ps.pdf" , intent)
                   1 -> intent("lhsk101.pdf" , intent)
                   2 -> intent("lhsk102.pdf" , intent)
                   3 -> intent("lhsk103.pdf" , intent)
                   4 -> intent("lhsk104.pdf" , intent)
                   5 -> intent("lhsk105.pdf" , intent)
                   6 -> intent("lhsk106.pdf" , intent)
                   7 -> intent("lhsk107.pdf" , intent)
                   8 -> intent("lhsk108.pdf" , intent)
                   9 -> intent("lhsk109.pdf" , intent)
                   10 -> intent("lhsk110.pdf" , intent)
                   11 -> intent("lhsk111.pdf" , intent)
                   12 -> intent("lhsk112.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhsk2ps.pdf" , intent)
                   1 -> intent("lhsk201.pdf" , intent)
                   2 -> intent("lhsk202.pdf" , intent)
                   3 -> intent("lhsk203.pdf" , intent)
                   4 -> intent("lhsk204.pdf" , intent)
                   5 -> intent("lhsk205.pdf" , intent)
                   6 -> intent("lhsk206.pdf" , intent)
                   7 -> intent("lhsk207.pdf" , intent)
                   8 -> intent("lhsk208.pdf" , intent)
                   9 -> intent("lhsk209.pdf" , intent)
                   10 -> intent("lhsk210.pdf" , intent)
                   11 -> intent("lhsk211.pdf" , intent)
                   12 -> intent("lhsk212.pdf" , intent)
                   13 -> intent("lhsk213.pdf" , intent)
                   14 -> intent("lhsk214.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhat1ps.pdf" , intent)
                   1 -> intent("lhat101.pdf" , intent)
                   2 -> intent("lhat102.pdf" , intent)
                   3 -> intent("lhat103.pdf" , intent)
                   4 -> intent("lhat104.pdf" , intent)
                   5 -> intent("lhat105.pdf" , intent)
                   6 -> intent("lhat106.pdf" , intent)
                   7 -> intent("lhat107.pdf" , intent)
                   8 -> intent("lhat108.pdf" , intent)
                   9 -> intent("lhat109.pdf" , intent)
                   10 -> intent("lhat110.pdf" , intent)
                   11 -> intent("lhat111.pdf" , intent)
                   12 -> intent("lhat112.pdf" , intent)
                   13 -> intent("lhat113.pdf" , intent)
                   14 -> intent("lhat114.pdf" , intent)
                   15 -> intent("lhat115.pdf" , intent)
                   16 -> intent("lhat116.pdf" , intent)
                   17 -> intent("lhat117.pdf" , intent)
                   18 -> intent("lhat118.pdf" , intent)
                   19 -> intent("lhat119.pdf" , intent)
                   20 -> intent("lhat120.pdf" , intent)
                   21 -> intent("lhat121.pdf" , intent)            }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhar1ps.pdf" , intent)
                   1 -> intent("lhar101.pdf" , intent)
                   2 -> intent("lhar102.pdf" , intent)
                   3 -> intent("lhar103.pdf" , intent)
                   4 -> intent("lhar104.pdf" , intent)
                   5 -> intent("lhar105.pdf" , intent)
                   6 -> intent("lhar106.pdf" , intent)
                   7 -> intent("lhar107.pdf" , intent)
                   8 -> intent("lhar108.pdf" , intent)
                   9 -> intent("lhar109.pdf" , intent)
                   10 -> intent("lhar110.pdf" , intent)
                   11 -> intent("lhar111.pdf" , intent)
                   12 -> intent("lhar112.pdf" , intent)
                   13 -> intent("lhar113.pdf" , intent)
                   14 -> intent("lhar114.pdf" , intent)
                   15 -> intent("lhar115.pdf" , intent)
                   16 -> intent("lhar116.pdf" , intent)
                   17 -> intent("lhar117.pdf" , intent)
                   18 -> intent("lhar118.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhvt1ps.pdf" , intent)
                   1 -> intent("lhvt101.pdf" , intent)
                   2 -> intent("lhvt102.pdf" , intent)
                   3 -> intent("lhvt103.pdf" , intent)
                   4 -> intent("lhvt104.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhan1ps.pdf" , intent)
                   1 -> intent("lhan101.pdf" , intent)
                   2 -> intent("lhan102.pdf" , intent)
                   3 -> intent("lhan103.pdf" , intent)
                   4 -> intent("lhan104.pdf" , intent)
               }
           }
           i += 1

           //English
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lebo1ps.pdf" , intent)
                   1 -> intent("lebo101.pdf" , intent)
                   2 -> intent("lebo102.pdf" , intent)
                   3 -> intent("lebo103.pdf" , intent)
                   4 -> intent("lebo104.pdf" , intent)
                   5 -> intent("lebo105.pdf" , intent)
                   6 -> intent("lebo106.pdf" , intent)
                   7 -> intent("lebo107.pdf" , intent)
                   8 -> intent("lebo108.pdf" , intent)
                   9 -> intent("lebo109.pdf" , intent)
                   10 -> intent("lebo110.pdf" , intent)
                   11 -> intent("lebo111.pdf" , intent)
                   12 -> intent("lebo112.pdf" , intent)
                   13 -> intent("lebo113.pdf" , intent)
                   14 -> intent("lebo114.pdf" , intent)
                   15 -> intent("lebo115.pdf" , intent)
                   16 -> intent("lebo116.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lehs1ps.pdf" , intent)
                   1 -> intent("lehs101.pdf" , intent)
                   2 -> intent("lehs102.pdf" , intent)
                   3 -> intent("lehs103.pdf" , intent)
                   4 -> intent("lehs104.pdf" , intent)

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lehs2ps.pdf" , intent)
                   1 -> intent("lehs201.pdf" , intent)
                   2 -> intent("lehs202.pdf" , intent)
                   3 -> intent("lehs203.pdf" , intent)
                   4 -> intent("lehs204.pdf" , intent)
                   5 -> intent("lehs205.pdf" , intent)

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lehs3ps.pdf" , intent)
                   1 -> intent("lehs301.pdf" , intent)
                   2 -> intent("lehs302.pdf" , intent)
                   3 -> intent("lehs303.pdf" , intent)
                   4 -> intent("lehs304.pdf" , intent)
                   5 -> intent("lehs305.pdf" , intent)
                   6 -> intent("lehs306.pdf" , intent)

               }
           }
           i += 1

       }


       else
       {
           var i = 0

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhmh1ps.pdf" , intent)
                   1 -> intent("lhmh101.pdf" , intent)
                   2 -> intent("lhmh102.pdf" , intent)
                   3 -> intent("lhmh103.pdf" , intent)
                   4 -> intent("lhmh104.pdf" , intent)
                   5 -> intent("lhmh105.pdf" , intent)
                   6 -> intent("lhmh106.pdf" , intent)
                   7 -> intent("lhmh1a1.pdf" , intent)
                   8 -> intent("lhmh1a2.pdf" , intent)
                   9 -> intent("lhmh1an.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhmh2ps.pdf" , intent)
                   1 -> intent("lhmh201.pdf" , intent)
                   2 -> intent("lhmh202.pdf" , intent)
                   3 -> intent("lhmh203.pdf" , intent)
                   4 -> intent("lhmh204.pdf" , intent)
                   5 -> intent("lhmh205.pdf" , intent)
                   6 -> intent("lhmh206.pdf" , intent)
                   7 -> intent("lhmh2an.pdf" , intent)
               }
           }
           i += 1
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhph1ps.pdf" , intent)
                   1 -> intent("lhph101.pdf" , intent)
                   2 -> intent("lhph102.pdf" , intent)
                   3 -> intent("lhph103.pdf" , intent)
                   4 -> intent("lhph104.pdf" , intent)
                   5 -> intent("lhph105.pdf" , intent)
                   6 -> intent("lhph106.pdf" , intent)
                   7 -> intent("lhph107.pdf" , intent)
                   8 -> intent("lhph108.pdf" , intent)
                   9 -> intent("lhph1an.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhph2ps.pdf" , intent)
                   1 -> intent("lhph202.pdf" , intent)
                   2 -> intent("lhph203.pdf" , intent)
                   3 -> intent("lhph204.pdf" , intent)
                   4 -> intent("lhph205.pdf" , intent)
                   5 -> intent("lhph206.pdf" , intent)
                   6 -> intent("lhph207.pdf" , intent)
                   7 -> intent("lhph2an.pdf" , intent)
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhac1ps.pdf" , intent)
                   1 -> intent("lhac101.pdf" , intent)
                   2 -> intent("lhac102.pdf" , intent)
                   3 -> intent("lhac103.pdf" , intent)
                   4 -> intent("lhac104.pdf" , intent)
                   5 -> intent("lhac105.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhac2ps.pdf" , intent)
                   1 -> intent("lhac201.pdf" , intent)
                   2 -> intent("lhac202.pdf" , intent)
                   3 -> intent("lhac203.pdf" , intent)
                   4 -> intent("lhac204.pdf" , intent)
                   5 -> intent("lhac205.pdf" , intent)
                   6 -> intent("lhac206.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhsk1ps.pdf" , intent)
                   1 -> intent("lhsk101.pdf" , intent)
                   2 -> intent("lhsk102.pdf" , intent)
                   3 -> intent("lhsk103.pdf" , intent)
                   4 -> intent("lhsk104.pdf" , intent)
                   5 -> intent("lhsk105.pdf" , intent)
                   6 -> intent("lhsk106.pdf" , intent)
                   7 -> intent("lhsk107.pdf" , intent)
                   8 -> intent("lhsk108.pdf" , intent)
                   9 -> intent("lhsk109.pdf" , intent)
                   10 -> intent("lhsk110.pdf" , intent)
                   11 -> intent("lhsk111.pdf" , intent)
                   12 -> intent("lhsk112.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhsk2ps.pdf" , intent)
                   1 -> intent("lhsk201.pdf" , intent)
                   2 -> intent("lhsk202.pdf" , intent)
                   3 -> intent("lhsk203.pdf" , intent)
                   4 -> intent("lhsk204.pdf" , intent)
                   5 -> intent("lhsk205.pdf" , intent)
                   6 -> intent("lhsk206.pdf" , intent)
                   7 -> intent("lhsk207.pdf" , intent)
                   8 -> intent("lhsk208.pdf" , intent)
                   9 -> intent("lhsk209.pdf" , intent)
                   10 -> intent("lhsk210.pdf" , intent)
                   11 -> intent("lhsk211.pdf" , intent)
                   12 -> intent("lhsk212.pdf" , intent)
                   13 -> intent("lhsk213.pdf" , intent)
                   14 -> intent("lhsk214.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhat1ps.pdf" , intent)
                   1 -> intent("lhat101.pdf" , intent)
                   2 -> intent("lhat102.pdf" , intent)
                   3 -> intent("lhat103.pdf" , intent)
                   4 -> intent("lhat104.pdf" , intent)
                   5 -> intent("lhat105.pdf" , intent)
                   6 -> intent("lhat106.pdf" , intent)
                   7 -> intent("lhat107.pdf" , intent)
                   8 -> intent("lhat108.pdf" , intent)
                   9 -> intent("lhat109.pdf" , intent)
                   10 -> intent("lhat110.pdf" , intent)
                   11 -> intent("lhat111.pdf" , intent)
                   12 -> intent("lhat112.pdf" , intent)
                   13 -> intent("lhat113.pdf" , intent)
                   14 -> intent("lhat114.pdf" , intent)
                   15 -> intent("lhat115.pdf" , intent)
                   16 -> intent("lhat116.pdf" , intent)
                   17 -> intent("lhat117.pdf" , intent)
                   18 -> intent("lhat118.pdf" , intent)
                   19 -> intent("lhat119.pdf" , intent)
                   20 -> intent("lhat120.pdf" , intent)
                   21 -> intent("lhat121.pdf" , intent)            }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhar1ps.pdf" , intent)
                   1 -> intent("lhar101.pdf" , intent)
                   2 -> intent("lhar102.pdf" , intent)
                   3 -> intent("lhar103.pdf" , intent)
                   4 -> intent("lhar104.pdf" , intent)
                   5 -> intent("lhar105.pdf" , intent)
                   6 -> intent("lhar106.pdf" , intent)
                   7 -> intent("lhar107.pdf" , intent)
                   8 -> intent("lhar108.pdf" , intent)
                   9 -> intent("lhar109.pdf" , intent)
                   10 -> intent("lhar110.pdf" , intent)
                   11 -> intent("lhar111.pdf" , intent)
                   12 -> intent("lhar112.pdf" , intent)
                   13 -> intent("lhar113.pdf" , intent)
                   14 -> intent("lhar114.pdf" , intent)
                   15 -> intent("lhar115.pdf" , intent)
                   16 -> intent("lhar116.pdf" , intent)
                   17 -> intent("lhar117.pdf" , intent)
                   18 -> intent("lhar118.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhvt1ps.pdf" , intent)
                   1 -> intent("lhvt101.pdf" , intent)
                   2 -> intent("lhvt102.pdf" , intent)
                   3 -> intent("lhvt103.pdf" , intent)
                   4 -> intent("lhvt104.pdf" , intent)
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhan1ps.pdf" , intent)
                   1 -> intent("lhan101.pdf" , intent)
                   2 -> intent("lhan102.pdf" , intent)
                   3 -> intent("lhan103.pdf" , intent)
                   4 -> intent("lhan104.pdf" , intent)
               }
           }
           i += 1
//English
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhbo1ps.pdf" , intent)
                   1 -> intent("lhbo101.pdf" , intent)
                   2 -> intent("lhbo102.pdf" , intent)
                   3 -> intent("lhbo103.pdf" , intent)
                   4 -> intent("lhbo104.pdf" , intent)
                   5 -> intent("lhbo105.pdf" , intent)
                   6 -> intent("lhbo106.pdf" , intent)
                   7 -> intent("lhbo107.pdf" , intent)
                   8 -> intent("lhbo108.pdf" , intent)
                   9 -> intent("lhbo109.pdf" , intent)
                   10 -> intent("lhbo110.pdf" , intent)
                   11 -> intent("lhbo111.pdf" , intent)
                   12 -> intent("lhbo112.pdf" , intent)
                   13 -> intent("lhbo113.pdf" , intent)
                   14 -> intent("lhbo114.pdf" , intent)
                   15 -> intent("lhbo115.pdf" , intent)
                   16 -> intent("lhbo116.pdf" , intent)
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhhs1ps.pdf" , intent)
                   1 -> intent("lhhs101.pdf" , intent)
                   2 -> intent("lhhs102.pdf" , intent)
                   3 -> intent("lhhs103.pdf" , intent)
                   4 -> intent("lhhs104.pdf" , intent)

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhhs2ps.pdf" , intent)
                   1 -> intent("lhhs201.pdf" , intent)
                   2 -> intent("lhhs202.pdf" , intent)
                   3 -> intent("lhhs203.pdf" , intent)
                   4 -> intent("lhhs204.pdf" , intent)
                   5 -> intent("lhhs205.pdf" , intent)

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> intent("lhhs3ps.pdf" , intent)
                   1 -> intent("lhhs301.pdf" , intent)
                   2 -> intent("lhhs302.pdf" , intent)
                   3 -> intent("lhhs303.pdf" , intent)
                   4 -> intent("lhhs304.pdf" , intent)
                   5 -> intent("lhhs305.pdf" , intent)
                   6 -> intent("lhhs306.pdf" , intent)

               }
           }
           i += 1




       }

        startActivity(intent)

    }

    private fun intent(pdf : String, intent: Intent){
        intent.putExtra("URL" , pdf)
    }

}
