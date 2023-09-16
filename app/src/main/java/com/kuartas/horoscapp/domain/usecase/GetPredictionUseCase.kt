package com.kuartas.horoscapp.domain.usecase

import com.kuartas.horoscapp.domain.model.PredictionModel
import com.kuartas.horoscapp.domain.repository.HoroscopeRepository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: HoroscopeRepository) {
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}