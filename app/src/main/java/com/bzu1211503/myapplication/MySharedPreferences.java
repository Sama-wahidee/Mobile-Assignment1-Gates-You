package com.bzu1211503.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
    private static final String PREF_NAME = "MyPrefs";
    private static final String KEY_THEME = "theme";

    private SharedPreferences sharedPreferences;

    public MySharedPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setTheme(String theme) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_THEME, theme);
        editor.apply();
    }

    public String getTheme() {
        return sharedPreferences.getString(KEY_THEME, "");
    }
}
