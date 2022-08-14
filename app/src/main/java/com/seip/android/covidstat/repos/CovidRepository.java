package com.seip.android.covidstat.repos;

import android.util.Log;

import com.seip.android.covidstat.callback.OnDataLoadListener;
import com.seip.android.covidstat.models.Country;
import com.seip.android.covidstat.network.CovidNetworkService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CovidRepository {
    public void getData(String country, OnDataLoadListener dataLoadListener) {
        // TODO: 2/6/2022 create the end url and make the network call
        // TODO: 2/6/2022 pass the loaded data to CovidViewModel using the dataLoadListener

//        final String endUrl = String.format("%s?yesterday=true&strict=true&query", country);
//        CovidNetworkService.getService().getCountryCovidData(endUrl).enqueue(new Callback<Country>() {
//            @Override
//            public void onResponse(Call<Country> call, Response<Country> response) {
//                if (response.code()==200){
//                    Log.e("weather_test", ""+response.code() );
//                    responseInfoLiveData.postValue(response.body());
//                } else if (response.code() == 404){
//                    errorMessageLiveData.postValue(response.message());
//                    Log.e("weather_test", ""+response.code() );
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Country> call, Throwable t) {
//                Log.e("weather_test", ""+t );
//            }
//        });
    }

    }

