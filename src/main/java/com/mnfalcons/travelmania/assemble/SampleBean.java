package com.mnfalcons.travelmania.assemble;

import com.mnfalcons.travelmania.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*******************************************************************************
 * ${FILE_NAME}
 * <p/>
 * Copyright 2015 Ameriprise Financial, Inc. All rights reserved.
 * Proprietary and Confidential. Use is subject to license terms.
 * <p/>
 * Created on : 9/20/2016
 * Author(s)  : ghanda1
 ******************************************************************************/
@Component
public class SampleBean {
    public SampleBean() {

    }
    @Autowired
    private PaymentService paymentService;

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
