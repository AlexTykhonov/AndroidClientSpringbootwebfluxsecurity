package com.tae.androidclientspring_boot_webflux_security;

import okhttp3.OkHttpClient;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {

    static final String BASE_URL = "https://fluxjwt.herokuapp.com/";

    private static retrofit2.Retrofit.Builder sBuilder =
            new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {

        retrofit2.Retrofit retrofit = sBuilder
                .client(new OkHttpClient.Builder().build())
                .build();
        return  retrofit.create(serviceClass);
}
        public static Api createApi() {
        return createService(Api.class);
        }
    }
