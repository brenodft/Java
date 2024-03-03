import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<String> listadestrings = new ArrayList<>();
        String s1 = "teste1";
        String s2 = "teste2";
        String s3 = "teste3";
        listadestrings.add(s1);
        listadestrings.add(s2);
        listadestrings.add(s3);
        for(String item:listadestrings){
            System.out.println(item);
        }
        Cachorro cachorro1 = new Cachorro("Mamifero",1,"Macho","Pastor Alemao");        
}
}