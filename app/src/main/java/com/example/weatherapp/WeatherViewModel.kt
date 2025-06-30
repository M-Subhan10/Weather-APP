package com.example.weatherapp

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.api.NetworkResponse
import com.example.weatherapp.api.RetrofitInstance
import com.example.weatherapp.api.WeatherModel
import com.example.weatherapp.api.constant
import kotlinx.coroutines.launch

class WeatherViewModel:ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherData = MutableLiveData <NetworkResponse<WeatherModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherData

    fun getData(city: String){

        _weatherData.value=NetworkResponse.Loading
        viewModelScope.launch {

            try{
                val response =weatherApi.getWeather(constant.apiKey,city)

                if(response.isSuccessful){
                    response.body()?.let{
                        _weatherData.value=NetworkResponse.success(it)
                    }
                }else{

                    _weatherData.value=NetworkResponse.error("Failed to fetch data")

                }
            }
            catch(e:Exception){
                _weatherData.value=NetworkResponse.error("Failed to fetch data")

            }
        }
    }
}