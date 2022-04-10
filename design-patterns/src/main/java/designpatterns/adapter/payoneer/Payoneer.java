package designpatterns.adapter.payoneer;

import designpatterns.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando Pagamentos com Payonner");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo Pagamento com Payonner");
    }
}
