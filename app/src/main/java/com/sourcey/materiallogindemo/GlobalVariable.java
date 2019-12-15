package com.sourcey.materiallogindemo;

import android.app.Application;

public class GlobalVariable extends Application {
    private boolean LoginToken;

    public void setLoginToken(boolean LoginToken){
        this.LoginToken=LoginToken;
    }

    public boolean getLoginToken(){
        return LoginToken;
    }
}
