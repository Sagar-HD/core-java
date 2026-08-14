package com.xworkz.dto;

public class FeedBackDto {
    private long mobile;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public FeedBackDto(String comment, long mobile) {
        this.comment = comment;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "FeedBackDto{" +
                "comment='" + comment + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
