package com.example.myfinalprojectmayu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random

private const val LAST_RANDOM_VALUR = "LAST_RANDOM_VALUR "

class SeasonFragment : Fragment() {
    private lateinit var seasonImegView: ImageView
    private lateinit var randomizeButton:  Button

    private  var randomYear= 1



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_season, container, false)

          seasonImegView = view.findViewById(R.id.time_year)
          randomizeButton = view.findViewById(R.id.random_button1)

        if(savedInstanceState != null)

            romSeason(savedInstanceState.getInt(LAST_RANDOM_VALUR))


      randomizeButton.setOnClickListener{
         randomYear = Random.nextInt(1,4)
          romSeason(randomYear)
      }

        return view
    }

    private fun romSeason(randomYear: Int) {
        val randomYear = Random.nextInt(1, 4)
        seasonImegView.setImageResource(
            when (randomYear) {
                1 -> R.drawable.summer_icom
                2 -> R.drawable.spring_icom
                3 -> R.drawable.snow_icon
                4 -> R.drawable.autumn_icom
                else->R.drawable.summer_icom
            }
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_RANDOM_VALUR,randomYear)
        super.onSaveInstanceState(outState)
    }

}