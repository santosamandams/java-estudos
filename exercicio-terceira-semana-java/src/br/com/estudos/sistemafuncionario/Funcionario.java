package br.com.estudos.sistemafuncionario;

public abstract class Funcionario {
    private String id;
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String id, String nome, double salario, String cargo) {

        if (salario <= 0.0) {
            throw new SalarioInvalidoException("salario nao pode ser negativo ou zero");
        }
        this.nome = nome;
        this.salario = salario;
        this.id = id;
        this.cargo = cargo;
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

    public String getCargo(){
        return cargo;
    }

//    public abstract void calcularBonus(double salario);

    public abstract void calcularBonus(double salario, double percentual);

    public abstract void exibirTipo();
}