package com.mystories.exception;

public class BookIdMismatchException extends RuntimeException  {

    public BookIdMismatchException() {
        super(message, cause);
    }
}
