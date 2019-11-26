package com.tae.androidclientspring_boot_webflux_security;

import com.tae.androidclientspring_boot_webflux_security.model.Login;
import com.tae.androidclientspring_boot_webflux_security.model.Token;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    @POST("authorize/login")
    Observable<Token> login (@Body Login login);

}