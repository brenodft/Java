import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Breno");
        pessoa1.idade = 19;
        Pessoa pessoa2 = new Pessoa("Gabriela");
        pessoa2.idade = 18;
        Pessoa pessoa3 = new Pessoa("Bruno");
        pessoa3.idade = 30;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println(pessoas.size());
        System.out.println(pessoas);
        
    }
}
