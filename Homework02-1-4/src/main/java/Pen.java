/**
 * Created by veraivanova on 09.09.16.
 */
public class Pen extends WritingUtensils {

//    Pen(String name, double price){
//        this.name = name;
//        this.price = price;
//    }

//    Pen blackCheapPen = new Pen("Простой карандаш", 1.0);

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if(o == null)
        {
            return false;
        }
        if (o == this)
        {
            return true;
        }
        if (getClass() != o.getClass())
        {
            return false;
        }
        Pen myPen = (Pen) o;
        return  (this.getId() == myPen.getId());
    }

    @Override
    public int hashCode() {
        final int  PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();

        return result;
    }
}
