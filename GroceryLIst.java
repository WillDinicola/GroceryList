import java.util.*;

public class GroceryLIst {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();


        int loop = 0;

        while (loop == 0) {
            System.out.println("Grocery List");
            System.out.println("-------------");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Show Items");
            System.out.println("4. Exit");

            int userinput;
            userinput = scan.nextInt();
            String item;


            if (userinput == 1) {
                System.out.println("Enter an item to add: ");
                item = scan.next();
                list.add(item);
            } else if (userinput == 2) {
                System.out.println("Enter an item to remove: ");
                item = scan.next();
               boolean result = list.remove(item);
               if(result == false)
               {
                   System.out.println("Item not found");
                   System.out.println();
               }
            } else if (userinput == 3) {
            System.out.println("Items: ");
                for (String str : list) {
                    System.out.println(str);
                }
                System.out.println();
            }else if (userinput == 4) {
                System.out.println("Exiting program");
                System.exit(0);
            }

        }
    }
}









