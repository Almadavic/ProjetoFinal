
package Entidades;


public class Gerente extends Funcionario {

    public Gerente(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public Double calcularSalario(double proventos , double comissao , double descontos) {
        return ;
        
            
    }
    
    public void Format() {
    System.out.println("---------------------------");
    System.out.println("DADOS PARA O GERENTE");
    System.out.println("---------------------------");
    System.out.println("Matricula : ");
    System.out.println("Nome : ");
    System.out.println("Salário base : ");
    System.out.println("Salário final : ");
    System.out.println("--------------------------------------");
    }
    
}
