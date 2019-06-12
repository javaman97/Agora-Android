package org.aossie.agoraandroid.main.Remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://agora-rest-api.herokuapp.com/api/v1/auth/";

    private static Retrofit getRetrofitInstance() {

        Gson gson = new GsonBuilder().setLenient().create();

        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }



    public static APIService getAPIService() {
        return getRetrofitInstance().create(APIService.class);
    }


}
