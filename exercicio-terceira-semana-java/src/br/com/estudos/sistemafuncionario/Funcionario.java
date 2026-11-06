package br.com.estudos.sistemafuncionario;

public abstract class Funcionario {
    private static int contadorDeIds = 1;
    private int id;
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {

        if (salario <= 0.0) {
            throw new SalarioInvalidoException("salario nao pode ser negativo ou zero");
        }
        this.nome = nome;
        this.salario = salario;
        this.id = contadorDeIds++;
        this.cargo = cargo;
    }

    public int getId(){
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