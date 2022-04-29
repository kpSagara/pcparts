
public class Motherboard extends Component{

    private String chipset;
    private String socket;
    private int mSlots;

    public Motherboard(String brand, String name, Double price, int stocks, String chipset, String socket, int mSlots)	{
        super(brand,name,price,stocks);
        setChipset(chipset);
        setSocket(socket);
        setmSlots(mSlots);

    }

    public void display() {
        super.display();
        System.out.println("CPU Chipset: " + chipset);
        System.out.println("CPU Socket: " + socket);
        System.out.println("RAM Slots: " + mSlots);
        System.out.println();
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getmSlots() {
        return mSlots;
    }

    public void setmSlots(int mSlots) {
        this.mSlots = mSlots;
    }

}
