import br.com.estudos.sistemafuncionario.Analista;
import br.com.estudos.sistemafuncionario.Desenvolvedor;
import br.com.estudos.sistemafuncionario.Funcionario;
import br.com.estudos.sistemafuncionario.Gerente;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor func1 = new Desenvolvedor("1", "Jaqueline", 5000.00, "Go", "Desenvolvedor");
        Analista func2 = new Analista("2", "Joice", 15000.00, "Jira", "Analista");
        Gerente func3 = new Gerente("3", "Patricia", 50000.00, 160, "Gerente");

        List<Funcionario> ListaFuncionarios = new ArrayList<>();
        ListaFuncionarios.add(func1);
        ListaFuncionarios.add(func2);
        ListaFuncionarios.add(func3);


        for (Funcionario lf : ListaFuncionarios) {
            System.out.println(lf.getNome());
            lf.calcularBonus(lf.getSalario(), 10);
            lf.exibirTipo();
            System.out.println("---------");
        }

        // lambda
        ListaFuncionarios.forEach(lf -> System.out.println(lf.getNome() + " - " + lf.getCargo()));

        // filter
        List<Funcionario> salariosAltos = ListaFuncionarios.stream()
                .filter(lf -> lf.getSalario() > 5000)
                .toList();
        System.out.println(" \n ### Lista de salários maiores de 5K ###");
        salariosAltos.forEach(lf -> System.out.println("Lista de salários maiorires " + lf.getNome() + " - R$ " + lf.getSalario()));

        // map (chave + valor)
        Map<String, Funcionario> nomeFuncionsariosMap = new HashMap<>();
        nomeFuncionsariosMap.put(func1.getId(), func1);
        nomeFuncionsariosMap.put(func2.getId(), func2);
        nomeFuncionsariosMap.put(func3.getId(), func3);
        System.out.println(" \n ### Lista somente com nomes ###");
        nomeFuncionsariosMap.forEach((chave, nf) -> System.out.println(nf.getNome()));

        // sorted
        List<Funcionario> ordenadosPorSalario = ListaFuncionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
                .toList();
        System.out.println(" \n ### Lista de salários ordenados - MAIOR -> MENOR ###");
        ordenadosPorSalario.forEach(ordenados -> System.out.println("Lista de salários ordenados " + ordenados.getNome() + " - R$ " + ordenados.getSalario()));

    }
}