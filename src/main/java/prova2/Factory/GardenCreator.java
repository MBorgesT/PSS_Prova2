
package prova2.Factory;

import prova2.Builder.ContainerBuilder;
import prova2.Model.Container;

public class GardenCreator extends Creator {

    @Override
    public Container criarApartamento() {
        ContainerBuilder builder = new ContainerBuilder(3500);
        
        builder.addSala(12);
        builder.addCorredor(4);
        builder.addCozinha(8);
        builder.addBanheiro(6);
        builder.addQuarto(12);
        Container interior = builder.getResultado();
        
        builder.reset();
        builder.setValorM2(2200);
        builder.addJardim(40);
        Container jardim = builder.getResultado();
        
        Container todasAreas = new Container();
        todasAreas.adicionar(interior);
        todasAreas.adicionar(jardim);
        
        return todasAreas;
    }
    
    public Container criarQuarto() {
        ContainerBuilder builder = new ContainerBuilder(3500);
        builder.addQuarto(10);
        return builder.getResultado();
    }
    
}
