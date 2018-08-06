package ru.alexpryakhin.mtsapp;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MtsApp extends Application {

    private static ServerApi serverApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://umorili.herokuapp.com") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();

        serverApi = retrofit.create(ServerApi.class);
    }

    public static ServerApi getApi() {
        return serverApi;
    }
}
