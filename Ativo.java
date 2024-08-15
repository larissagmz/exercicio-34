public abstract class Ativo {
    private double salario;
    private Registro funcionario;

    public Ativo(double salario, Registro funcionario) {
        this.salario = salario;
        this.funcionario = funcionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Registro getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Registro funcionario) {
        this.funcionario = funcionario;
    }

    public void imprimir() {
    }
}
