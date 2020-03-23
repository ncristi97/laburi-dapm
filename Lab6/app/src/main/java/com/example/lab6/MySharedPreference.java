package com.example.lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
        //TODO
        settings=context.getSharedPreferences("Preferences",0);
        editor=settings.edit();
    }

    public void save(String text){
        //TODO
        editor.putString("scrie",text);
        editor.commit();
    }

    public String getValue(){
        //TODO
        return settings.getString("scrie",null);
    }

    public void clearSharedPreferences(){
        //TODO
        editor.clear();
        editor.commit();
    }
}
