public class Pagamento {
    public void imprimir (Ativo servidor, Trabalhador trabalhador){
        System.out.println("\n---------------------------------------------------\n");
        servidor.imprimir();
        trabalhador.imprimir();
        System.out.printf("Salario Bruto %.2f%n", servidor.getSalario());
        System.out.printf("INSS %.2f%n", trabalhador.descontoINSS(servidor));
        System.out.printf("Salario (sem INSS) %.2f  Desconto efetivo: %.1f%%%n", trabalhador.salarioDescontadoInss(servidor),
                trabalhador.percentualDescontoEfetivo(servidor));
        System.out.printf(" IRRF %.2f  ( %.1f%%)%n", trabalhador.descontoIRRF(servidor), trabalhador.percentualDescontoIRRF(servidor));
        System.out.printf("Salario liquido %.2f%n", trabalhador.salarioLiquido(servidor));
        System.out.println("-------------------------------------------------\n");
    }
}
