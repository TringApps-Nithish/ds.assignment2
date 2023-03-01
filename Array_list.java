import java.util.*;
import java.util.ArrayList;

class setter
{
    String Ele;
    setter(String element)
    {
        Ele = element;
    }
public String toString()
{
return Ele;
}
}
class Array_list {
    public static  void main(String args[])
    {
        int ch=0;
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t\t----- Arrray-List ----- \n");
        System.out.println(" 1) Add an Alement \n 2) Delete an Element \n 3) Exit ");
        while(ch!=3)
        {
        System.out.printf("\n Enter Your Choice : ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
            System.out.printf(" Enter Element You Want Add : ");
            String get = sc.next();
            setter obj = new setter(get);
            arr.add(get);
            System.out.println("\n Array Contains : " + arr);
            }
            break;

            case 2:
            {
            if(arr.size()==0)
            {
                System.out.println(" Arraylist is Empty ...");
            }
            else
            {
            System.out.printf(" Enter Element You Want Delete : ");
            String out = sc.next();
            if(arr.contains(out))
            {
            arr.remove(out);
            System.out.println("\n Array Contains : " + arr);
            }
            else
            System.out.println(" Element not Found ....");
            }
            }
            break;

            case 3:
            System.exit(0);
            break;

            default:
            System.out.println("\n Invalid choice ...");
            break;
        }

        }
    }
}
