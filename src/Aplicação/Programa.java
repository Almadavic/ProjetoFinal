
package Aplicação;
import Entidades.Caixa;
import Entidades.Gerente;
import Entidades.ItemVenda;
import Entidades.Venda;
import Enumerados.StatusVenda;
import Enumerados.TipoPagamento;
import Interfaces.Visa;
import Interfaces.masterCard;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
   Date data;
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int opçao =0;
        int matriculaCaixa=0;
        int numeroVenda =0;
        char subMenu ;
        String nomeCaixa="";
        double salariobaseCaixa=0;
        double salariobaseGerente=0;
        double proventosCaixa=0;
        double descontosCaixa=0;
        String nomeGerente="";
        int matriculaGerente=0;
        double proventosGerente=0;
        double descontosGerente=0;
        double comissaoGerente=0;
        double funcionario=0;
        int quantidadeProduto=0;
        double preçoUnitario=0;
        String nomeProduto="";
        int formPagament=0;
       int setor;
        int repeticao=0;
        int contador=1;
         Venda Venda;   // iniciamos o objeto Venda  da Classe Venda.
        TipoPagamento tipo=null;
         Visa visa = new Visa();   // Instanciamos o visa
         masterCard masterCard= new masterCard(); // Instanciamos o mastercard
        do {
            while(repeticao!=-1) { 
        System.out.println("MENU DE OPÇÕES ");
        System.out.println("");
        System.out.println("1 - Realizar Venda, emitir cupom fiscal  \n2 - Mostrar Salários dos Funcionários  \n3 - Verificar Bandeira do Cartão "
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
                   tipo = TipoPagamento.valueOf("AVISTA");
               }if ( formPagament==3) {
                   tipo = TipoPagamento.valueOf("CREDITO");
               }if (formPagament==4) {
                   tipo = TipoPagamento.valueOf("DEBITO");   
               }if (formPagament==5) {
                   tipo=TipoPagamento.valueOf("CHEQUE");
               }
            Venda = new Venda(numeroVenda , data,tipo,StatusVenda.IMPRIMINDO); 
               do  {
                   System.out.println("Produto Número : "+contador);
                   System.out.println("Quantidade : (Digite -1 para Finalizar)");
                   quantidadeProduto = sc.nextInt();
                   if (quantidadeProduto==-1) {
                       break;
                   }
                   System.out.println("Preço Unitário : ");
                   preçoUnitario=sc.nextDouble();
                   System.out.println("Nome do Produto : ");
                   nomeProduto=sc.next();
                  ItemVenda ItemVenda = new ItemVenda(contador,nomeProduto,quantidadeProduto,preçoUnitario); // instaciamos o objeto ItemVenda da classe Venda
                  Venda.adicionarItem(ItemVenda);
               contador++;
               }while (quantidadeProduto!=-1);
                  System.out.println(Venda); 
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
                System.out.println("Informe o valor dos Proventos para o Caixa : ");
                proventosCaixa = sc.nextDouble();
                System.out.println("Informe o valor dos Descontos para o Caixa : ");
               descontosCaixa = sc.nextDouble();
            Caixa caixa = new Caixa(matriculaCaixa,nomeCaixa,salariobaseCaixa,proventosCaixa,descontosCaixa);
                   System.out.println(caixa);
               }
               //------------------------------------------//---//
              else if (funcionario==2) { 
               System.out.println("Informe a matricula do Gerente : ");
             matriculaGerente = sc.nextInt();
               System.out.println("Informe o nome do Gerente : ");
               nomeGerente= sc.next();
               System.out.println("Informe o salário base do Gerente : ");
                salariobaseGerente=sc.nextDouble(); 
                System.out.println("Informe o valor dos Proventos para o Gerente : ");
                proventosGerente = sc.nextDouble();
                System.out.println("Informe o valor dos Descontos para o Gerente : ");
               descontosGerente = sc.nextDouble();
               System.out.println("Informe o valor da Comissão do gerente : ");
               comissaoGerente=sc.nextDouble();
                 Gerente gerente = new Gerente(matriculaGerente,nomeGerente,salariobaseGerente,comissaoGerente,proventosGerente,descontosGerente);
                   System.out.println(gerente);
               } else {
                   System.out.println("Opção Inválida");   
               }   
               break;
           case 3 : // Verificar Bandeira do Cartão
              do {
                  System.out.println("Selecione o cartão : \n[v]Visa.  \n[m]MasterCard.\n[f]inalizar");
                  subMenu = sc.next().toLowerCase().charAt(0);
                  if(subMenu=='v') {
                      System.out.println("Informe o setor para o cartão visa : ");
                      setor = sc.nextInt();
                     System.out.println(visa.verificarBandeira(setor));  
                  }else if (subMenu=='m') {
                             System.out.println("Informe o setor para o cartão MasterCard : ");
                             setor = sc.nextInt();
                             System.out.println(masterCard.verificarBandeira(setor));
                  } else if (subMenu=='f') {
                      break;
                  }
                  else {
                                    System.out.println("Opção Inválida"); 
                                     }         
              }while(subMenu!='f');    
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
