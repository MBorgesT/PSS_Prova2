
package prova2.Model;

import java.util.ArrayList;
import prova2.Memento.Memento;

public class Container implements Componente {
    
    private ArrayList<Componente> filhos;
    
    public Container() {
        filhos = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        double valor = 0;
        for (Componente c: filhos) {
            valor += c.calcularPreco();
        }
        return valor;
    }
    
    public void adicionar(Componente c) {
        filhos.add(c);
    }
    
    public void remover(Componente c) {
        filhos.remove(c);
    }
    
    public ArrayList<Componente> getFilhos() {
        return filhos;
    }
    
    public Memento criarMemento() {
        return new Memento((ArrayList<Componente>) filhos.clone());
    }
    
    public void restaurar(Memento memento) {
        filhos = memento.getState();
    }

    @Override
    public String toString(int qtdTabs) {
        StringBuilder sbTabs = new StringBuilder();
        for (int i = 0; i < qtdTabs; i++) {
            sbTabs.append("\t");
        }
        String tabs = sbTabs.toString();
        
        StringBuilder sb = new StringBuilder();
        for (Componente c: filhos) {
            sb.append(tabs).append("{\n");
            sb.append(c.toString(qtdTabs + 1));
            sb.append(tabs).append("}\n");
        }
        
        if (qtdTabs == 0) {
            sb.append(String.format("Valor Total(R$): %.2f", calcularPreco()));
        }
        
        return sb.toString();
    }
    
}
