
public class Component {

    private static int newID;
    private String brand;
    private String name;
    private Double price;
    private int stocks;
    private int ID = 0;




    public Component(String brand, String name, Double price, int stocks) {
        setID();
        setBrand(brand);
        setName(name);
        setPrice(price);
        setStocks(stocks);
    }

    public void display() {

        System.out.println("Manifacturer: " + brand);
        System.out.println("Model: "+ name);
        System.out.println("Price: $"+price);

    }



    public void displayArray() {
        System.out.println(brand + " " + name);
    }

    public int getID() {
        return ID;
    }
    public void setID() {
        this.ID = newID++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

}
