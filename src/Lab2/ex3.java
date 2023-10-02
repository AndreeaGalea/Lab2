package Lab2;
import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati sirul:");
        String  sir = scanner.nextLine();
        System.out.println("Ce doriti sa inserati?");
        String  sir_de_inserat = scanner.nextLine();
        System.out.println("La ce pozitie?");
        int pozitie_inserat= scanner.nextInt();
        StringBuffer sb=new StringBuffer(sir);
        sb.insert(pozitie_inserat, sir_de_inserat);
        System.out.print(sb);
        System.out.println("\n");
        System.out.println("Startul subsirului de sters:");
        int start = scanner.nextInt();
        System.out.println("Finalul subsirului de sters");
        int stop= scanner.nextInt();
        sb.delete(start,stop);
        System.out.print(sb);
    }
}
