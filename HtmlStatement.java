import java.util.Enumeration;

public class HtmlStatement extends Statement {
    String S1 = "<H1>Rentals for <EM>";
    String S2 = "</EM></H1><P>\n";
    String S3 = "";
    String S4 = ": ";
    String S5 = "<BR>\n";
    String S6 = "<P>You owe <EM>";
    String S7 = "</EM><P>\n";
    String S8 = "On this rental you earned <EM>";
    String S9 = "</EM> frequent renter points<P>"; 


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