public class Main {
    public static void main(String[] args) {
        ServidoresPrivados funcionario =  new ServidoresPrivados(5_000, new Registro("larissa", 18, "123")
                ,2012);
        Pagamento pagamento = new Pagamento();

        ServidoresPublicos servidor = new ServidoresPublicos(9_000, new Registro("lucas", 20,"432"),
                2000);

        pagamento.imprimir(servidor, new ServidoreAntes2013());

        pagamento.imprimir(funcionario, new Servidor2013());

    }
}
