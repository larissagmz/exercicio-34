public class ServidoresPublicos extends Ativo{
    private int anoIngressante;
    public ServidoresPublicos(double salario, Registro funcionario, int anoIngressante) {
        super(salario, funcionario);
        this.anoIngressante = anoIngressante;
    }
    @Override
    public void imprimir(){
        System.out.println("SERVIDORES PÚBLICOS");
    }
}
