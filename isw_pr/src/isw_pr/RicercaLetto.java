/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

/**
 *
 * @author Giovanni
 */
public class RicercaLetto {
    private Letto[] lista;      //conterrà la lista dei letti che risulta dalla ricerca
    private Controller controller;      //collegamento al controller
    
    public RicercaLetto (String luogo, Controller c) { //qui mi sono incasinato e ho messo le funzioni del db 
        controller = c;                                           //dal controller a qui perché non riuscivo a capire come altro fare
        lista = controller.findLettoDB(luogo);//falsa funzione che cerca nel db e rende la teorica lista
        
        if (!"colombia".equals(luogo)){//controlla se il testo è diverso da "colombia"
            System.out.println("Non è stato trovato nessun letto per la ricerca effettuata");
            assert false;
        };
         
        
               
    };
    
    private void ordina(String ordine){     
        //ordina la lista
    }
    public Letto getLetto(int i){
        return lista[i];        //rende un letto della lista per la visualizzazione
    }
}
