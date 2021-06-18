
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
    public TipoPagamento getFormPagament() {
        return formPagament;
    }
    public void setFormPagament(TipoPagamento formPagament) {
        this.formPagament = formPagament;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
    private List<ItemVenda> itens = new ArrayList<>(); 
    StatusVenda status = StatusVenda.IMPRIMINDO;
    public Venda() {
        this.numero=0;
        this.data=null;
        this.formPagament=null;
        this.status=null;
    }
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
    public Venda(Integer numero, Date data,  TipoPagamento formPagament,StatusVenda status) {
        this.numero = numero;
        this.data = data;
    this.formPagament=formPagament;
    this.status=status;
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
    soma +=  item.subTotal();
    }  
    return soma;
}
    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();
        bd.append("======================\n");
        bd.append("DADOS DA VENDA : \n");
        bd.append("======================\n");
        bd.append("Número do pedido : "+numero+"\n");
        bd.append("Data do pedido : "+sdf.format(data)+"\n");
        bd.append("Status do pedido : "+status+"\n");
        bd.append("Forma de pagamento : "+formPagament+"\n");
        bd.append("======================\n");
        bd.append("ITENS DA VENDA \n");
        bd.append("====================== \n");
        for ( ItemVenda itemr : itens) {          
            bd.append(itemr+"\n");
        }
        bd.append("======================\n");
        bd.append("Total da Venda : R$"+total()+"\n");
        bd.append("======================\n");
        return bd.toString();
    }
}
