import br.com.estudos.primeirasemana.Funcionario;

import java.util.ArrayList;

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
        ana.exibirDados();

        System.out.println("--- Collections ---");

//        Funcionario joel = new Funcionario("", "Analista", -4000.0);
//        joel.exibirDados();
        ArrayList funcionarios = new ArrayList<>();
        int tamanhoDaLista = funcionarios.size();
        boolean estaVazio = funcionarios.isEmpty();
        funcionarios.add("Primeiro da Lista");
        System.out.println(tamanhoDaLista);
        System.out.println(estaVazio);
        System.out.println(funcionarios.get(0));

    }

}