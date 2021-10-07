
package prova2.Persistencia;

import java.io.IOException;
import prova2.Model.Container;

public class Persistencia {
    
    private EstrategiaPersistencia estrategia;
    
    public void setEstrategia(EstrategiaPersistencia estrategia) {
        this.estrategia = estrategia;
    }
    
    public void salvar(Container container, String nomeArquivo) throws IOException {
        estrategia.salvar(container, nomeArquivo);
    }
    
}
