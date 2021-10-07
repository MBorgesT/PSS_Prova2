
package prova2;

import java.io.IOException;
import prova2.Factory.GardenCreator;
import prova2.Factory.LoftCreator;
import prova2.Factory.TriplexCreator;
import prova2.Memento.Historico;
import prova2.Model.Container;
import prova2.Persistencia.JSONEstrategia;
import prova2.Persistencia.Persistencia;
import prova2.Persistencia.TXTEstrategia;

public class Main {
    
    public static void main(String args[]) throws IOException {
        
        TriplexCreator triplexCreator = new TriplexCreator();
        Container triplex = triplexCreator.criarApartamento();
        triplex.adicionar(triplexCreator.criarVaranda());
        System.out.println(triplex.toString(0));
        
        System.out.println("\n-----------------------------------------------\n");
                
        GardenCreator gardenCreator = new GardenCreator(); 
        Container garden = gardenCreator.criarApartamento();
        garden.adicionar(gardenCreator.criarQuarto());
        System.out.println(garden.toString(0));
        
        System.out.println("\n-----------------------------------------------\n");
        
        LoftCreator loftCreator = new LoftCreator();
        Container loft = loftCreator.criarApartamento();
        System.out.println(loft.toString(0));
        
        
        // Persistência
        Persistencia persistencia = new Persistencia();
        
        persistencia.setEstrategia(new JSONEstrategia());
        persistencia.salvar(triplex, "triplex");
        
        persistencia.setEstrategia(new TXTEstrategia());
        persistencia.salvar(loft, "loft");
        
        
        // Desfazer
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Memento\n");
        System.out.println("-----------------------------------------------\n\n\n");
        
        Historico historico = new Historico();
        
        historico.salvar(loft.criarMemento());
        loft.adicionar(loftCreator.criarVaranda());
        System.out.println(loft.toString(0));
        
        System.out.println("\n-----------------------------------------------\n");
        
        loft.restaurar(historico.desfazer());
        System.out.println(loft.toString(0));
        
    }
    
}
