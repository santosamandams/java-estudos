package br.com.estudos.sistemafuncionario;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String id, String nome, Double salario, String linguagemPrincipal, String cargo) {
        super(id, nome, salario, cargo);

        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void calcularBonus(double salario, double percentual) {
        if (percentual <= 0.0 || percentual > 100.0) {
            throw new IllegalArgumentException("Percentual inválido. O aumento não foi aplicado.");
        } else {
            double bonusCalculado = (salario * percentual) / 100;
            System.out.println("O valor do bônus é: R$ " + bonusCalculado);
        }
    }

    @Override
    public void exibirTipo() {
        System.out.println("Desenvolvo linguagem principal: " + linguagemPrincipal);
    }
}
