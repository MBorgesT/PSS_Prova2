package prova2.Factory;

import prova2.Builder.ContainerBuilder;
import prova2.Model.Container;

public class TriplexCreator extends Creator {

    @Override
    public Container criarApartamento() {
        ContainerBuilder builder = new ContainerBuilder(8000);

        builder.addSala(35);
        builder.addCorredor(8);
        builder.addBanheiro(8);
        builder.addCozinha(25);
        Container primeiroAndar = builder.getResultado();

        builder.reset();
        builder.addSala(25);
        builder.addCorredor(6);
        builder.addBanheiro(6);
        builder.addQuarto(13.5);
        builder.addBanheiro(6);
        builder.addQuarto(13.5);
        builder.addBanheiro(6);
        Container segundoAndar = builder.getResultado();

        builder.reset();
        builder.addSala(15);
        builder.addCorredor(8);
        builder.addBanheiro(6);
        builder.addQuarto(36);
        builder.addBanheiro(11);
        Container terceiroAndar = builder.getResultado();
        
        Container todosAndares = new Container();
        todosAndares.adicionar(primeiroAndar);
        todosAndares.adicionar(segundoAndar);
        todosAndares.adicionar(terceiroAndar);

        return todosAndares;
    }
    
    public Container criarVaranda() {
        ContainerBuilder builder = new ContainerBuilder(9000);
        builder.addVaranda(8);
        return builder.getResultado();
    }

}
