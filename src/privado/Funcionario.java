package privado;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        if (this.nome == null) {
            return "Nome ainda não definido!";
        }
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}




