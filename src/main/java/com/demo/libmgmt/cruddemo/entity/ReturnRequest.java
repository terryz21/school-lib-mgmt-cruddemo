package com.demo.libmgmt.cruddemo.entity;

import java.util.Date;
import java.util.Objects;

public class ReturnRequest {
    private String requestId;
    private Date returnDate;
    private Long sid;

    public ReturnRequest() {}

    public ReturnRequest(String requestId, Date returnDate, Long sid) {
        this.requestId = requestId;
        this.returnDate = returnDate;
        this.sid = sid;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnRequest that = (ReturnRequest) o;
        return requestId.equals(that.requestId) &&
                returnDate.equals(that.returnDate) &&
                sid.equals(that.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, returnDate, sid);
    }
}
