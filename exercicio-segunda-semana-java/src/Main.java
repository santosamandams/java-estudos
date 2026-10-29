import br.com.estudos.segundasemana.Funcionario;
import br.com.estudos.segundasemana.Identificavel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioJoao = new Funcionario("João", "Professor", 5000.0);
        Funcionario funcionarioJoel = new Funcionario("Joel", "Desenvolvedor", 5000.0);
        Funcionario funcionarioAmora = new Funcionario("Amora", "Segurança", 6000.0);
        Funcionario funcionarioLara = new Funcionario("Lara", "Estudante", 2000.0);
        Funcionario funcionarioAndre = new Funcionario("Andre", "Advogado", 22000.0);

        // ArrayList
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
//        int tamanhoDaLista = funcionarios.size();
//        System.out.println("tamanho da lista: " + tamanhoDaLista);

        boolean estaVazio = funcionarios.isEmpty();
//        System.out.println("a lista esta vazia? " + estaVazio);

        funcionarios.add(funcionarioJoao);
        funcionarios.add(funcionarioJoel);
        funcionarios.add(funcionarioAmora);
        funcionarios.add(funcionarioLara);
        funcionarios.add(funcionarioAndre);
        int tamanhoDaLista = funcionarios.size();
//        System.out.println("tamanho da lista: " + tamanhoDaLista);

        String itemDaLista = funcionarios.get(0).getNome();
//       System.out.println("nome do funcionario: " + itemDaLista);

        // Set
        Set<String> cargos = new HashSet<>();
        cargos.add("QA");
        cargos.add("DEV");
        cargos.add("QA");
        cargos.add("PM");
        int quantidadeDeCargos = cargos.size();
//        System.out.println(quantidadeDeCargos);

        // Map
        Map<String, Funcionario> funcionariosMap = new HashMap<>();
//        funcionariosMap.put("0001", funcionarioJoel);
//        funcionariosMap.put("0002", funcionarioJoao);
//        System.out.println(funcionariosMap.get("0001").getNome());
//        System.out.println(funcionariosMap.get("0002").getNome());

        // for e for-each
        // percorre uma lista
//        for (Funcionario f: funcionarios){
//            f.exibirDados();
//        }


//        Exercício 1 — Lista de nomes
        System.out.println("---- Ex01: ");
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Flora");
        listaNomes.add("Julia");
        listaNomes.add("Ana");
        listaNomes.add("Karol");
        listaNomes.add("Maria");

        for (String ln : listaNomes) {
            System.out.println(ln);
        }

        System.out.println("Primeiro item da lista: " + listaNomes.get(0));
        System.out.println("Ultimo item da lista: " + listaNomes.get(listaNomes.size() - 1));


//        Exercício 2 — Lista de números
        System.out.println("---- Ex02: ");
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(4);
        listaNumeros.add(250);
        int qtdeNum = 0;

        for (Integer ln : listaNumeros) {
            if (ln >= 10) {
                System.out.println(ln);
            }

            qtdeNum = qtdeNum + 1;

        }
        System.out.println(qtdeNum - 1);

//        Exercício 3 — Lista de Funcionarios
        System.out.println("---- Ex03: ");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
//        Exercício 4 — Buscar
        System.out.println("---- Ex04: ");
        for (Funcionario f : funcionarios) {
            if (f.getNome().contains("Amora")) {
                f.exibirDados();
            } else {
                System.out.println("Funcionário " + f.getNome() + " não encontrado");
            }
        }


    }
}