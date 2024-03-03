import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        ArrayList<Produto> productlist = new ArrayList<>();
        Produto produto1 = new Produto("Tesoura",4.99,2);
        Produto produto2 = new Produto("Cola",7.99,6);
        Produto produto3 = new Produto("Lapis",0.99,10);
        Produto produto4 = new Produto("Estojo",15.99,1);
        productlist.add(produto1);
        productlist.add(produto2);
        productlist.add(produto3);
        productlist.add(produto4);
        System.out.println(productlist.size());
        System.out.println(productlist.get(0));
        System.out.println(productlist);
        Produtoperecivel produto5 = new Produtoperecivel("Arroz", 19.99, 20, "15-09-2024");
        productlist.add(produto5);
        System.out.println(productlist);
        for(Produto item:productlist){
            System.out.println(item.getNome());
        }
        }
    }
