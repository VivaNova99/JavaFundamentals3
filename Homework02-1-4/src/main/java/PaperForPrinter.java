/**
 * Created by veraivanova on 09.09.16.
 */
public class PaperForPrinter extends WritingPaper {

    private int price;
    private String name;

    public PaperForPrinter(int price, String name) {
        this.price = price;
        this.name = name;
    }

    String getName(){return name;}

    int getPrice(){return price;}

}
