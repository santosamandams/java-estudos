package br.com.estudos.sistemafuncionario;

public class Desenvolvedor extends Funcionario{
    String especialidade;

    public Desenvolvedor (int id, String nome, Double salario,String especilidade) {

    }

    @Override
    public void calcularBonus() {
        //bônus didático de 10%
    }
}
