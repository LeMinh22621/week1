import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class QLTD {
    //private BinarySearchTree binarySearchTree;
    private ArrayList<Tu> arrayList;
    public QLTD()
    {
        //binarySearchTree = null;
        arrayList = new ArrayList<>();
    }
    // public void bubbleSort()
    // {
    //     for(int i = 0; i < arrayList.size() - 1; i++)
    //     {
    //         for(int j = arrayList.size() - 1; j > i; j--)
    //         {
    //             if(arrayList.get(i).getTu().compareTo(arrayList.get(j).getTu()) == 1)
    //             {
    //                 Tu tmp = arrayList.get(i);
    //                 arrayList.set(i, arrayList.get(j));
    //                 arrayList.set(j, tmp);
    //             }
    //         }
    //     }
    // }
    // public Tu TimKiem(String str, int l, int r)
    // {
    //     int mid = (int)(l + r)/2;
    //     Tu result = null;

    //     while(l <= r)
    //     {
    //         System.out.println(l + " , " + r);
    //         mid = (int)(l + r)/2;
    //         if(arrayList.get(mid).getTu().compareToIgnoreCase(str) == 0)
    //             return arrayList.get(mid);
    //         if(str.compareToIgnoreCase(arrayList.get(mid).getTu()) == 1)
    //             l = mid + 1;
    //         else
    //             r = mid - 1;
    //     }
    //     return result;
    // }
    public Tu TimKiem(String str)
    {
        Tu result = null;
        for(Tu i : arrayList)
        {
            if(i.getTu().compareToIgnoreCase(str) == 0)
            {
                result = i;
                break;
            }
        }
        return result;
    }
    public void xuat()
    {
        for(Tu i : arrayList)
            i.xuat();
    }
    public void nhapDuLieu()
    {
        try{
            String s = "y";
            do
            {
                Tu t = new Tu();
                t.nhap();
                arrayList.add(t);
                // if(binarySearchTree == null)
                //     binarySearchTree = new BinarySearchTree(t);
                // else
                //     binarySearchTree.insert(t);

                System.out.print("Thoat ? nhan y : ");
                if(Tu.sc.hasNextLine())
                    s = Tu.sc.nextLine();
            }
            while(!s.equalsIgnoreCase("y"));
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
    public void menu()
    {
        int c = 0;
        do
        {
            System.out.println("--------------menu------------");
            System.out.println("1. Nhap data");
            System.out.println("2. Hien thi");
            System.out.println("3. Tim kiem");
            System.out.println("4. Thoat");
            try{
                c = Integer.parseInt(Tu.sc.nextLine());
            }
            catch(NumberFormatException ex)
            {

            }
            switch(c){
                case 1:
                    nhapDuLieu();
                    //quickSort(0, arrayList.size() - 1);
                    //bubbleSort();
                    break;
                case 2:
                    if(arrayList.size() == 0)
                    {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    xuat();
                    break;
                case 3:
                    String str = Tu.sc.nextLine();
                    
                    // BinarySearchTree node = null;
                    // if(binarySearchTree != null)
                    //     node = binarySearchTree.searchNode(str);

                    //Tu node = TimKiem(str, 0, arrayList.size() - 1);
                    Tu node = TimKiem(str);
                    if(node == null)
                        System.out.println("Khong tim thay : " + str);
                    else
                        node.xuat();
                    break;
                case 4:
                    System.out.println("Cam on da su dung tu dien");
                    break;
                default:
                    System.out.println("Nhap trong menu");
            }
        }
        while(c != 4);
        Tu.sc.close();
    }
    public static void main(String[] args)
    {
        QLTD qltd = new QLTD();
        qltd.menu();
    }
}
