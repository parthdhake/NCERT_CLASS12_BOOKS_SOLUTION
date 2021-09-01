package com.qourall.ncertclass12booksandsolution.ui.activity

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.color.colorChooser
import com.google.android.material.navigation.NavigationView
import com.qourall.ncertclass12booksandsolution.R
import kotlinx.android.synthetic.main.app_bar_home.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

/*
        val colors = intArrayOf(RED, GREEN, BLUE , DKGRAY , MAGENTA , GRAY , CYAN , YELLOW)
*/
        val colors = intArrayOf(RED, GREEN, BLUE) // size = 3

        MaterialDialog(this).show {
            title(R.string.color)
            colorChooser(colors) { dialog, color ->
                if (color == RED){
                    setTheme(R.style.Red)
                }

            }
            positiveButton(R.string.select)
        }

        setContentView(R.layout.activity_main)

        setSupportActionBar(main_toolbar)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        val navController : NavController = findNavController(R.id.nav_host_fragment)


        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.ncertBooksEnFragment,
                R.id.ncertBooksHiFragment,
                R.id.ncertSolutionsFragment
            ), drawerLayout
        )


        setupActionBarWithNavController(navController , appBarConfiguration)
        navView.setupWithNavController(navController)

    }


    override fun onSupportNavigateUp() : Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}