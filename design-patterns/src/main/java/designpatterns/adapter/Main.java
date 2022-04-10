package designpatterns.adapter;

import designpatterns.adapter.adapters.MercadoPagoAdapter;
import designpatterns.adapter.adapters.PayoneerAdapter;
import designpatterns.adapter.mercadoPago.MercadoPago;
import designpatterns.adapter.payoneer.Payoneer;
import designpatterns.adapter.paypal.IPayPalPayments;
import designpatterns.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args){

        //IPayPalPayments payments = new Payoneer();

        IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
        payments.paypalReceived();
        payments.paypalReceived();

        // Exercício do curso
        IPayPalPayments payments1 = new MercadoPagoAdapter(new MercadoPago());
        payments1.paypalPayment();
        payments1.paypalReceived();

    }
}
