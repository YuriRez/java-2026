package basico;
import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        int nota;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite uma nota de 0 a 10 [-1 para finalizar]:\n");
            nota = entrada.nextInt();
            if (nota < -1 || nota > 10){
                System.out.println("VALOR INVALIDO! TENTE NOVAMENTE!");
                continue;
            }
            if (nota == 1){
                break;
            }
            if (nota >= 7) {
                System.out.println("Passou direto!");
            } else if (nota >= 4 && nota < 7) {
                System.out.println("Pegou exame!");
            } else{
                System.out.println("Reprovou!");
            }
        } while (nota != -1);
        System.out.println("Encerrando o sistema");
    }
}