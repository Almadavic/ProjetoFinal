
package Entidades;


public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected double salario;
    protected double SalarioFinal=0;
    public void calcularSalario() {
        
    }
    

    public Funcionario(int matricula, String nome, double salario,double SalarioFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.SalarioFinal=SalarioFinal;
    }
    
    public Funcionario(){
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
