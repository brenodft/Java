import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<ContaBancaria> listadecontas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1, 3153);
        ContaBancaria conta2 = new ContaBancaria(2, 2356);
        ContaBancaria conta3 = new ContaBancaria(3, 6576);
        ContaBancaria conta4 = new ContaBancaria(4, 6784);
        ContaBancaria conta5 = new ContaBancaria(5, 9765);
        ContaBancaria conta6 = new ContaBancaria(6, 3456);
        listadecontas.add(conta1);
        listadecontas.add(conta2);
        listadecontas.add(conta3);
        listadecontas.add(conta4);
        listadecontas.add(conta5);
        listadecontas.add(conta6);
        ContaBancaria maiorSaldo = listadecontas.get(0);
        for(ContaBancaria item:listadecontas){
            if(maiorSaldo.getSaldo() < item.getSaldo()){
                maiorSaldo = item;
            }
        }
        System.out.println("Maior saldo: "+maiorSaldo);

    }
}
