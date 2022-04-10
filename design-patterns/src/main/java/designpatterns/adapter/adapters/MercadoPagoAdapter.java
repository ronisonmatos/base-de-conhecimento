package designpatterns.adapter.adapters;

import designpatterns.adapter.mercadoPago.MercadoPago;
import designpatterns.adapter.paypal.IPayPalPayments;
import designpatterns.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    Token token;
    MercadoPago mercadoPago;
    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendWithMercadoPagoPayment();
    }

    @Override
    public void paypalReceived() {
        this.mercadoPago.sendWithMercadoPagoPayment();
    }
}
