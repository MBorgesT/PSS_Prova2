
package prova2.Memento;

import java.util.Stack;

public class Historico {
    
    private Stack<Memento> historico;
    
    public Historico() {
        historico = new Stack<>();
    }
    
    public void salvar(Memento memento) {
        historico.add(memento);
    }
    
    public Memento desfazer() {
        return historico.pop();
    }
    
}
