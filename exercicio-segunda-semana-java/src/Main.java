import br.com.estudos.segundasemana.Funcionario;
import br.com.estudos.segundasemana.Identificavel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioJoao = new Funcionario("João", "Professor", 5000.0);
        Funcionario funcionarioJoel = new Funcionario("Joel", "Desenvolvedor", 5000.0);


        // ArrayList
        ArrayList <Funcionario> funcionarios = new ArrayList<>();
//        int tamanhoDaLista = funcionarios.size();
//        System.out.println("tamanho da lista: " + tamanhoDaLista);

        boolean estaVazio = funcionarios.isEmpty();
        System.out.println("a lista esta vazia? " + estaVazio);

        funcionarios.add(funcionarioJoao);
        funcionarios.add(funcionarioJoel);
        int tamanhoDaLista = funcionarios.size();
        System.out.println("tamanho da lista: " + tamanhoDaLista);

       String itemDaLista = funcionarios.get(0).getNome();
       System.out.println("nome do funcionario: " + itemDaLista);

       // Set

        Set <String> cargos = new HashSet<>();
        cargos.add("QA");
        cargos.add("DEV");
        cargos.add("QA");
        cargos.add("PM");
        int quantidadeDeCargos = cargos.size();
        System.out.println(quantidadeDeCargos);

        // Map
        Map <String, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put("0001", funcionarioJoel);
        funcionariosMap.put("0002", funcionarioJoao);
        System.out.println(funcionariosMap.get("0001").getNome());
        System.out.println(funcionariosMap.get("0002").getNome());

        // for e for-each
        // percorre uma lista
        for (Funcionario f: funcionarios){
            f.exibirDados();
        }
    }
}