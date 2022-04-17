import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ex1{
    private ArrayList<Integer> listIntegers;
    private int n;

    public ex1()
    {
        listIntegers = new ArrayList<>();
        n = 0;
    }
    public void input()
    {
        try
        {
            System.out.print("n = ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            for(int i = 0; i < n; i++)
            {
                try{
                    System.out.print("arr["+i+"] = ");
                    int x = sc.nextInt();
                    listIntegers.add(x);
                }
                catch(InputMismatchException ex)
                {
                    ex.printStackTrace();
                }
            }
            sc.close();
        }
        catch(InputMismatchException ex)
        {
            ex.printStackTrace();
        }
        catch(NoSuchElementException | IllegalStateException ex)
        {
            ex.printStackTrace();
        }
    }
    public int sum()
    {
        int sum = 0;
        for(int i : listIntegers)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        ex1 objEx1 = new ex1();
        objEx1.input();
        System.out.println("Sum of arrayList is : " + objEx1.sum());
    }
}
