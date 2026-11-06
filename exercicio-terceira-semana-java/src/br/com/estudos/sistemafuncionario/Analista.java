package br.com.estudos.sistemafuncionario;

public class Analista extends Funcionario {
    private String sistemaPrincipal;

    public Analista(String nome, double salario, String sistemaPrincipal, String cargo) {
        super(nome, salario, cargo);
        this.sistemaPrincipal = sistemaPrincipal;
    }

//    @Override
//    public void calcularBonus() {
//        // bônus didático de 8%
//    }

    @Override
    public void calcularBonus(double salario, double percentual) {
        double bonusCalculado = (salario * percentual) / 100;
        System.out.println("O valor do bônus é: R$ " + bonusCalculado);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou Analista especialista no sistema: " + sistemaPrincipal);
    }
}
