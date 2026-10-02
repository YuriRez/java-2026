package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;
        System.out.println(calc.n1);
        System.out.println(calc.n2);
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Produto: " + calc.multiplicar());
        System.out.println("Quociente: " + calc.dividir());
        calc.mostrarUltimoResultadoCalculado();

        //versão direta
        System.out.println("Soma: " + calc.somar(50, 100));
        System.out.println("Subtração: " + calc.subtrair(20, 100));
        System.out.println("Produto: " + calc.multiplicar(10, 10));
        System.out.println("Quociente: " + calc.dividir(100, 20));

        JOptionPane.showMessageDialog(null, calc.mostrarUltimoResultadoCalculado());
    }
}
