public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String especie, int idade, String genero, String raca){
        super(especie, idade, genero);
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;
    }
}
