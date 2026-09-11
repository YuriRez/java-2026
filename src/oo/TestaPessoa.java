package oo;

public class TestaPessoa {
    public static void main(String[] args) {
        //cria objeto fulano a partir da classe pessoa
        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano da Silva";
        fulano.idade = 18;
        fulano.peso = 80.5;
        System.out.printf("%s tem %d anos e pesa %.2f kg!\n", fulano.nome, fulano.idade, fulano.peso);
        fulano.comer();
        fulano.dormir();
        fulano.respirar();

        System.out.println("====================================");

        Pessoa yuri = new Pessoa();
        yuri.nome = "Yuri Rezende de Oliveira";
        yuri.idade = 19;
        yuri.peso = 68.70;
        System.out.printf("%s tem %d anos e pesa %.2f kg!\n", yuri.nome, yuri.idade, yuri.peso);
        yuri.comer();
        yuri.dormir();
        yuri.respirar();
    }
}
