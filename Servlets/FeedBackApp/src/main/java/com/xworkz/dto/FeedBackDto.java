package com.xworkz.dto;

public class FeedBackDto {
    private int id;
    private int userId;
    private long mobile;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public FeedBackDto(String comment, long mobile, int userId) {
        this.comment = comment;
        this.mobile = mobile;
        this.userId=userId;
    }

    @Override
    public String toString() {
        return "FeedBackDto{" +
                "comment='" + comment + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
