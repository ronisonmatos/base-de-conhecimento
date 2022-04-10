package designpatterns.adapter.mercadoPago;

import designpatterns.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendWithMercadoPagoPayment() {
        System.out.println("Enviando Pagamentos com Mercado Pago");
    }

    @Override
    public void receiveWithMercadoPagoPayment() {
        System.out.println("Recebendo Pagamento com Mercado Pago");
    }
}
