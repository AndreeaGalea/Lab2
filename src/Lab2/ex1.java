package Lab2;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.*;


public class ex1 {
    public static void main(String[] args) throws IOException{
        String nume_fis= "judete_in.txt ";
        BufferedReader flux_in;
        int contor=0;
        String[] Lista_judete=new String[40];
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        for(String judet;(judet=flux_in.readLine())!=null;)
        {    Lista_judete[contor]=judet;
            contor++;

        }
        Arrays.sort(Lista_judete);
        for(int i=0;i<Lista_judete.length;i++)
            System.out.print(Lista_judete[i]+"\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati judetul cautat:");
        String cautare_judet = scanner.nextLine();
        int poz=Arrays.binarySearch(Lista_judete, cautare_judet);//doar ptr tablou ordonat
        System.out.println("Judetul cautat se afla la pozitia:"+poz);

    }
}
