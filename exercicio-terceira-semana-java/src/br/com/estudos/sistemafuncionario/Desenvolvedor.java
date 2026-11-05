package br.com.estudos.sistemafuncionario;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String id, String nome, Double salario, String linguagemPrincipal) {
        super(id, nome, salario);

        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void calcularBonus(double salario, double percentual) {
        double bonusCalculado = (salario * percentual) / 100;
        System.out.println("O valor do bônus é: R$ " + bonusCalculado);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Minha linguagem principal: " + linguagemPrincipal);
    }
}
