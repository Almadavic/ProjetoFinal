
package Entidades;


public class Gerente extends Funcionario {
 private Double comissao;
 private Double SalarioFinal;
    public Gerente(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
      public  Double calcularSalario ( double proventos,double descontos,double comissao) {
        return SalarioFinal=(getSalario()+proventos+comissao)-descontos;
    }
        
            
    
    
    public void Format() {
    System.out.println("---------------------------");
    System.out.println("DADOS PARA O GERENTE");
    System.out.println("---------------------------");
    System.out.println("Matricula : "+this.getMatricula());
    System.out.println("Nome : "+getNome());
    System.out.println("Salário base : "+getSalario());
    System.out.println("Salário final : "+SalarioFinal);
    System.out.println("--------------------------------------");
    }
    
}
