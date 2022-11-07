package com.seckill.web.exception;

public class BizException extends Exception{
    private String code;

    public BizException(String message, String code) {
        super(message);
        this.code = code;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException() {
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
