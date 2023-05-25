package com.kodlamaio.paymentservice.adapters;

import com.kodlamaio.commonpackage.utils.exceptions.BusinessException;
import com.kodlamaio.paymentservice.business.abstacts.PosService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FakePosServiceAdapter implements PosService {
    @Override
    public void pay() {
        boolean isPaymentSucessful = new Random().nextBoolean();
        if (isPaymentSucessful) {
            throw new BusinessException("PAYMENT_FAILED");
        }
    }
}