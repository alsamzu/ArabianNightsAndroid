package com.example.zulfa.arabiannights.model;

public class Choice {

    private int textId;
    private int nextPage;

    public Choice(String text, int nextPage) {
        textId = text;
        this.nextPage = nextPage;
    }

    public String getText() {
        return textId;
    }

    public void setText(String text) {
        textId = text;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
