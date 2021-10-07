package prova2.Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import prova2.Model.Container;

public class TXTEstrategia implements EstrategiaPersistencia {

    @Override
    public void salvar(Container container, String nomeArquivo) throws IOException {
        FileWriter file = new FileWriter(nomeArquivo + ".txt");
        file.write(container.toString(0));
        file.close();
    }

}
