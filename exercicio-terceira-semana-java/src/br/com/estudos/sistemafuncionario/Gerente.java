package br.com.estudos.sistemafuncionario;

public class Gerente extends Funcionario{
    private int quantidadeDePessoas;

    public Gerente(String id, String nome, double salario, int quantidadeDePessoas, String cargo) {
        super(id, nome, salario, cargo);
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

//    @Override
//    public void calcularBonus() {
//        //bônus didático de 15%
//    }

    @Override
    public void calcularBonus(double salario, double percentual) {
        double bonusCalculado = (salario * percentual) / 100;
        System.out.println("O valor do bônus é: R$ " + bonusCalculado);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou gerente de " + quantidadeDePessoas + " pessoas");
    }
}
