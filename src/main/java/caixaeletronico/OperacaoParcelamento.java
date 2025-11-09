package caixaeletronico;

public class OperacaoParcelamento implements Operacao {

    public float fazerOperacao(float saldo, float valor){
        return saldo - (valor / 2);
    }
}
