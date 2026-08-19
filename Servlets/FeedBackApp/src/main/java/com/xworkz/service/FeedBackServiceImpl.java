package com.xworkz.service;

import com.xworkz.dao.FeedBackDao;
import com.xworkz.dto.FeedBackDto;

public class FeedBackServiceImpl {
    private FeedBackDao feedBackDao;

    public FeedBackServiceImpl(FeedBackDao feedBackDao) {
        this.feedBackDao = feedBackDao;
    }
    public void validateAndSave(FeedBackDto feedBackDto){
        feedBackDao.save(feedBackDto);
    }
}
