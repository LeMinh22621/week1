import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class QLDT {
    private ArrayList<ThiSinh> dsThiSinh;
    private ArrayList<ThiSinh> dsTrungTuyen;
    private int diemchuan;
    
    public QLDT()
    {
        this.dsThiSinh = new ArrayList<>();
        dsTrungTuyen = new ArrayList<>();
        diemchuan = 17;
    }
    public void nhapDanhSach(){
        try{
        
            String s = "y";
            do
            {
                ThiSinh t = new ThiSinh();
                t.nhapThongTin();
               
                dsThiSinh.add(t);

                System.out.println("Thoat ? y : ");
                
                s = ThiSinh.sc.nextLine();
            }
            while(!s.equalsIgnoreCase("y"));
            ThiSinh.sc.close();
        }
        catch(InputMismatchException ex)
        {
            ex.printStackTrace();
        }
        catch(IllegalStateException ex)
        {
            ex.printStackTrace();
        } 
        catch(NoSuchElementException ex)
        {
            ex.printStackTrace();
        }
    }
    public void inDanhSach()
    {
        System.out.println("In Danh Sach Thi Sinh Du 17 Diem :");
        for(ThiSinh i : dsThiSinh)
        {
            if(i.tongDiem() >= diemchuan)
            {
                dsTrungTuyen.add(i);
            }
        }
        if(dsTrungTuyen.size() > 0)
            for(ThiSinh i : dsTrungTuyen)
                i.inThongTin();
        else
            System.out.println("Khong co thi sinh nao du 17 diem");
    }
    public void sapXepTrungTuyen()
    {
        System.out.println("SapXep");
        for(int i = 0; i < dsTrungTuyen.size() - 1; i++)
        {
            for (int j = i + 1; j < dsTrungTuyen.size(); j++)
            {
                if(dsTrungTuyen.get(i).tongDiem() < dsTrungTuyen.get(j).tongDiem())
                {
                    ThiSinh tmp = dsTrungTuyen.get(i);
                    dsTrungTuyen.set(i, dsTrungTuyen.get(j));
                    dsTrungTuyen.set(j, tmp);
                }
            }
        }
        for( ThiSinh i : dsTrungTuyen)
        {
            System.out.println(i.getTen() + "\t\t" + i.tongDiem());
        }
    }
    public static void main(String[] args)
    {
        QLDT ob = new QLDT();
        ob.nhapDanhSach();
        ob.inDanhSach();
        ob.sapXepTrungTuyen();
    }
}
