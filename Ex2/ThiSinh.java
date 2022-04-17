import java.util.InputMismatchException;
import java.util.Scanner;

public class ThiSinh {
    private String ten;
    private double toan, ly, hoa;
    public static Scanner sc = new Scanner(System.in);

    public String getTen(){
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getToan() {
        return toan;
    }
    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }
    public void setLy(double ly) {
        this.ly = ly;;
    }

    public double getHoa() {
        return hoa;
    }
    public void setHoa(double hoa) {
        this.hoa = hoa;
    }


    public void nhapThongTin()
    {
        try{
            System.out.print("Nhap Ten : ");
            this.ten = sc.nextLine();
            int diem = 0;
            try{
                System.out.print("Toan cua " + this.ten + " : ");
                do
                {
                    diem = Integer.parseInt(sc.nextLine());
                }
                while(diem < 0 || diem > 10);
                this.toan = diem;
               
                
                System.out.print("Ly cua " + this.ten + " : ");
                do
                {
                    diem = Integer.parseInt(sc.nextLine());
                }
                while(diem < 0 || diem > 10);
                this.ly = diem;
                
                System.out.print("Hoa cua " + this.ten + " : ");
                do
                {
                    diem = Integer.parseInt(sc.nextLine());
                }
                while(diem < 0 || diem > 10);
                this.hoa = diem;
            }
            catch(NumberFormatException ex1)
            {
                ex1.printStackTrace();
            }
        }
        catch(InputMismatchException ex)
        {
            ex.printStackTrace();
        }
        catch(IllegalStateException ex)
        {
            ex.printStackTrace();
        }
    }

    public double tongDiem()
    {
        return this.toan + this.ly + this.hoa;
    }

    public void inThongTin()
    {
        System.out.println("Ten: " + this.ten + ", Toan: " + this.toan + ", Ly: " + this.ly + ", Hoa: " + this.hoa);
    }
}
