package transferencia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    @Test
    public void realizarTransacao(){
        Cliente xuxa = new Cliente("Xuxa", "12345678", "1111111");
        Cliente silvioSantos = new Cliente("Silvio Sanos", "00987654321", "22222");

        Conta contaXuxa = new Conta("0025", "2254", 2500.00, xuxa);
        Conta contaSilvioSAntos = new Conta("0026", "2251", 3500.00, silvioSantos);

        contaXuxa.realizarTransferecia(1000.00, contaSilvioSAntos);
        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvioSAntos.getSaldo());

    }

}