package ru.alexpryakhin.mtsapp;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.alexpryakhin.mtsapp.models.UserModel;

public interface ServerApi {
    @POST("login.php")
    Call<UserModel> authByLoginAndPass(@Query("login") String login, @Query("pass") String password);
}
