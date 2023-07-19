package com.example.bmi_2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.bmi_2.R
import com.example.bmi_2.presentation.BmiViewModel

class BmiFragment : Fragment(R.layout.fragment_bmi) {


    private val viewModel = BmiViewModel()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCalculate = view.findViewById<Button>(R.id.btnCalculate)
        val editHeight = view.findViewById<EditText>(R.id.editHeight)
        val editWeight = view.findViewById<EditText>(R.id.editWeight)
        val txtResult = view.findViewById<TextView>(R.id.txtResult)

        btnCalculate.setOnClickListener {
            val heightText = editHeight.text.toString().toFloatOrNull()
            val weightText = editWeight.text.toString().toFloatOrNull()

            if (heightText != null && weightText != null) {
                val bmi = viewModel.calculateBMI(heightText, weightText)
                txtResult.text = "Your result: $bmi"
            } else {
                txtResult.text = "Please enter valid height and weight."
            }
        }
    }
}