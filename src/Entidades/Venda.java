
package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;


public class Venda {
 
    private int numero;
    private Date data;
    private int formPagament;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy : HH/mm/ss");
    private List<ItemVenda> itens = new ArrayList<>(); 
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFormPagament() {
        return formPagament;
    }

    public void setFormPagament(int formPagament) {
        this.formPagament = formPagament;
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
    
   
    

    public Venda(Integer numero, Date data, Integer formPagament) {
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

}
