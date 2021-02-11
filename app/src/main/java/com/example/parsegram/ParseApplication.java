package com.example.parsegram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jUkm66yAhpFExg7Qp1YcFDZZJu0Rr6Z7LucVVMMe")
                .clientKey("1NxbgAtWiEbOP0tNZHdM7DEhpfyXVkVUKzcPR0bS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
