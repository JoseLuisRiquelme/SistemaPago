import cl.praxis.interfaces.Pago;
import cl.praxis.pagos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pago> pagoMasivo = new ArrayList<Pago>();


        pagoMasivo.add( new PagoTarjetaCredito(1234,"Julio Cesar","02-03-35"));
        pagoMasivo.add( new PagoPaypal("Micorreo@micorreo.cl","Micontrasenha"));
        pagoMasivo.add( new PagoTransferenciaBancaria(123456,"Banco de la plaza"));
        pagoMasivo.add( new PagoBitcoin("DSFDSF","micorreo@micorreo.cl"));

        ProcesadorPagos procesador = new ProcesadorPagos();

        for(Pago pago: pagoMasivo){

            procesador.procesar(pago,100000);
        }
    }
}