package com.qourall.ncertclass12booksandsolution.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.krishna.fileloader.FileLoader
import com.krishna.fileloader.listener.FileRequestListener
import com.krishna.fileloader.pojo.FileResponse
import com.krishna.fileloader.request.FileLoadRequest
import com.qourall.ncertclass12booksandsolution.R
import com.qourall.ncertclass12booksandsolution.Const
import kotlinx.android.synthetic.main.activity_pdf.*
import java.io.File

class PdfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val url = Const.BASE_URL + intent.getStringExtra("URL")

        FileLoader.with(this)
            .load(url , false)
            .fromDirectory("PDFFile" , FileLoader.DIR_INTERNAL)
            .asFile(object : FileRequestListener<File>{
                override fun onLoad(request: FileLoadRequest?, response: FileResponse<File>?) {

                    progress_bar.visibility = View.GONE
                    val pdfFile = response!!.body

                    pdfView.fromFile(pdfFile)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .swipeHorizontal(false)
                        .enableDoubletap(true)
                        .defaultPage(0)
                        .scrollHandle(null)
                        // allows to draw something on the current page, usually visible in the middle of the screen
                        .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                        .password(null)
                        .scrollHandle(null)
                        .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                        // spacing between pages in dp. To define spacing color, set view background
                        .spacing(0)
                        .autoSpacing(false) // add dynamic spacing to fit each page on its own on the screen
                        .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                        .fitEachPage(false) // fit each page to the view, else smaller pages are scaled relative to largest page.
                        .pageSnap(false) // snap pages to screen boundaries
                        .pageFling(false) // make a fling change only a single page like ViewPager
                        .nightMode(false) // toggle night mode
                        .load()

                }

                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    progress_bar.visibility = View.GONE
                    Toast.makeText(this@PdfActivity , url , Toast.LENGTH_SHORT).show()
                }

            })

    }
}
