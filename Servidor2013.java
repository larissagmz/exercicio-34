public class Servidor2013 implements Trabalhador{

    @Override
    public double descontoINSS(Ativo servidor) {
        double desconto;
        if (servidor.getSalario() <= 1045){
            desconto = servidor.getSalario() * 0.07;
        }else if (servidor.getSalario() > 1045 && servidor.getSalario() < 2089){
            desconto = servidor.getSalario() * 0.09;
        }else if (servidor.getSalario() > 2089 && servidor.getSalario() < 3134){
            desconto = servidor.getSalario() * 0.12;
        }else if (servidor.getSalario() > 3134 && servidor.getSalario() < 6101){
            desconto = servidor.getSalario() * 0.14;
        }else desconto = 735;

        return desconto;
    }


    @Override
    public double percentualDescontoEfetivo(Ativo servidor) {
        double desconto;
        if (servidor.getSalario() <= 1045){
           desconto = 7.5;
        }else if (servidor.getSalario() > 1045 && servidor.getSalario() < 2089){

            desconto = servidor.getSalario() - 1045;
            desconto = desconto * 0.09 + 78 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }else if (servidor.getSalario() > 2089 && servidor.getSalario() < 3134){
            desconto = servidor.getSalario() - 2089;
            desconto = desconto * 0.12 + 172 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }else if (servidor.getSalario() > 3134 && servidor.getSalario() < 6101){
            desconto = servidor.getSalario() - 2115;
            desconto = desconto * 0.14 + 297 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }else desconto = 735;

        return desconto;
    }

    @Override
    public double salarioDescontadoInss(Ativo servidor) {
        return servidor.getSalario() - descontoINSS(servidor);
    }

    @Override
    public double descontoIRRF(Ativo funcionario) {
        return 0;
    }

    @Override
    public double percentualDescontoIRRF(Ativo funcionario) {
        return 0;
    }

    @Override
    public double salarioLiquido(Ativo servidor) {
        return salarioDescontadoInss(servidor);
    }

    @Override
    public void imprimir() {
        System.out.println("FEDERAIS INGRESSANTES A PARTIR DE 2013");
    }
}
