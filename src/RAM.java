
public class RAM extends Component{

    private String type;
    private int size;
    private int speed;

    public RAM(String brand, String name, Double price, int stocks, String type, int size, int speed) {
        super(brand,name,price,stocks);
        setType(type);
        setSize(size);
        setSpeed(speed);
    }

    public void display() {
        super.display();
        System.out.println("Memory Type: " + type);
        System.out.println("Memory Size: " + size + " GB");
        System.out.println("Frequency: " + speed + " MT/s");
        System.out.println();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
