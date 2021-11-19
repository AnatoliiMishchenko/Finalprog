package com.example.myfinalprojectmayu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

private const val LAST_RANDOM_VALUE = "LAST_RANDOM_VALUE"

class NumberFragment : Fragment() {

    private lateinit var resultTextView: TextView
    private lateinit var randomaizButtom: Button

    private var randomValue = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_number, container, false)
        resultTextView = view.findViewById(R.id.result_text)
        randomaizButtom = view.findViewById(R.id.random_button)

        if (savedInstanceState != null)
            resultTextView.text = savedInstanceState.getInt(LAST_RANDOM_VALUE).toString()
        else
            randomize()

        randomaizButtom.setOnClickListener { randomize() }



        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_RANDOM_VALUE, randomValue)
        super.onSaveInstanceState(outState)
    }

    private fun randomize() {
        randomValue = Random.nextInt(100)
        resultTextView.text = randomValue.toString()


    }

}