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
import com.qourall.ncertclass12booksandsolution.Const
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.ui.activity.MainActivity
import com.qourall.ncertclass12booksandsolution.ui.adapters.IndexBooksAdapter
import com.qourall.ncertclass12booksandsolution.ui.viewModel.IndexViewModel
import com.rajat.pdfviewer.PdfViewerActivity

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

       if (args.language == "English"){
           var i = 0
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lemh1ps.pdf")
                   1 -> onChapterClick("lemh101.pdf")
                   2 -> onChapterClick("lemh102.pdf")
                   3 -> onChapterClick("lemh103.pdf")
                   4 -> onChapterClick("lemh104.pdf")
                   5 -> onChapterClick("lemh105.pdf")
                   6 -> onChapterClick("lemh106.pdf")
                   7 -> onChapterClick("lemh1a1.pdf")
                   8 -> onChapterClick("lemh1a2.pdf")
                   9 -> onChapterClick("lemh1an.pdf")
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lemh2ps.pdf")
                   1 -> onChapterClick("lemh201.pdf")
                   2 -> onChapterClick("lemh202.pdf")
                   3 -> onChapterClick("lemh203.pdf")
                   4 -> onChapterClick("lemh204.pdf")
                   5 -> onChapterClick("lemh205.pdf")
                   6 -> onChapterClick("lemh206.pdf")
                   7 -> onChapterClick("lemh207.pdf")
                   8 -> onChapterClick("lemh2an.pdf")
                   9 -> onChapterClick("lemh2sm.pdf")
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("leph1ps.pdf")
                   1 -> onChapterClick("leph101.pdf")
                   2 -> onChapterClick("leph102.pdf")
                   3 -> onChapterClick("leph103.pdf")
                   4 -> onChapterClick("leph104.pdf")
                   5 -> onChapterClick("leph105.pdf")
                   6 -> onChapterClick("leph106.pdf")
                   7 -> onChapterClick("leph107.pdf")
                   8 -> onChapterClick("leph108.pdf")
                   9 -> onChapterClick("leph1an.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("leph2ps.pdf")
                   1 -> onChapterClick("leph201.pdf")
                   2 -> onChapterClick("leph202.pdf")
                   3 -> onChapterClick("leph203.pdf")
                   4 -> onChapterClick("leph204.pdf")
                   5 -> onChapterClick("leph205.pdf")
                   6 -> onChapterClick("leph206.pdf")
                   7 -> onChapterClick("leph207.pdf")
                   8 -> onChapterClick("leph208.pdf")
               }
           }
           i += 1

                   if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("leac1ps.pdf")
                   1 -> onChapterClick("leac101.pdf")
                   2 -> onChapterClick("leac102.pdf")
                   3 -> onChapterClick("leac103.pdf")
                   4 -> onChapterClick("leac104.pdf")
                   5 -> onChapterClick("leac105.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("leac2ps.pdf")
                   1 -> onChapterClick("leac201.pdf")
                   2 -> onChapterClick("leac202.pdf")
                   3 -> onChapterClick("leac203.pdf")
                   4 -> onChapterClick("leac204.pdf")
                   5 -> onChapterClick("leac205.pdf")
                   6 -> onChapterClick("leac206.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhsk1ps.pdf")
                   1 -> onChapterClick("lhsk101.pdf")
                   2 -> onChapterClick("lhsk102.pdf")
                   3 -> onChapterClick("lhsk103.pdf")
                   4 -> onChapterClick("lhsk104.pdf")
                   5 -> onChapterClick("lhsk105.pdf")
                   6 -> onChapterClick("lhsk106.pdf")
                   7 -> onChapterClick("lhsk107.pdf")
                   8 -> onChapterClick("lhsk108.pdf")
                   9 -> onChapterClick("lhsk109.pdf")
                   10 -> onChapterClick("lhsk110.pdf")
                   11 -> onChapterClick("lhsk111.pdf")
                   12 -> onChapterClick("lhsk112.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhsk2ps.pdf")
                   1 -> onChapterClick("lhsk201.pdf")
                   2 -> onChapterClick("lhsk202.pdf")
                   3 -> onChapterClick("lhsk203.pdf")
                   4 -> onChapterClick("lhsk204.pdf")
                   5 -> onChapterClick("lhsk205.pdf")
                   6 -> onChapterClick("lhsk206.pdf")
                   7 -> onChapterClick("lhsk207.pdf")
                   8 -> onChapterClick("lhsk208.pdf")
                   9 -> onChapterClick("lhsk209.pdf")
                   10 -> onChapterClick("lhsk210.pdf")
                   11 -> onChapterClick("lhsk211.pdf")
                   12 -> onChapterClick("lhsk212.pdf")
                   13 -> onChapterClick("lhsk213.pdf")
                   14 -> onChapterClick("lhsk214.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhat1ps.pdf")
                   1 -> onChapterClick("lhat101.pdf")
                   2 -> onChapterClick("lhat102.pdf")
                   3 -> onChapterClick("lhat103.pdf")
                   4 -> onChapterClick("lhat104.pdf")
                   5 -> onChapterClick("lhat105.pdf")
                   6 -> onChapterClick("lhat106.pdf")
                   7 -> onChapterClick("lhat107.pdf")
                   8 -> onChapterClick("lhat108.pdf")
                   9 -> onChapterClick("lhat109.pdf")
                   10 -> onChapterClick("lhat110.pdf")
                   11 -> onChapterClick("lhat111.pdf")
                   12 -> onChapterClick("lhat112.pdf")
                   13 -> onChapterClick("lhat113.pdf")
                   14 -> onChapterClick("lhat114.pdf")
                   15 -> onChapterClick("lhat115.pdf")
                   16 -> onChapterClick("lhat116.pdf")
                   17 -> onChapterClick("lhat117.pdf")
                   18 -> onChapterClick("lhat118.pdf")
                   19 -> onChapterClick("lhat119.pdf")
                   20 -> onChapterClick("lhat120.pdf")
                   21 -> onChapterClick("lhat121.pdf")            }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhar1ps.pdf")
                   1 -> onChapterClick("lhar101.pdf")
                   2 -> onChapterClick("lhar102.pdf")
                   3 -> onChapterClick("lhar103.pdf")
                   4 -> onChapterClick("lhar104.pdf")
                   5 -> onChapterClick("lhar105.pdf")
                   6 -> onChapterClick("lhar106.pdf")
                   7 -> onChapterClick("lhar107.pdf")
                   8 -> onChapterClick("lhar108.pdf")
                   9 -> onChapterClick("lhar109.pdf")
                   10 -> onChapterClick("lhar110.pdf")
                   11 -> onChapterClick("lhar111.pdf")
                   12 -> onChapterClick("lhar112.pdf")
                   13 -> onChapterClick("lhar113.pdf")
                   14 -> onChapterClick("lhar114.pdf")
                   15 -> onChapterClick("lhar115.pdf")
                   16 -> onChapterClick("lhar116.pdf")
                   17 -> onChapterClick("lhar117.pdf")
                   18 -> onChapterClick("lhar118.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhvt1ps.pdf")
                   1 -> onChapterClick("lhvt101.pdf")
                   2 -> onChapterClick("lhvt102.pdf")
                   3 -> onChapterClick("lhvt103.pdf")
                   4 -> onChapterClick("lhvt104.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhan1ps.pdf")
                   1 -> onChapterClick("lhan101.pdf")
                   2 -> onChapterClick("lhan102.pdf")
                   3 -> onChapterClick("lhan103.pdf")
                   4 -> onChapterClick("lhan104.pdf")
               }
           }
           i += 1

           //English
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lebo1ps.pdf")
                   1 -> onChapterClick("lebo101.pdf")
                   2 -> onChapterClick("lebo102.pdf")
                   3 -> onChapterClick("lebo103.pdf")
                   4 -> onChapterClick("lebo104.pdf")
                   5 -> onChapterClick("lebo105.pdf")
                   6 -> onChapterClick("lebo106.pdf")
                   7 -> onChapterClick("lebo107.pdf")
                   8 -> onChapterClick("lebo108.pdf")
                   9 -> onChapterClick("lebo109.pdf")
                   10 -> onChapterClick("lebo110.pdf")
                   11 -> onChapterClick("lebo111.pdf")
                   12 -> onChapterClick("lebo112.pdf")
                   13 -> onChapterClick("lebo113.pdf")
                   14 -> onChapterClick("lebo114.pdf")
                   15 -> onChapterClick("lebo115.pdf")
                   16 -> onChapterClick("lebo116.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lehs1ps.pdf")
                   1 -> onChapterClick("lehs101.pdf")
                   2 -> onChapterClick("lehs102.pdf")
                   3 -> onChapterClick("lehs103.pdf")
                   4 -> onChapterClick("lehs104.pdf")

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lehs2ps.pdf")
                   1 -> onChapterClick("lehs201.pdf")
                   2 -> onChapterClick("lehs202.pdf")
                   3 -> onChapterClick("lehs203.pdf")
                   4 -> onChapterClick("lehs204.pdf")
                   5 -> onChapterClick("lehs205.pdf")

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lehs3ps.pdf")
                   1 -> onChapterClick("lehs301.pdf")
                   2 -> onChapterClick("lehs302.pdf")
                   3 -> onChapterClick("lehs303.pdf")
                   4 -> onChapterClick("lehs304.pdf")
                   5 -> onChapterClick("lehs305.pdf")
                   6 -> onChapterClick("lehs306.pdf")

               }
           }
           i += 1

       }


       else
       {
           var i = 0

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhmh1ps.pdf")
                   1 -> onChapterClick("lhmh101.pdf")
                   2 -> onChapterClick("lhmh102.pdf")
                   3 -> onChapterClick("lhmh103.pdf")
                   4 -> onChapterClick("lhmh104.pdf")
                   5 -> onChapterClick("lhmh105.pdf")
                   6 -> onChapterClick("lhmh106.pdf")
                   7 -> onChapterClick("lhmh1a1.pdf")
                   8 -> onChapterClick("lhmh1a2.pdf")
                   9 -> onChapterClick("lhmh1an.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhmh2ps.pdf")
                   1 -> onChapterClick("lhmh201.pdf")
                   2 -> onChapterClick("lhmh202.pdf")
                   3 -> onChapterClick("lhmh203.pdf")
                   4 -> onChapterClick("lhmh204.pdf")
                   5 -> onChapterClick("lhmh205.pdf")
                   6 -> onChapterClick("lhmh206.pdf")
                   7 -> onChapterClick("lhmh2an.pdf")
               }
           }
           i += 1
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhph1ps.pdf")
                   1 -> onChapterClick("lhph101.pdf")
                   2 -> onChapterClick("lhph102.pdf")
                   3 -> onChapterClick("lhph103.pdf")
                   4 -> onChapterClick("lhph104.pdf")
                   5 -> onChapterClick("lhph105.pdf")
                   6 -> onChapterClick("lhph106.pdf")
                   7 -> onChapterClick("lhph107.pdf")
                   8 -> onChapterClick("lhph108.pdf")
                   9 -> onChapterClick("lhph1an.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhph2ps.pdf")
                   1 -> onChapterClick("lhph202.pdf")
                   2 -> onChapterClick("lhph203.pdf")
                   3 -> onChapterClick("lhph204.pdf")
                   4 -> onChapterClick("lhph205.pdf")
                   5 -> onChapterClick("lhph206.pdf")
                   6 -> onChapterClick("lhph207.pdf")
                   7 -> onChapterClick("lhph2an.pdf")
               }
           }

           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhac1ps.pdf")
                   1 -> onChapterClick("lhac101.pdf")
                   2 -> onChapterClick("lhac102.pdf")
                   3 -> onChapterClick("lhac103.pdf")
                   4 -> onChapterClick("lhac104.pdf")
                   5 -> onChapterClick("lhac105.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhac2ps.pdf")
                   1 -> onChapterClick("lhac201.pdf")
                   2 -> onChapterClick("lhac202.pdf")
                   3 -> onChapterClick("lhac203.pdf")
                   4 -> onChapterClick("lhac204.pdf")
                   5 -> onChapterClick("lhac205.pdf")
                   6 -> onChapterClick("lhac206.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhsk1ps.pdf")
                   1 -> onChapterClick("lhsk101.pdf")
                   2 -> onChapterClick("lhsk102.pdf")
                   3 -> onChapterClick("lhsk103.pdf")
                   4 -> onChapterClick("lhsk104.pdf")
                   5 -> onChapterClick("lhsk105.pdf")
                   6 -> onChapterClick("lhsk106.pdf")
                   7 -> onChapterClick("lhsk107.pdf")
                   8 -> onChapterClick("lhsk108.pdf")
                   9 -> onChapterClick("lhsk109.pdf")
                   10 -> onChapterClick("lhsk110.pdf")
                   11 -> onChapterClick("lhsk111.pdf")
                   12 -> onChapterClick("lhsk112.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhsk2ps.pdf")
                   1 -> onChapterClick("lhsk201.pdf")
                   2 -> onChapterClick("lhsk202.pdf")
                   3 -> onChapterClick("lhsk203.pdf")
                   4 -> onChapterClick("lhsk204.pdf")
                   5 -> onChapterClick("lhsk205.pdf")
                   6 -> onChapterClick("lhsk206.pdf")
                   7 -> onChapterClick("lhsk207.pdf")
                   8 -> onChapterClick("lhsk208.pdf")
                   9 -> onChapterClick("lhsk209.pdf")
                   10 -> onChapterClick("lhsk210.pdf")
                   11 -> onChapterClick("lhsk211.pdf")
                   12 -> onChapterClick("lhsk212.pdf")
                   13 -> onChapterClick("lhsk213.pdf")
                   14 -> onChapterClick("lhsk214.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhat1ps.pdf")
                   1 -> onChapterClick("lhat101.pdf")
                   2 -> onChapterClick("lhat102.pdf")
                   3 -> onChapterClick("lhat103.pdf")
                   4 -> onChapterClick("lhat104.pdf")
                   5 -> onChapterClick("lhat105.pdf")
                   6 -> onChapterClick("lhat106.pdf")
                   7 -> onChapterClick("lhat107.pdf")
                   8 -> onChapterClick("lhat108.pdf")
                   9 -> onChapterClick("lhat109.pdf")
                   10 -> onChapterClick("lhat110.pdf")
                   11 -> onChapterClick("lhat111.pdf")
                   12 -> onChapterClick("lhat112.pdf")
                   13 -> onChapterClick("lhat113.pdf")
                   14 -> onChapterClick("lhat114.pdf")
                   15 -> onChapterClick("lhat115.pdf")
                   16 -> onChapterClick("lhat116.pdf")
                   17 -> onChapterClick("lhat117.pdf")
                   18 -> onChapterClick("lhat118.pdf")
                   19 -> onChapterClick("lhat119.pdf")
                   20 -> onChapterClick("lhat120.pdf")
                   21 -> onChapterClick("lhat121.pdf")            }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhar1ps.pdf")
                   1 -> onChapterClick("lhar101.pdf")
                   2 -> onChapterClick("lhar102.pdf")
                   3 -> onChapterClick("lhar103.pdf")
                   4 -> onChapterClick("lhar104.pdf")
                   5 -> onChapterClick("lhar105.pdf")
                   6 -> onChapterClick("lhar106.pdf")
                   7 -> onChapterClick("lhar107.pdf")
                   8 -> onChapterClick("lhar108.pdf")
                   9 -> onChapterClick("lhar109.pdf")
                   10 -> onChapterClick("lhar110.pdf")
                   11 -> onChapterClick("lhar111.pdf")
                   12 -> onChapterClick("lhar112.pdf")
                   13 -> onChapterClick("lhar113.pdf")
                   14 -> onChapterClick("lhar114.pdf")
                   15 -> onChapterClick("lhar115.pdf")
                   16 -> onChapterClick("lhar116.pdf")
                   17 -> onChapterClick("lhar117.pdf")
                   18 -> onChapterClick("lhar118.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhvt1ps.pdf")
                   1 -> onChapterClick("lhvt101.pdf")
                   2 -> onChapterClick("lhvt102.pdf")
                   3 -> onChapterClick("lhvt103.pdf")
                   4 -> onChapterClick("lhvt104.pdf")
               }
           }
           i += 1


           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhan1ps.pdf")
                   1 -> onChapterClick("lhan101.pdf")
                   2 -> onChapterClick("lhan102.pdf")
                   3 -> onChapterClick("lhan103.pdf")
                   4 -> onChapterClick("lhan104.pdf")
               }
           }
           i += 1
//English
           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhbo1ps.pdf")
                   1 -> onChapterClick("lhbo101.pdf")
                   2 -> onChapterClick("lhbo102.pdf")
                   3 -> onChapterClick("lhbo103.pdf")
                   4 -> onChapterClick("lhbo104.pdf")
                   5 -> onChapterClick("lhbo105.pdf")
                   6 -> onChapterClick("lhbo106.pdf")
                   7 -> onChapterClick("lhbo107.pdf")
                   8 -> onChapterClick("lhbo108.pdf")
                   9 -> onChapterClick("lhbo109.pdf")
                   10 -> onChapterClick("lhbo110.pdf")
                   11 -> onChapterClick("lhbo111.pdf")
                   12 -> onChapterClick("lhbo112.pdf")
                   13 -> onChapterClick("lhbo113.pdf")
                   14 -> onChapterClick("lhbo114.pdf")
                   15 -> onChapterClick("lhbo115.pdf")
                   16 -> onChapterClick("lhbo116.pdf")
               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhhs1ps.pdf")
                   1 -> onChapterClick("lhhs101.pdf")
                   2 -> onChapterClick("lhhs102.pdf")
                   3 -> onChapterClick("lhhs103.pdf")
                   4 -> onChapterClick("lhhs104.pdf")

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhhs2ps.pdf")
                   1 -> onChapterClick("lhhs201.pdf")
                   2 -> onChapterClick("lhhs202.pdf")
                   3 -> onChapterClick("lhhs203.pdf")
                   4 -> onChapterClick("lhhs204.pdf")
                   5 -> onChapterClick("lhhs205.pdf")

               }
           }
           i += 1

           if (args.titleTo == resources.getStringArray(R.array.class12_subjects_books)[i]){
               when(position){
                   0 -> onChapterClick("lhhs3ps.pdf")
                   1 -> onChapterClick("lhhs301.pdf")
                   2 -> onChapterClick("lhhs302.pdf")
                   3 -> onChapterClick("lhhs303.pdf")
                   4 -> onChapterClick("lhhs304.pdf")
                   5 -> onChapterClick("lhhs305.pdf")
                   6 -> onChapterClick("lhhs306.pdf")

               }
           }
           i += 1




       }

    }

    private fun onChapterClick(pdf : String){
        startActivity(

            // Use 'launchPdfFromPath' if you want to use assets file (enable "fromAssets" flag) / internal directory

            PdfViewerActivity.launchPdfFromUrl(           //PdfViewerActivity.Companion.launchPdfFromUrl(..   :: incase of JAVA
                context,
                Const.BASE_URL + pdf,                                // PDF URL in String format
                args.titleTo,                        // PDF Name/Title in String format
                ""                 // If nothing specific, Put "" it will save to Downloads
            )
        )
    }

}
