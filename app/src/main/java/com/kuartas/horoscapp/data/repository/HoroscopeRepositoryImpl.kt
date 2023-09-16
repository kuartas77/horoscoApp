package com.kuartas.horoscapp.data.repository

import android.util.Log
import com.kuartas.horoscapp.data.network.HoroscopeApiService
import com.kuartas.horoscapp.domain.model.PredictionModel
import com.kuartas.horoscapp.domain.repository.HoroscopeRepository
import javax.inject.Inject

class HoroscopeRepositoryImpl @Inject constructor(
    private val apiService: HoroscopeApiService
) : HoroscopeRepository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("getPrediction", "ha ocurrido un error ${it.message}") }
        return null
    }
}