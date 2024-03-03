public class Animal {
   private String especie;
   private int idade;
   private String genero; 
   
   public Animal(String especie, int idade, String genero){
        this.especie = especie;
        this.idade = idade;
        this.genero = genero;
   }

   public String getEspecie(){
    return this.especie;
   }
   public int getIdade(){
    return this.idade;
   }
   public String getGenero(){
    return this.genero;
   }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "Especie: "+ getEspecie()+ " Idade: "+ getIdade()+ " Genero: "+getGenero();
   }
}
