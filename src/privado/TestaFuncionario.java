package privado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario("Fulano da Silva", 25, 1234.56);

        //fulano.setNome("Fulano da Silva");
        //fulano.setIdade(25);
        //fulano.setSalario(1234.56);
        System.out.println("Nome....:" + fulano.getNome());
        System.out.println("Idade....:" + fulano.getIdade());
        System.out.println("Salario....:" + fulano.getSalario());
    }
}
