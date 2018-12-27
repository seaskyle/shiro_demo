package com.le.shiro_demo.model;

public class ResponseJson {
    private Integer status;
    private String message;
    private Object data;

    public static ResponseJson ok() {
        return new ResponseJson(200, null, null);
    }
    public static ResponseJson ok(String message) {
        return new ResponseJson(200, message, null);
    }

    public static ResponseJson error(Integer status, String message) {
        return new ResponseJson(status, message, null);
    }
    public static ResponseJson error(Integer status, Object data) {
        return new ResponseJson(status, null, data);
    }

    public ResponseJson(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
