package designpatterns.adapter.payoneer;

import designpatterns.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
