package com.strikes.profileDemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class NotificationServiceImpl implements NotificationService{

    @Override
    public String send() {

        //Real Notification is sent
        return "Here is notification";
    }
}
