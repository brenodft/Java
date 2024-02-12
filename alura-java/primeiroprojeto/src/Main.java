//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        //Media calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lanámento
                """+anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int) media;
        System.out.println(classificacao);
    }
}