package designpatterns.adapter.mercadoPago;

import designpatterns.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();
    void sendWithMercadoPagoPayment();
    void receiveWithMercadoPagoPayment();
}
