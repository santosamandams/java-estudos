package br.com.estudos.sistemafuncionario;

abstract class Funcionario {
    int id;
    String nome;
    Double salario;

    public abstract void calcularBonus();
}