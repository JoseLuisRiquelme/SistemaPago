package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class PagoBitcoin implements Pago {

    private String monedero;

    private String correo;

    public PagoBitcoin() {

    }

    public PagoBitcoin(String monedero, String correo) {
        this.monedero = monedero;
        this.correo = correo;
    }

    public String getMonedero() {
        return monedero;
    }

    public void setMonedero(String monedero) {
        this.monedero = monedero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.printf("Pago mediante Bitcoin por$%.2f\'",cantidad);
    }
}
