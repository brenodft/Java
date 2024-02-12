import java.util.*;
public class JogoAdivinhacao {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int randomNumber = new Random().nextInt(100);
        int inputNumber;
        while(i<5){
            inputNumber = sc.nextInt();
            if (inputNumber == randomNumber){
                System.out.println("\nParabens! Voce acertou!\n");
                return;
            }
            if (inputNumber>randomNumber){
                System.out.println("\nO numero digitado é maior");
            } else{
                System.out.println("\nO numero digitado é menor");
            }
            i++;
        }
        System.out.println("Não foi dessa vez... Fica pra proxima!");
    }
}
