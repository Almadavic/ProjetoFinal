
package Entidades;

import java.util.Scanner;


public class Caixa extends Funcionario  {
private Double salarioFinal; 
    public Caixa(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        
    }

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    
  
 

    public  Double calcularSalario ( double proventos,double descontos) {
        return salarioFinal=this.getSalario()+proventos-descontos;
    }


public void Format() {
    
    System.out.println("---------------------------");
    System.out.println("DADOS PARA O CAIXA");
    System.out.println("---------------------------");
    System.out.println("Matricula : "+getMatricula());
    System.out.println("Nome : "+getNome());
    System.out.println("Salário base : "+getSalario());
    System.out.println("Salário final : "+getSalarioFinal());
    System.out.println("--------------------------------------");

    
}

}
