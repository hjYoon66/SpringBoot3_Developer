package me.hjyoon.springdeveloper.config.error.exception;

import me.hjyoon.springdeveloper.config.error.ErrorCode;

public class CustomBaseException extends RuntimeException {
    private final ErrorCode errorCode;

    public CustomBaseException(String message, ErrorCode errorCode){
        super(message);
        this.errorCode = errorCode;
    }
    public CustomBaseException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
