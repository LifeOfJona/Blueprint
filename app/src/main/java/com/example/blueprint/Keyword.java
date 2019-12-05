package com.example.blueprint;

import android.app.Application;

public class Keyword extends Application {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
