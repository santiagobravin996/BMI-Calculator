package com.example.bmi_2.presentation

class CalculateBmiUseCase {
    fun execute(height: Float, weight: Float): Float {
        val heightInMeters = height / 100
        return weight / (heightInMeters * heightInMeters)
    }
}