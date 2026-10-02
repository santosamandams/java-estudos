import br.com.estudos.primeirasemana.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "Professor", 5000.0);
        funcionario.aumentarSalario(10.0);
        funcionario.exibirDados();
        funcionario.calcularSalarioAnual();

        Funcionario ana = new Funcionario("Ana", "Desenvolvedora", 5000.0);
        System.out.println("---------------------------------");

        System.out.println("Nome funcionario: " + ana.getNome());
        System.out.println("Cargo: " + ana.getCargo());
        System.out.println("Salario: " + ana.getSalario());

        System.out.println("---------------------------------");

        Funcionario joel = new Funcionario("", "Analista", -4000.0);
        joel.exibirDados();
    }

}