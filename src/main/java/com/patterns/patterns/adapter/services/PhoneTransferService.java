package com.patterns.patterns.adapter.services;

import com.patterns.patterns.PatternsApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PhoneTransferService {

    private static final Logger logger = LoggerFactory.getLogger(PatternsApplication.class);

    public void doTransfer(double value, String phone) {
        logger.info("doing the transfer with phone "+phone);
    }
}
