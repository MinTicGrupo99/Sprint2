package com.ciclo3.Sprint2.Models;

public class objectAnswer {

    private Object object;
    private String message;

    public objectAnswer(Object object, String message) {
        this.object = object;
        this.message = message;
    }

    public objectAnswer() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
