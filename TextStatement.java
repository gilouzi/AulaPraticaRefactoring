import java.util.Enumeration;

public class TextStatement extends Statement {
    String S1 = "Rental Record for ";
    String S2 = "\n";
    String S3 = "\t";
    String S4 = "\t";
    String S5 = "\n";
    String S6 = "Amount owed is ";
    String S7 = "\n";
    String S8 = "You earned " ;
    String S9 = " frequent renter points"; 

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = S1 + aCustomer.getName() +
        S2;
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += S3 + each.getMovie().getTitle()+ S4 +
           String.valueOf(each.getCharge()) + S5;
        }
        //add footer lines
        result += S6 +
        String.valueOf(aCustomer.getTotalCharge()) + S7;
        result += S8 +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        S9;
        return result;
     }
}