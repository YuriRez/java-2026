package privado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario();
        fulano.setNome("Fulano da Silva");
        fulano.setIdade(25);
        fulano.setSalario(1234.56);
        System.out.println("Nome....:" + fulano.getNome());
        System.out.println("Idade....:" + fulano.getIdade());
        System.out.println("Salario....:" + fulano.getSalario());
    }
}
