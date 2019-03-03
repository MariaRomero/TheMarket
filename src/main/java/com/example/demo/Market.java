package com.example.demo;

public class Market {

    private final long id;
    private final String content;

    public Market(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
