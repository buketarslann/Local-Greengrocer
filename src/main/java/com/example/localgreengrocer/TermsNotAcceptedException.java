package com.example.localgreengrocer;

public class TermsNotAcceptedException extends Exception {
    public TermsNotAcceptedException(String message) {
        super(message);
    }
}