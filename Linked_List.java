package as;
import java.util.*;

public class Linked_List {
    public static  void main(String args[]) throws  NoSuchElementException,IndexOutOfBoundsException
    {
    LinkedList<String> ls = new  LinkedList<>();
    Scanner  sc = new Scanner(System.in);
    System.out.printf("\t\t ----- Linked_List - Operaton's -----");
    int ch=0;
    while(ch!=7)
    {
        System.out.println("\n 1. Insert at First \n 2. Insert at Last \n 3. Insert at Specified Index ");
        System.out.println(" 4. Delete at First \n 5. Delete at Last \n 6. Delete at Sepcified Index \n 7. Exit");
        System.out.printf("\n Enter Your Choice : ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.printf("\n Enter the Element to be inserted : ");
            String s = sc.next();
            ls.addFirst(s);
            System.out.println(" Added Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print( list +" ");
            System.out.println();
            break;

            case 2:
            System.out.printf("\n Enter the Element to be inserted : ");
            s = sc.next();
            ls.addLast(s);
            System.out.println(" Added Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print(list+" ");
            System.out.println();
            break;

            case 3:
            System.out.printf("\n Enter the Element to be Inserted : ");
            s = sc.next();
            System.out.printf("\n Enter the Index at which Element to be Inserted : ");
            int index = sc.nextInt();
            ls.add(index,s);
            System.out.println(" Added Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print(list+" ");
            System.out.println();
            break;

            case 4:
            ls.removeFirst();
            System.out.println(" Deleted Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print(list+" ");
            System.out.println();
            break;

            case 5:
            ls.removeLast();
            System.out.println(" Deleted Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print(list+" ");
            System.out.println();
            break;

            case 6:
            System.out.printf("\n Enter the Index at which Element to be Deleted : ");
            index = sc.nextInt();
            ls.remove(index);
            System.out.println(" Deleted Succesfully .....");
            System.out.print("\n Linked_List Contains   --->   ");
            for(String list: ls)
                System.out.print(list+" ");
            System.out.println();
            break;

            case 7:
            System.out.println(" Exiting....");
            System.exit(0);
            break;

            default:
            System.out.println(" Invalid Choice....");
            break;
            }
        }
sc.close();
    }
}
