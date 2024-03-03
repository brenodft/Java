public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }
}
