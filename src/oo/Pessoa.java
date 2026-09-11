package oo;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    //sem mais float, agora double

    public void comer() {
        System.out.printf("Sou %s e estou comendo!\n", nome);
    }
    public void dormir() {
        System.out.printf("Sou %s e estou indo dormir\n", nome);
    }
    public void respirar() {
        System.out.printf("Sou %s e estou respirando\n", nome);
    }

}