import java.io.IOException;

public class TesteGerador {

    public static void main(String args[]) throws IOException {
        String path = "Arquivo";

        Gerador.escritor(path);
        Gerador.leitor(path);
    }

}