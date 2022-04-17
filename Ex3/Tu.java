import java.util.NoSuchElementException;
import java.util.Scanner;

public class Tu {
    private String tu;
    private String nghia;
    private String phienAm;
    public static Scanner sc = new Scanner(System.in);

    public String getTu() {
        return tu;
    }
    public String getPhienAm() {
        return phienAm;
    }
    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }
    public String getNghia() {
        return nghia;
    }
    public void setNghia(String nghia) {
        this.nghia = nghia;
    }
    public void setTu(String tu) {
        this.tu = tu;
    }

    public void nhap()
    {
        try
        {
            System.out.print("Tu : ");
            this.tu = sc.nextLine();
            System.out.print("Nghia : ");
            this.nghia = sc.nextLine();
            System.out.print("PhienAm : ");
            this.phienAm = sc.nextLine();
            
        }
        catch(NoSuchElementException | IllegalStateException ex)
        {
            ex.printStackTrace();
        }
    }
    public void xuat()
    {
        System.out.println(this.tu + "\t\t" + this.phienAm + "\t\t" + this.nghia);
    }
}
