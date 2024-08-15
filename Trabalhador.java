public interface Trabalhador {


    double descontoINSS(Ativo funcionario);
    double percentualDescontoEfetivo(Ativo servidor);
    double salarioDescontadoInss(Ativo servidoresPrivados);
    double descontoIRRF(Ativo servidoresPrivados);
    double percentualDescontoIRRF(Ativo servidoresPrivados);
    double salarioLiquido(Ativo servidor);
    void imprimir();
}
