package ru.alexpryakhin.mtsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("tokenExpire")
    @Expose
    private Integer tokenExpire;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getTokenExpire() {
        return tokenExpire;
    }

    public void setTokenExpire(Integer tokenExpire) {
        this.tokenExpire = tokenExpire;
    }


}
