import java.math.BigDecimal;

public class DadosBancarios {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public DadosBancarios(int numeroConta, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {

        return numeroConta;
    }

    public String getAgencia() {

        return agencia;
    }

    public String getNomeCliente() {

        return nomeCliente;
    }

    public BigDecimal getSaldo() {

        return saldo;
    }
}