package desafio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Breno";
        pessoa1.idade = 19;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        System.out.println(pessoas);
    }
}