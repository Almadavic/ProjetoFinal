
package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;


public class Venda {
 
    private int numero;
    private Date data;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<ItemVenda> itens = new ArrayList<>(); 
    
   
    

    public Venda(Integer numero, Date data) {
        this.numero = numero;
        this.data = data;
    }

    public Integer getNumero() {
        return numero;
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
