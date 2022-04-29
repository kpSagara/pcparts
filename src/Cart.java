
public class Cart extends Component {
    private int quantity;
    private double itemTotal = 0;

    public Cart(String brand, String name,double price, int stocks, int quantity) {
        super(brand,name,price,stocks);
        setQuantity(quantity);
    }


    public void displayArray() {
        System.out.print(quantity + " ");
        super.displayArray();

    }

    public void cashOut() {
        itemTotal = (quantity*getPrice());
        System.out.println(quantity + " " + getBrand() + " " + getName() + " $"  + itemTotal);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
