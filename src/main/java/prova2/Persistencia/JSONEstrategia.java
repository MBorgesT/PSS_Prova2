
package prova2.Persistencia;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import prova2.Model.Container;

public class JSONEstrategia implements EstrategiaPersistencia {

    @Override
    public void salvar(Container container, String nomeArquivo) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(container);
        
        FileWriter file = new FileWriter(nomeArquivo + ".json");
        file.write(json);
        file.close();
    }
    
}
