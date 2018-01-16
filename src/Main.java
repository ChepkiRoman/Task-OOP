import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Finder finder = new Finder();
        int criteria = 0;
        String firstCriteriaParam = "", secondCriteriaParam = "";

        System.out.println("Enter the amount of criterias: 1 or 2");
        Scanner scannerForAmount = new Scanner(System.in);
        if (scannerForAmount.hasNextInt()) {
            criteria = scannerForAmount.nextInt();
        }
        if (criteria == 1) {
            finder.OneCriteria("CAPACITY");
        } else if (criteria == 2) {
            finder.TwoCriteria("POWER_CONSUMPTION", "WEIGHT");
        }
    }

}
