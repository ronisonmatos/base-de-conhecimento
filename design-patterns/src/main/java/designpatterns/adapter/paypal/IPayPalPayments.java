package designpatterns.adapter.paypal;

import designpatterns.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceived();
}
