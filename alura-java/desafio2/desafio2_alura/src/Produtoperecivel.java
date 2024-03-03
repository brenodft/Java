public class Produtoperecivel extends Produto {
    private String dataValidade;
    public Produtoperecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade); // Call to superclass constructor
        this.dataValidade = dataValidade;
    }
    String getDataValidade(){
        return this.dataValidade;
    }
    @Override
    public String toString() {
        return "Produto: "+this.getNome()+ " Preço: "+this.getPreco()+" Quantidade: "+this.getQuantidade()+ " Data de Validade: "+ this.dataValidade + " | ";
    }
}
