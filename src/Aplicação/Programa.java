
package Aplicação;

import Entidades.Caixa;
import Entidades.Gerente;
import Entidades.ItemVenda;
import Entidades.Venda;
import Enumerados.TipoPagamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Programa {
   static double g=10;
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
   Date data;
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   
   
        double f = g+10;
        System.out.println(f);
       
        int opçao =0;
        int matriculaCaixa=0;
        int numeroVenda =0;
        char card ;
        double salarioCaixa=0;
        String nomeCaixa="";
        double salariobaseCaixa=0;
        double salariobaseGerente=0;
        double proventosCaixa=0;
        double descontosCaixa=0;
        String nomeGerente="";
        int matriculaGerente=0;
        double salarioGerente=0;
        double proventosGerente=0;
        double descontosGerente=0;
        double comissaoGerente=0;
        double funcionario=0;
        int quantidadeProduto=0;
        double preçoUnitario=0;
        String nomeProduto="";
        int formPagament=0;
        int itens=0;
        int repeticao=0;
        int contador=1;
         Venda d;
        TipoPagamento tipo=null;
         do {
            while(repeticao!=-1) {
               
        System.out.println("MENU DE OPÇÕES ");
        System.out.println("");
        System.out.println("1 - Reliazar Venda, emitir cupom fiscal  \n2 - Mostrar Salários dos Funcionários  \n3 - Verificar Bandeira do Cartão "
                + "\n4 - Sobre o Programa \n5 - Sair");
            System.out.println("Informe a opção : ");
         opçao=sc.nextInt();
       switch (opçao) {
           case 1:          // Realizar Venda, Emitir Cupom fiscal   
               System.out.println("Número da Venda : ");
               numeroVenda = sc.nextInt();
               System.out.println("Data da Venda  : ");
               String datar = sc.next();
               data= sdf.parse(datar);
                
               System.out.println("Tipo de Pagamento (1) DINHEIRO, (2) VISTA, (3)CREDITO, (4)DEBITO, (5)CHEQUE : ");
               formPagament = sc.nextInt();
               if (formPagament==1) {
                   tipo = TipoPagamento.valueOf("DINHEIRO");
               }if ( formPagament==2) {
                   tipo = TipoPagamento.valueOf("VISTA");
               }if ( formPagament==3) {
                   tipo = TipoPagamento.valueOf("CREDITO");
               }if (formPagament==4) {
                   tipo = TipoPagamento.valueOf("DEBITO");
                   
               }if (formPagament==5) {
                   tipo=TipoPagamento.CHEQUE;
               }
            d = new Venda(numeroVenda , data,tipo); 
           
           
               
               itens = 0;
               do  {
                 
                   System.out.println("Produto Número : "+contador);
                   System.out.println("Quantidade : ");
                   quantidadeProduto = sc.nextInt();
                   System.out.println("Preço Unitário : ");
                   preçoUnitario=sc.nextDouble();
                   System.out.println("Nome do Produto : ");
                   nomeProduto=sc.next();
                  ItemVenda venda = new ItemVenda(numeroVenda,nomeProduto,quantidadeProduto,preçoUnitario);
                
               
                  
                   
                  d.adicionarItem(venda);
               contador++;
                   System.out.println("Informe a quantidade de  Intens (-1) para quantidade, finalizar)");
                   itens = sc.nextInt();
                   
               }while (itens!=-1);
               d.Format();   
           break;
              
           case 2 :                   // Mostrar Salários dos Funcionários
               System.out.println("Deseja acessar Informações do Caixa(1) ou Gerente(2) ? ");
               funcionario =sc.nextInt();
               if (funcionario==1) {
               System.out.println("Informe a matricula do Caixa : ");
             matriculaCaixa = sc.nextInt();
               System.out.println("Informe o nome do Caixa : ");
               nomeCaixa = sc.next();
               System.out.println("Informe o salário base do Caixa : ");
                salariobaseCaixa=sc.nextDouble();
                   
                   
                Caixa a = new Caixa(matriculaCaixa,nomeCaixa,salariobaseCaixa);
                System.out.println("Informe o valor dos Proventos para o Caixa : ");
                proventosCaixa = sc.nextDouble();
                System.out.println("Informe o valor dos Descontos para o Caixa : ");
               descontosCaixa = sc.nextDouble();
               a.calcularSalario(proventosCaixa, descontosCaixa);
               a.Format();}
               
               //------------------------------------------//---//
              else if (funcionario==2) { 
               System.out.println("Informe a matricula do Gerente : ");
             matriculaGerente = sc.nextInt();
               System.out.println("Informe o nome do Gerente : ");
               nomeGerente= sc.next();
               System.out.println("Informe o salário base do Gerente : ");
                salariobaseGerente=sc.nextDouble();
                   Gerente b = new Gerente(matriculaGerente,nomeGerente,salariobaseGerente);
                System.out.println("Informe o valor dos Proventos para o Gerente : ");
                proventosGerente = sc.nextDouble();
                System.out.println("Informe o valor dos Descontos para o Gerente : ");
               descontosGerente = sc.nextDouble();
               System.out.println("Informe o valor da Comissão do gerente : ");
               comissaoGerente=sc.nextDouble();
               b.calcularSalario(proventosGerente, descontosGerente,comissaoGerente);
               b.Format();
               } else {
                   System.out.println("Opção Inválida");
                   
               }
               
               break;
    
           case 3 : // Verificar Bandeira do Cartão
               System.out.println("Informe o tipo de cartão : (v) Visa, (m) Mastercard, (f) Finalizar : ");
               card = sc.next().charAt(0);
               if (card=='v') {
                   System.out.println("Informe o setor para o cartão VISA : ");
               }else if (card=='m') {
                   System.out.println("Informe o setor para o cartão MASTERCARD :");  
               }else if (card=='f') {
               break;
               }    
               break;            
           case 4 :       // Sobre o Programa       
                   System.out.println("\n+----------------------------------------------------------+\n"+"|                      SOBRE O PROGRAMA                    |"+"\n+----------------------------------------------------------+");
        System.out.println("|BIG  MERCADO LTDA                                         |\n"+"|CLIENTE: SUPERMERCADOS BIG                                |"+"\n|VERSÃO 1.0                                                |");
        System.out.println("|Gerente de projetos: Bernardo Augusto , André Vilaça      |\n"+"|Analista de sistemas: Barbára Melo , Marcella Duraes      |"+"\n|Programadores: Victor Almada, João Vitor, Gleidson Richel |");
        System.out.println("+----------------------------------------------------------+\n"+"|Contato: (31)9876-5432  , (31)98589-8955                  |"+"\n|                  www.BigE.com.br                         |"+"\n+----------------------------------------------------------+");
   

           break;
           default:
               if (opçao==5) {
                   break;
               }else {
               System.out.println("Opção Inválida");
               System.out.println("");
               }
       }
      
                System.out.println("Deseja abrir o Menu de Opções Novamente ? ");
                System.out.println("(1) Sim (-1)Não");
                repeticao = sc.nextInt();
                if (repeticao==-1) {
                    break;
                    
                }
                
             if (repeticao==-1) {
                    break;
                }
            
            }
           if (repeticao==-1) {
                    break;
                }
          
        }while(opçao!=5);

        System.out.println("Programa Finalizado");
    
    }
    
}
