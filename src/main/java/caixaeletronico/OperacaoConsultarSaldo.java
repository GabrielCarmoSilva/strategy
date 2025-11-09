package caixaeletronico;

public class OperacaoConsultarSaldo implements Operacao {

    public float fazerOperacao(float saldo, float valor){
        return saldo - (valor - valor);
    }
}
