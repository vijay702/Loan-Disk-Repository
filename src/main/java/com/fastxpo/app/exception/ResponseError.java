package com.fastxpo.app.exception;

import org.springframework.http.HttpStatus;

public class ResponseError extends Exception{

    private String message;
    private HttpStatus httpStatus;
}
