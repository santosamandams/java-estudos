package br.com.estudos.sistemafuncionario;

public abstract class Funcionario {
    private String id;
    private String nome;
    private double salario;

    public Funcionario(String id, String nome, double salario) {

        if (salario <= 0.0) {
            throw new IllegalArgumentException("salario nao pode ser negativo ou zero");
        }
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public String getId(){
        return id;
    };

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

//    public abstract void calcularBonus(double salario);

    public abstract void calcularBonus(double salario, double percentual);

    public abstract void exibirTipo();
}