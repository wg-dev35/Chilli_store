//05-22-23 Project#1 // William Alguera


import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        
        //variables
            double adultPrice = 7;
            double childPrice = 4;
            Scanner kb = new Scanner(System.in);
            int adults;
            int kids;
        //output
        System.out.println("(>'-')><('-'<)^('-')^ v('-')v>'-')><('-'<)^('-')^ v('-')v(>'-')>^('-')^<('-')>");
        System.out.print("HI! Welcome to Chili To GO Ordering System; how many Adults will be with us? >> ");
        adults = kb.nextInt();
        System.out.print("Great! Now how many Kids will be with us? >> ");
        kids = kb.nextInt();
        System.out.println("(>'-')><('-'<)^('-')^ v('-')v>'-')><('-'<)^('-')^ v('-')v(>'-')>^('-')^<('-')>\n");
        System.out.println("Awesome! Heres a Summary of your total order: ");
        System.out.println("Adults: " + adults);
        System.out.println("Children: " + kids);
        System.out.println("Your order total comes to:  $" + ((adultPrice * adults) + (childPrice * kids)));
        System.out.println("\n(>'-')><('-'<)^('-')^ v('-')v>'-')><('-'<)^('-')^ v('-')v(>'-')>^('-')^<('-')>");
        System.out.println("Hope to see you again soon! Enjoy your meal!");
        kb.close();

    
    
    
    }//end - main
}
