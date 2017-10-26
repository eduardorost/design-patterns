package com.patterns.patterns.adapter;

import com.patterns.patterns.adapter.models.Transfer;
import com.patterns.patterns.adapter.services.PhoneTransferService;
import com.patterns.patterns.adapter.services.TransferServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InternalTransferAdapter implements TransferServiceInterface {

    @Autowired
    PhoneTransferService phoneTransferService;

    @Override
    public void doTransfer(Transfer transfer) {
        phoneTransferService.doTransfer(transfer.getValue(), getPhoneByTransfer(transfer));
    }

    private String getPhoneByTransfer(Transfer transfer) {
        return "51912345678";
    }

}
