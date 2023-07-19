package com.example.bmi_2.presentation

import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel(){

    private val calculateBMIUseCase = CalculateBmiUseCase()

    fun calculateBMI(height: Float, weight: Float): Float {

        return calculateBMIUseCase.execute(height, weight)
    }
}