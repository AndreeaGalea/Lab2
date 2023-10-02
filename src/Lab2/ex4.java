package Lab2;
class Persoana{
    private String nume;
    private String cnp;
    public int verificare_cnp(String incercare){
        String numar_standard_control="279146358279";
        int suma=0;
        if (incercare.length()!=13)
            return 0;
        for (int i=0;i<13;i++)
            if("0123456789".indexOf(incercare.charAt(i)) == -1)
                return 0;
        if("1256".indexOf(incercare.charAt(0)) == -1)
            return 0;
        for(int i=0;i<13;i++)
        {
            int a=Character.getNumericValue((incercare.charAt(i)));
            int b=Character.getNumericValue((numar_standard_control.charAt(i)));
            suma=suma+(a*b)
        }
return 1;
    }
    public Persoana(String _nume, String _cnp){
        nume=_nume;
        //if (verificare_cnp(_cnp)==1)
        //{

        //}
    }
}
public class ex4 {
    public static void main(String[] args) {

    }

}
