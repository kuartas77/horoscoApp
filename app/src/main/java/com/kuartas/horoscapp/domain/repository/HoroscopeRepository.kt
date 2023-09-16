package com.kuartas.horoscapp.domain.repository

import com.kuartas.horoscapp.domain.model.PredictionModel

interface HoroscopeRepository {
    suspend fun getPrediction(sign: String): PredictionModel?
}