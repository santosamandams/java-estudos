import br.com.estudos.sistemafuncionario.Desenvolvedor;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("1", "Jaqueline", 5000.00,"Go");

        dev1.exibirTipo();
        dev1.calcularBonus(dev1.getSalario(), 10);
    }
}