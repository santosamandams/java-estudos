package br.com.estudos.primeirasemana;
//import jakarta.validation.constraints.NotBlank;

public class Funcionario {

//    @NotBlank("O nome do funcionário não pode ser nulo/vazio")
    String nome;
    String cargo;
    Double salario;

    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public Double getSalario(){
        return salario;
    }

    public void aumentarSalario(double percentual){
        if (percentual <= 0.0 || percentual > 100.0) {
            System.out.println("Percentual inválido. O aumento não será aplicado.");
            return;
        }

        double salarioAtualizado = salario + (salario * percentual / 100);
        salario = salarioAtualizado;
        System.out.println("Salário atualizado: " + salario);
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário atual: " + salario);
    }

    public void calcularSalarioAnual(){
        double salarioAnual = salario * 12;
        System.out.println("Salário anual: " + salarioAnual);
    }
}
