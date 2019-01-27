package com.example.zulfa.arabiannights.model;

public class Page {
    private int imageId;
    private int textId;
    private Choice choice1;
    private Choice choice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2) {
        this.imageId = imageId;
        this.textId = text;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageId, String text) {
        this.imageId = imageId;
        this.textId = text;
        choice1 = null;
        choice2 = null;
        mIsFinal = true;

    }

    public int getImageId() {
        return imageId;
    }

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public void setImageId(int id) {
        imageId = id;
    }

}
