public class ContaBancaria{
    private int numeroconta;
    private double saldo;

    public ContaBancaria(int numero, double saldo){
        this.numeroconta=numero;
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numeroconta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Numero: "+getNumero()+ " Saldo: R$"+ getSaldo();
    }
}