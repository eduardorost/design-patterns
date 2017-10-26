package com.patterns.patterns.adapter.services;

import com.patterns.patterns.PatternsApplication;
import com.patterns.patterns.adapter.models.Transfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TransferService implements TransferServiceInterface {

    private static final Logger logger = LoggerFactory.getLogger(PatternsApplication.class);

    @Override
    public void doTransfer(Transfer transfer) {
        logger.info("doing the transfer " + transfer);
    }
}
