package br.gm.mateus.dukemarket;

import br.gm.mateus.dukemarket.bean.Produto;
import br.gm.mateus.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author DIGM1A
 */
public class Dukemarket {

    public static void main(String[] args) {
 
        Produto pAux;
        ProdutoDAO pDAO = new ProdutoDAO();
 /*
//teste de  inclusao de produto 
        pAux = new Produto();
       
      pAux.setCodBarras("11111111");
      pAux.setDescricao("Mouse Logitech bluetooth");
      pAux.setQtd(50);
      pAux.setValorCompra(80.00);
      pAux.setValorVenda(167.00);
      
      pDAO.create(pAux);
      
      pAux = new Produto();
      pAux.setCodBarras("22222222");
      pAux.setDescricao("Teclado USB Gamer");
      pAux.setQtd(80);
      pAux.setValorCompra(104.00);
      pAux.setValorVenda(220.00);
      
      pDAO.create(pAux);
     
      pAux.setCodBarras("33333333");
      pAux.setDescricao("Microcomputador Dell");
      pAux.setQtd(110);
      pAux.setValorCompra(2400.00);
      pAux.setValorVenda(3200.00);
      
      pDAO.create(pAux);
      
      //Lista geral
      pDAO.getResults().forEach(p -> {
          System.out.println(p.toString());
      }
      );
         */

 /*       
 pDAO.delete(2);

        //lista geral
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
        */

        //teste de alteração do produto
        pAux = pDAO.getResultById(1);

        pAux.setQtd(100);
        pDAO.update(pAux);

        //lista geral
        pDAO.getResults()
                .forEach(p -> {
                    System.out.println(p.toString());
                });
    
    }
}
        
        
        
                



    

