
package prova2.Persistencia;

import java.io.IOException;
import prova2.Model.Container;

public interface EstrategiaPersistencia {
    
    public void salvar(Container container, String nomeArquivo) throws IOException;
    
}
