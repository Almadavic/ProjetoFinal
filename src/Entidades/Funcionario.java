
package Entidades;


public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    private double SalarioFinal=0;
    

    public Funcionario(int matricula, String nome, double salario,double SalarioFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.SalarioFinal=SalarioFinal;
    }

    public double getSalarioFinal() {
        return SalarioFinal;
    }

    public void setSalarioFinal(double SalarioFinal) {
        this.SalarioFinal = SalarioFinal;
    }

    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }




}
