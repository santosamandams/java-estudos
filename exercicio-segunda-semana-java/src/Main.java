import br.com.estudos.segundasemana.Funcionario;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioJoao = new Funcionario("João", "Professor", 5000.0, "1");
        Funcionario funcionarioJoel = new Funcionario("Joel", "Desenvolvedor", 5000.0, "2");
        Funcionario funcionarioAmora = new Funcionario("Amora", "Segurança", 6000.0, "3");
        Funcionario funcionarioLara = new Funcionario("Lara", "Estudante", 2000.0, "4");
        Funcionario funcionarioAndre = new Funcionario("Andre", "Advogado", 22000.0, "5");
        Funcionario funcionario6 = new Funcionario("Fabiana", "Advogado", 22000.0, "6");

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
        funcionarios.add(funcionario6);
        int tamanhoDaLista = funcionarios.size();
//        System.out.println("tamanho da lista: " + tamanhoDaLista);

        String itemDaLista = funcionarios.get(0).getNome();
//       System.out.println("nome do funcionario: " + itemDaLista);

        // Set
//        Exercício 6 — Set de cargos repetidos
        Set<String> cargos = new HashSet<>();
        cargos.add("QA");
        cargos.add("DEV");
        cargos.add("QA");
        cargos.add("PM");
        int quantidadeDeCargos = cargos.size();
//        System.out.println(quantidadeDeCargos);

        // Map
//        Exercício 7 — Map de funcionários
        Map<String, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put("1", funcionarioJoel);
        funcionariosMap.put("2", funcionarioJoao);
        System.out.println(funcionariosMap.get("1").getNome());
        System.out.println(funcionariosMap.get("2").getNome());

        // for e for-each
        // percorre uma lista
        System.out.println(" ex");
//        for (Funcionario f: funcionarios){
//            f.exibirDados();
        funcionariosMap.get("1").getIdentificador();
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
//        Exercício 4 — Buscar funcionário
        System.out.println("---- Ex04: ");
        for (Funcionario f : funcionarios) {
            if (f.getNome().contains("Amora")) {
                f.exibirDados();
            } else {
                System.out.println("Funcionário " + f.getNome() + " não encontrado");
            }
        }
//        Exercício 5 — Remover funcionário
        System.out.println("---- Ex05: ");
        System.out.println("Quantidade de funcionarios atual: " + funcionarios.size());
        funcionarios.remove(0);
        System.out.println("Quantidade de funcionarios atual: " + funcionarios.size());

//        Exercício 8 — Interface
        System.out.println("---- Ex08: ");
//        funcionarioAmora.getIdentificador();
        funcionariosMap.get("1").getIdentificador();
        for (Map.Entry<String, Funcionario> entrada : funcionariosMap.entrySet()) {
            String chave = entrada.getKey();
            Funcionario f = entrada.getValue();

            System.out.println("Chave: " + chave + "Nome: " + f.getNome());
        }

        // DESAFIO SEMANA 2
        Scanner leitor = new Scanner(System.in);
        System.out.println("----- Menu ----- " + "\n" + "1 - Cadastrar funcionário" + "\n" + "2 - Listar funcionários" + "\n" + "3 - Buscar funcionário" + "\n" + "4 - Remover funcionário" + "\n" + "5 - Aumentar salário" + "\n" + "6 - Listar funcionários por cargo" + "\n" + "7 - Exibir quantidade" + "\n" + "8 - Buscar funcionário pelo ID" + "\n" + "9 - Sair" );
        System.out.println("!! Digite uma opçao...");
        int opcao = leitor.nextInt();
//        System.out.println("opçao escolhida: " + opcao);
//        leitor.close();
        boolean encontrado = false;

        switch(opcao) {
            case 1:
                System.out.println("opçao escolhida: " + opcao + " - Cadastrar funcionário");
//                System.out.println("opçao escolhida: " + opcao);
                Funcionario funcionarioNew = new Funcionario("Erika", "Jornalista", 5000.0, "6");
                funcionarios.add(funcionarioNew);
                funcionarioNew.exibirDados();
                break;
            case 2:
                System.out.println("opçao escolhida: " + opcao + " - Listar funcionários");
                for (Funcionario f: funcionarios){
                    f.exibirDados();
                }
                break;
            case 3:
                System.out.println("opçao escolhida: " + opcao + " - Buscar funcionário");
                System.out.println("digite nome para buscar: ");
                String nome = leitor.next();
//                leitor.close();
                for (Funcionario f : funcionarios) {
                    if (f.getNome().contains(nome)) {
                        f.exibirDados();
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Funcionário " + nome + " não encontrado");
                }
                break;
            case 4:
                System.out.println("opçao escolhida: " + opcao + " - Remover funcionário");
                System.out.println("digite nome para buscar: ");
                String nomeExcluir = leitor.next();

                Funcionario funcionarioExcluir = null;

                for (Funcionario f : funcionarios) {
                    if (f.getNome().contains(nomeExcluir)) {
                        f.exibirDados();
                        funcionarioExcluir = f;
                    }
                }
                if (funcionarioExcluir == null) {
                    System.out.println("Funcionário '" + nomeExcluir + "' não encontrado");
                }else {
                    funcionarios.remove(funcionarioExcluir);
                    System.out.println("Funcionário '" + nomeExcluir + "' foi removido da lista");
                }
                break;
            case 5:
                // code block
            case 6:
                System.out.println("opçao escolhida: " + opcao + " - Listar funcionários por cargo");
                break;
            case 7:
                System.out.println("opçao escolhida: " + opcao + " - Exibir quantidade");
                System.out.println("A lista possui: " + funcionarios.size() + " funcionários");
                break;
            case 8:
                System.out.println("opçao escolhida: " + opcao + " - Buscar funcionário pelo ID");
                System.out.println("Digite o ID do funcionário: ...");
                int idFunc = leitor.nextInt();
                leitor.close();
                if (idFunc > funcionarios.size()){
                    System.out.println("ID inexistente");
                } else {
                    funcionarios.get(idFunc).exibirDados();
                }
                break;
            default:
                System.out.println("opçao escolhida: " + opcao + "\n"+ "saindo...");

        }

    }
}