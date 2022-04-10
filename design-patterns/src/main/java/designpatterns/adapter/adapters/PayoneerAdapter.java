package designpatterns.adapter.adapters;

import designpatterns.adapter.payoneer.Payoneer;
import designpatterns.adapter.paypal.IPayPalPayments;
import designpatterns.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceived() {
        this.payoneer.receivePayment();
    }
}
