package Lab2;
import java.io.File;
import java.util.Arrays;
import java.io.*;

class Vers{
    private String versul_curent;
    public Vers(String versul){
        versul_curent=versul;
    }
    public int numar_cuvinte(){
        int contor_cuvinte=1;
        for(int i=0;i<versul_curent.length();i++)
            if(versul_curent.charAt(i)==' ')
                contor_cuvinte++;
    return contor_cuvinte;
    }

    public int numar_vocale(){
        int contor_vocale=0;
        for(int i=0;i<versul_curent.length();i++)
            if ("aeiouAEIOU".indexOf(versul_curent.charAt(i)) != -1)
                contor_vocale++;
        return contor_vocale;
    }

    public String returneaza_vers(){
        return versul_curent;
    }
}

public class ex2 {
    public static void main(String[] args) throws IOException{
        String nume_fis= "cantec_in.txt ";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        int contor=0;
        Vers []Cantec = new Vers[46];
        String linia=flux_in.readLine();
        while( linia!= null)
        {    Vers vers_curent=new Vers(linia);
            Cantec[contor]=vers_curent;
            contor++;
            linia=flux_in.readLine();
        }
        PrintStream flux_out=new PrintStream("cantec_out.txt");
        for (int i=0;i<contor;i++)
           // System.out.println(Cantec[i].returneaza_vers()+' '+Cantec[i].numar_cuvinte());
            flux_out.println(Cantec[i].returneaza_vers()+' '+Cantec[i].numar_cuvinte()+' '+Cantec[i].numar_vocale());







    }

}
