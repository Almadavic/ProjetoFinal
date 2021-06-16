
package Entidades;

import java.util.Scanner;


public class Caixa extends Funcionario  {

    public Caixa(int matricula, String nome, double salario,double SalarioFinal) {
        super(matricula, nome, salario,SalarioFinal);
        
    }

    public Caixa(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

  
    

 

    public  double  calcularSalario ( double proventos,double descontos) {
       return  SalarioFinal=salario+proventos-descontos;
    
    }


public void Format() {
    
    System.out.println("---------------------------");
    System.out.println("DADOS PARA O CAIXA");
    System.out.println("---------------------------");
    System.out.println("Matricula : "+getMatricula());
    System.out.println("Nome : "+getNome());
    System.out.println("Salário base : "+getSalario());
    System.out.println("Salário final : "+SalarioFinal);
    System.out.println("--------------------------------------");

    
}

}
