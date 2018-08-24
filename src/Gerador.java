import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Gerador {

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        List lista = new ArrayList();

        while (true) {
            if (linha != null) {
                lista.add(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        String arraynum[] = new String[lista.size()];
        for(int j = 0; j < lista.size(); j++){
            arraynum[j] = (String) lista.get(j);
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        Scanner in = new Scanner(System.in);
        int numero;
        int[] num = new int[6000];
        Random r = new Random();
        for(int i=0; i<num.length; i++){
            numero = r.nextInt(6000) + 1;
            for(int j=0; j<num.length; j++){
                if(numero == num[j] && j != i){
                    numero = r.nextInt(6000) + 1;
                }else{
                    num[i] = numero;
                }
            }
        }
        for(int i=0;i<6000;i++)
        buffWrite.append(num[i] + "\n");
        buffWrite.close();
    }

}