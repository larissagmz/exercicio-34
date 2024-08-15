public class ServidoresPrivados extends Ativo {
    private Trabalhador trabalhador;

    public ServidoresPrivados(double salario, Registro funcionario, int anoIngressante) {
        super(salario, funcionario);
    }

   public void imprimir() {
        System.out.println("TRABALHADORES DA INICIATIVA PRIVADA ");
    }
}
