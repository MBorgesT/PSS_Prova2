
package prova2.Factory;

import prova2.Builder.ContainerBuilder;
import prova2.Model.Container;

public class LoftCreator extends Creator {

    @Override
    public Container criarApartamento() {
        ContainerBuilder builder = new ContainerBuilder(4800);
        
        builder.addSala(18);
        builder.addCozinha(8);
        builder.addBanheiro(6);
        builder.addQuarto(0); // mezanino, portanto ocupa o mesmo espaço que outros comodos
        Container interior = builder.getResultado();
        
        Container todasAreas = new Container();
        todasAreas.adicionar(interior);
        
        return todasAreas;
    }
    
    public Container criarVaranda() {
        ContainerBuilder builder = new ContainerBuilder(1000);
        builder.addVaranda(5);
        return builder.getResultado();
    }
    
}
