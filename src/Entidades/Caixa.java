
package Entidades;
public final class Caixa extends Funcionario  {
    public Caixa() {
        super();
    }
    public Caixa(int matricula, String nome, double salario,double proventos , double descontos) {
        super(matricula, nome, salario);
        this.proventos=proventos;
        this.descontos=descontos;
    }
    @Override
    public  double  calcularSalario( ) {   // Redundancia ( Sei que não é necessario ) pois é identico a classe super , mas queria deixar explicito.
       return super.calcularSalario();
    }
@Override
public String toString() {
    StringBuilder bd = new StringBuilder();
   bd.append("---------------------------\n");
     bd.append("DADOS PARA O CAIXA\n");
     bd.append("---------------------------\n");
     bd.append("Matricula : "+getMatricula()+"\n");
     bd.append("Nome : "+getNome()+"\n");
     bd.append("Salário base : "+getSalario()+"\n");
     bd.append("Salário final : "+calcularSalario()+"\n");
     bd.append("--------------------------------------\n");
     return bd.toString();
}
}
