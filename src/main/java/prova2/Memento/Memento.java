
package prova2.Memento;

import java.util.ArrayList;
import prova2.Model.Componente;

public class Memento {
    
    public ArrayList<Componente> state;
    
    public Memento(ArrayList<Componente> state) {
        this.state = state;
    }
    
    public ArrayList<Componente> getState() {
        return state;
    }
    
}
