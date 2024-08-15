public class ServidoreAntes2013 implements Trabalhador{
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
        }else if (servidor.getSalario() > 6101 && servidor.getSalario() < 10448){
            desconto = servidor.getSalario() * 0.145;
        }else if (servidor.getSalario() > 10448 && servidor.getSalario() < 20896){
            desconto = servidor.getSalario() * 0.16;
        }else if (servidor.getSalario() > 20896 && servidor.getSalario() < 40775) {
            desconto = servidor.getSalario() * 0.19;
        } else desconto = servidor.getSalario() * 0.20;
        return desconto;
    }

    @Override
    public double percentualDescontoEfetivo(Ativo servidor) {
        double desconto = 0;
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
            desconto = servidor.getSalario() - 3134;
            desconto = desconto * 0.14 + 297 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }else if (servidor.getSalario() > 6101 && servidor.getSalario() < 10448){

            desconto = servidor.getSalario() - 6101;
            desconto = desconto * 0.145 + 712 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }else if (servidor.getSalario() > 10448 && servidor.getSalario() < 18700){
            desconto = servidor.getSalario() - 10448;
            desconto = desconto * 0.16 + 1342 ;
            desconto = (desconto / servidor.getSalario()) * 100;
        }

        return desconto;
    }

    @Override
    public double salarioDescontadoInss(Ativo servidoresPrivados) {
        return servidoresPrivados.getSalario() - descontoINSS(servidoresPrivados);
    }

    @Override
    public double descontoIRRF(Ativo servidor) {
        double desconto ;
        if (salarioDescontadoInss(servidor) < 1913){
            desconto = 0;
        }
        if ( salarioDescontadoInss(servidor) > 1913 && salarioDescontadoInss(servidor) < 2826){
            desconto = salarioDescontadoInss(servidor) * 0.075;
        }else if (salarioDescontadoInss(servidor) > 2826 && salarioDescontadoInss(servidor) < 3751){
            desconto = salarioDescontadoInss(servidor) * 0.15;
        }else if ( salarioDescontadoInss(servidor) > 3751 &&  salarioDescontadoInss(servidor) < 4664){
            desconto = salarioDescontadoInss(servidor) * 0.225;
        }else  desconto = salarioDescontadoInss(servidor) *  0.27;
        return desconto;
    }

    @Override
    public double percentualDescontoIRRF(Ativo servidoresPrivados) {
        return salarioDescontadoInss(servidoresPrivados) / servidoresPrivados.getSalario();
    }

    @Override
    public double salarioLiquido(Ativo servidor) {
        return salarioDescontadoInss(servidor) - descontoINSS(servidor);
    }

    @Override
    public void imprimir() {
        System.out.println("FEDERAIS INGRESSANTES ANTES DE 2013:");
    }
}
