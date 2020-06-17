package com.demo.libmgmt.cruddemo.entity;

import java.util.Date;

public class CheckOutRequest {
    private String requestId;
    private Date checkOutDate;
    private Date maxReturnDate;
    private Long sid;

    public CheckOutRequest() {}

    public CheckOutRequest(String requestId, Date checkOutDate, Date maxReturnDate, Long sid) {
        this.requestId = requestId;
        this.checkOutDate = checkOutDate;
        this.maxReturnDate = maxReturnDate;
        this.sid = sid;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getMaxReturnDate() {
        return maxReturnDate;
    }

    public void setMaxReturnDate(Date maxReturnDate) {
        this.maxReturnDate = maxReturnDate;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }
}
