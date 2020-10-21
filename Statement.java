import java.util.Enumeration;

public class Statement {
  protected String S1 = "";
  protected String S2 = "";
  protected String S3 = "";
  protected String S4 = "";
  protected String S5 = "";
  protected String S6 = "";
  protected String S7 = "";
  protected String S8 = "" ;
  protected String S9 = "";

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