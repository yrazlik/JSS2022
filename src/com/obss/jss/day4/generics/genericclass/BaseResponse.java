package com.obss.jss.day4.generics.genericclass;

public class BaseResponse<T> {

    private T result;
    private long timestamp = System.currentTimeMillis();
    private String errorMessage = "SUCCESS";
    private Long errorCode;

    public BaseResponse(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "{" +
                "\"result\": " + result +
                ", \"timestamp\": " + timestamp +
                ", \"errorMessage\": \"" + errorMessage + "\"" +
                ", \"errorCode\": " + errorCode +
                '}';
    }
}

