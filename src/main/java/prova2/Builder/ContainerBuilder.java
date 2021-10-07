
package prova2.Builder;

import prova2.Model.Comodo;
import prova2.Model.Container;

public class ContainerBuilder extends Builder {
    
    public ContainerBuilder(double valorM2) {
        super(valorM2);
    }

    @Override
    public void addQuarto(double area) {
        container.adicionar(new Comodo(area, "quarto", valorM2));
    }

    @Override
    public void addBanheiro(double area) {
        container.adicionar(new Comodo(area, "banheiro", valorM2));
    }

    @Override
    public void addCozinha(double area) {
        container.adicionar(new Comodo(area, "cozinha", valorM2));
    }

    @Override
    public void addSala(double area) {
        container.adicionar(new Comodo(area, "sala", valorM2));
    }

    @Override
    public void addCorredor(double area) {
        container.adicionar(new Comodo(area, "corredor", valorM2));
    }

    @Override
    public void addJardim(double area) {
        container.adicionar(new Comodo(area, "jardim", valorM2));
    }

    @Override
    public void addVaranda(double area) {
        container.adicionar(new Comodo(area, "varanda", valorM2));
    }

    @Override
    public Container getResultado() {
        return container;
    }
    
}
