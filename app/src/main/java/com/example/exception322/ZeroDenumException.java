package com.example.exception322;

public class ZeroDenumException extends Exception{

    public ZeroDenumException() {
        this("Знаменатель не может быть равен 0");
    }

    public ZeroDenumException(String message) {
        super(message);
    }
}
