
package Entidades;

import Aplicação.Programa;
import Enumerados.StatusVenda;
import Enumerados.TipoPagamento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;


public class Venda {
 
    private int numero;
    private Date data;
    private  TipoPagamento formPagament;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private List<ItemVenda> itens = new ArrayList<>(); 
    StatusVenda status = StatusVenda.IMPRIMINDO;
    
    ItemVenda itemr = new ItemVenda();
    
                      

    
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   

  

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    
   
    

    public Venda(Integer numero, Date data,  TipoPagamento formPagament) {
        this.numero = numero;
        this.data = data;
    this.formPagament=formPagament;
    }

   

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
            
public void  adicionarItem (ItemVenda item ) {
    itens.add(item);
}
public void removerItem(ItemVenda item) {
    itens.remove(item);
}
public double total () {
    double soma = 0;
    for (ItemVenda item : itens) {
      
    }
    return soma;
}

    
    public void Format() {
        System.out.println("======================");
        System.out.println("DADOS DA VENDA : ");
        System.out.println("======================");
        System.out.println("Número do pedido : "+numero);
        System.out.println("Data do pedido : "+sdf.format(data));
        System.out.println("Status do pedido : "+status);
        System.out.println("Forma de pagamento : "+formPagament);
        System.out.println("======================");
        System.out.println("ITENS DA VENDA ");
        System.out.println("====================== ");
        System.out.println("Quantidade do Item : "+itemr.getQuantidade());
    }






}
