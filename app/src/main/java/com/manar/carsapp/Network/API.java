package com.manar.carsapp.Network;
import retrofit2.Call;
import retrofit2.http.GET;


public interface API {

    @GET("http://demo1286023.mockable.io/api/v1/cars?page")
    Call<Response> getCar();

}
