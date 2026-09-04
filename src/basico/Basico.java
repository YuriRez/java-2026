package basico;

import java.sql.SQLOutput;

public class Basico {
   public static void main() {
       //exemplo for
     System.out.println("Lista de 1 até 10");
     for(int i=1; i<=10; i++){
         System.out.println(i);
     }
       System.out.println("FIM");
       System.out.println("\n\nLista de 10 até 1");
       //exemplo for decrescente
     for(int i=10; i>=1; i--){
         System.out.print(i + " ");
     }
       System.out.println("FIM");
           //versão crescente com while
           int numero = 1;
           System.out.println("\n\nLista de 1 até 10 em while:");
           while (numero <= 10) {
               System.out.println(numero);
               numero++;
           }
       System.out.println("FIM");
           //versão descrescente while
     numero=10;
       System.out.println("\n\nLista de 10 até 1 em while");
       while (numero>=1){
           System.out.println(numero);
           numero--;
       }
       System.out.println("FIM");
   }
}
