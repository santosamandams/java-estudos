import br.com.estudos.sistemafuncionario.Analista;
import br.com.estudos.sistemafuncionario.Desenvolvedor;
import br.com.estudos.sistemafuncionario.Funcionario;
import br.com.estudos.sistemafuncionario.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor func1 = new Desenvolvedor("1", "Jaqueline", 5000.00, "Go");
        Analista func2 = new Analista("2", "Joice", 15000.00, "Jira");
        Gerente func3 = new Gerente("3", "Patricia", 50000.00, 160);

//        func1.exibirTipo();
//        func1.calcularBonus(func1.getSalario(), 10);

        List<Funcionario> ListaFuncionarios = new ArrayList<>();
        ListaFuncionarios.add(func1);
        ListaFuncionarios.add(func2);
        ListaFuncionarios.add(func3);

        for (Funcionario lf : ListaFuncionarios) {
                lf.calcularBonus(lf.getSalario(), 3);
                lf.exibirTipo();
        }
    }
}