package com.jordy.backend.resources.exception;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class StandardError implements Serializable {

    private Integer status;
    private String msg;
    private String timestamp;

    public StandardError(Integer status, String msg, String timestamp) {
        this.status = status;
        this.msg = msg;
        this.timestamp = timestamp;
    }
}
