
package Entidades;
public final class Gerente extends Funcionario {
 private Double comissao;
 public Gerente() {
     super();
 }
    public Gerente(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
     public Gerente(int matricula, String nome, double salario,double comissao , double proventos , double descontos) {
        super(matricula, nome, salario);
        this.comissao=comissao;
        this.proventos=proventos;
        this.descontos=descontos;
    }
     @Override
      public  double calcularSalario() {
       return super.calcularSalario()+comissao;
       
    }
    @Override
public String toString() {
    StringBuilder bd = new StringBuilder();
   bd.append("---------------------------\n");
     bd.append("DADOS PARA O GERENTE\n");
     bd.append("---------------------------\n");
     bd.append("Matricula : "+matricula+"\n");
     bd.append("Nome : "+nome+"\n");
     bd.append("Salário base : "+salario+"\n");
     bd.append("Salário final : "+calcularSalario()+"\n");
     bd.append("--------------------------------------\n");
     return bd.toString();
}
}
