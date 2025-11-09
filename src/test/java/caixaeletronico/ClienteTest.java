package caixaeletronico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveFazerDepositoCliente(){
        Cliente cliente = new Cliente();
        cliente.fazerDeposito(50.0f, 10.0f);
        assertEquals(60.0f, cliente.getSaldo());
    }

    @Test
    void deveFazerSaqueCliente(){
        Cliente cliente = new Cliente();
        cliente.fazerSaque(50.0f, 10.0f);
        assertEquals(40.0f, cliente.getSaldo());
    }

    @Test
    void deveFazerParcelamentoCliente(){
        Cliente cliente = new Cliente();
        cliente.fazerParcelamento(50.0f, 10.0f);
        assertEquals(45.0f, cliente.getSaldo());
    }

    @Test
    void deveFazerConsultaSaldoCliente(){
        Cliente cliente = new Cliente();
        cliente.fazerConsultaSaldo(50.0f, 0.0f);
        assertEquals(50.0f, cliente.getSaldo());
    }
}
