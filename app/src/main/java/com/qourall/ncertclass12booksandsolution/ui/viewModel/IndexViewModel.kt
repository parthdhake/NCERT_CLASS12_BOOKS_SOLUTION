package com.qourall.ncertclass12booksandsolution.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.qourall.ncertclass12booksandsolution.R

class IndexViewModel(application: Application) : AndroidViewModel(application) {


    fun detailsEn(title : String, position: Int): Array<String> {
        if (title == "Mathematics"){
            return math(position)
        }
        if (title == "Physics"){
            return physics(position)
        }
        if (title == "Accountancy"){
            return account(position)
        }
        if (title == "Sanskrit"){
            return sansk(position)
        }
        if (title == "Hindi"){
            return hindi(position)
        }
        if (title == "English"){
            return english(position)
        }
        if (title == "Biology"){
            return bio(position)
        }
        if (title == "History"){
            return hist(position)
        }
        if (title == "Geography"){
            return geo(position)
        }
        if (title == "Psychology"){
            return psycho(position)
        }
        if (title == "Sociology"){
            return socio(position)
        }
        if (title == "Chemistry"){
            return chem(position)
        }
        if (title == "Political Science"){
            return politics(position)
        }
        if (title == "Economics"){
            return economics(position)
        }
        if (title == "Business Studies"){
            return biz(position)
        }
        if (title == "Home and Science"){
            return home(position)
        }
        if (title == "Heritage Crafts"){
            return heritage(position)
        }
        if (title == "New Age Graphics Design"){
            return new(position)
        }

        else return emptyArray()
    }
    fun detailsHi(title : String, position: Int): Array<String> {
        if (title == "Mathematics"){
            return hmath(position)
        }
        if (title == "Physics"){
            return hphysics(position)
        }
        if (title == "Accountancy"){
            return haccount(position)
        }
        if (title == "Sanskrit"){
            return sansk(position)
        }
        if (title == "Hindi"){
            return hindi(position)
        }
        if (title == "English"){
            return english(position)
        }
        if (title == "Biology"){
            return hbio(position)
        }
        if (title == "History"){
            return hhist(position)
        }
        if (title == "Geography"){
            return hgeo(position)
        }
        if (title == "Psychology"){
            return hpsycho(position)
        }
        if (title == "Sociology"){
            return hsocio(position)
        }
        if (title == "Chemistry"){
            return hchem(position)
        }
        if (title == "Political Science"){
            return hpolitics(position)
        }
        if (title == "Economics"){
            return heconomics(position)
        }
        if (title == "Business Studies"){
            return hbiz(position)
        }
        if (title == "Home and Science"){
            return hhome(position)
        }
        if (title == "Heritage Crafts"){
            return hheritage(position)
        }
        if (title == "New Age Graphics Design"){
            return new(position)
        }

        else return emptyArray()
    }

    private fun math(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_ganit1_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_ganit2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hmath(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_ganit1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_ganit2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun physics(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_physics1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_physics2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_bhautiki1_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_bhautiki2_chapters)
            }
            else -> emptyArray()
        }
    }
    private fun hphysics(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_bhautiki1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_physics_bhautiki2_chapters)
            }
            else -> emptyArray()
        }
    }


    private fun account(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_accountacy1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_accountacy2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_lekhashastra1_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_lekhashastra2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun haccount(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_lekhashastra1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_accountancy_lekhashastra2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun sansk(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sanskrit_bhaswati_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sanskrit_shashwati_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hindi(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_hindi_aantra_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_hindi_aroh_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_hindi_vitan_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_hindi_aantral2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun english(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_english_kaliedoscope_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_english_flamingo_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_english_vistas_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun bio(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_biology_biology_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_biology_jeevvigyan_chapters)
            }
            else -> emptyArray()
        }
    }
    private fun hbio(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_biology_jeevvigyan_chapters)
            }
            else -> emptyArray()
        }
    }


    private fun hist(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_themesinindiahistory1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_themesinindiahistory2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_themesinindiahistory3_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay1_chapters)
            }
            4 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay2_chapters)
            }
            5 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay3_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hhist(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_history_bhartiyaitihskekuchvishay3_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun geo(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_fundamentalsofhumangeography_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_practicalworkingeography2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_manawbhugolkemulseddhant_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_bhugolmeprayogatmakkarya_chapters)
            }
            4 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_indianpeopleandeconomy_chapters)
            }
            5 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_bharatlogaurarthawyawastha_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hgeo(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_bhugolmeprayogatmakkarya_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_indianpeopleandeconomy_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_geography_bharatlogaurarthawyawastha_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun psycho(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_psychology_psychology_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_psychology_manovigyan_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hpsycho(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_psychology_manovigyan_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun socio(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_indiansociety_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_socialchangeanddevelopmentinindia_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_bhartiyasamaj_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_bhartmesamajikpariwartanaurvikas_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hsocio(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_bhartiyasamaj_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_sociology_bhartmesamajikpariwartanaurvikas_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun chem(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_chemisty1_chapters)
            }

            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_chemistry2_chapters)
            }

            else -> emptyArray()
        }
    }

    private fun hchem(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_rasayanvigyan1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_chemistry_rasayanvigyan2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun politics(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_contempraryworldpolitics_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_politicalscience2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_samkalinvishwrajneeti_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_swatantrabharatmerajneeti_chapters)
            }

            else -> emptyArray()
        }
    }

    private fun hpolitics(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_samkalinvishwrajneeti_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_political_science_swatantrabharatmerajneeti_chapters)
            }

            else -> emptyArray()
        }
    }

    private fun economics(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_introductorymicroconomics_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_introductorymacroconomics_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_vyashthiarthashastra_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_samashtyarthshastraekparichay_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun heconomics(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_vyashthiarthashastra_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_economic_samashtyarthshastraekparichay_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun biz(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_businessstudies1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_businessstudies2_chapters)
            }
            2 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_vyawsayaadhyayan1_chapters)
            }
            3 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_busisnessstudies_vyawsayaadhyayan2_chapters)
            }
            else -> emptyArray()
        }
    }


    private fun hbiz(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_businessstudies_vyawsayaadhyayan1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_busisnessstudies_vyawsayaadhyayan2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun home(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics2_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hhome(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics1_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_mathematics_mathematics2_chapters)
            }
            else -> emptyArray()
        }
    }
    private fun heritage(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_heritagecrafts_crafttraditionofindia_chapters)
            }
            1 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_heritagecrafts_bharatiyahastakalakiparamparae_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun hheritage(position: Int): Array<String> {
        return when (position) {

            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_heritagecrafts_bharatiyahastakalakiparamparae_chapters)
            }
            else -> emptyArray()
        }
    }

    private fun new(position: Int): Array<String> {
        return when (position) {
            0 -> {
                getApplication<Application>().resources.getStringArray(R.array.class12_newagegraphicsdesign_newagegraphicsesign_chapters)
            }
            else -> emptyArray()
        }
    }



}
