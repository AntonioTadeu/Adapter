package padroesestruturais.adapter;

public class Usuario {

    Conta Conta;
    TipoConta persistencia;

    public Usuario() {
        Conta = new Contapoupanca();
        persistencia = new TipoConta (Conta);
    }

    public void setConta(String poupanca) {
        Conta.setConta(poupanca);
        persistencia.salvarConta();
    }

    public String getConta() {
        return persistencia.recuperarConta();
    }

    public float getpoupanca() {
        return persistencia.getpoupanca();
    }

}
