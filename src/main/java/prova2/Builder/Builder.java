
package prova2.Builder;

import prova2.Model.Container;

public abstract class Builder {
    
    protected Container container;
    
    protected double valorM2;
    
    public Builder(double valor) {
        valorM2 = valor;
        container = new Container();
    }
    
    public void reset() {
        container = new Container();
    }
    
    public void setValorM2(double valor) {
        valorM2 = valor;
    }
    
    public abstract void addQuarto(double area);
    
    public abstract void addBanheiro(double area);
    
    public abstract void addCozinha(double area);
    
    public abstract void addSala(double area);
    
    public abstract void addCorredor(double area);
    
    public abstract void addJardim(double area);
    
    public abstract void addVaranda(double area);
    
    public abstract Container getResultado();
    
}
