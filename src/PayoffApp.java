import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard amex = new CreditCard("American Express", 18.4, 402);
        System.out.println(amex);
        
        //list is the parent type of ArrayList
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            aprs.add(apr); //add each apr to the ArrayList

            double balance = scan.nextDouble();

            //the commented section is the same as the line below it
            // CreditCard myCard = new CreditCard(name, apr, balance);
            // cards.add(myCard);
            cards.add(new CreditCard(name, apr, balance));

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }


        Collections.sort(aprs, Collections.reverseOrder());
        
        System.out.println(aprs);
        System.out.println(cards);
    }
}
