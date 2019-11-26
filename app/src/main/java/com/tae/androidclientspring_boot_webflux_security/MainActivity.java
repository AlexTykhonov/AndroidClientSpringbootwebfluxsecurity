package com.tae.androidclientspring_boot_webflux_security;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tae.androidclientspring_boot_webflux_security.model.Login;
import com.tae.androidclientspring_boot_webflux_security.model.Token;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller.createApi().login(new Login("Andrew", "password"))
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s-> System.out.println("___________TOKEN__________"+s.getToken()), e-> System.out.println("     ERROR!!!     "+e));
    }


 // Home Task  на листочке написать от возникновения токена на сервере до места где мы его получили

    Subscriber <Token> subscriber = new Subscriber<Token>() {
        @Override
        public void onSubscribe(Subscription s) {

        }

        @Override
        public void onNext(Token token) {
            System.out.println("-----------------> this is token -->"+token);
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onComplete() {

        }
    };
}
