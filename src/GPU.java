
public class GPU extends Component{

    private int coreClock;
    private int mSize;
    private String mType;
    private boolean rayTracing;


    public GPU(String brand, String name, double price, int stocks,int coreClock, int mSize, String mType, boolean rayTracing) {
        super(brand, name, price, stocks);
        setCoreClock(coreClock);
        setmSize(mSize);
        setmType(mType);
        setRayTracing(rayTracing);
    }

    public void display() {
        super.display();
        System.out.println("Core Clock: "+ coreClock + " MHz");
        System.out.println("Memory Size: " + mSize + " GB");
        System.out.println("Memory Type: " + mType );
        System.out.println("Ray Tracing: "+ isRayTracing(rayTracing));
        System.out.println();
    }

    public int getCoreClock() {
        return coreClock;
    }
    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }
    public int getmSize() {
        return mSize;
    }
    public void setmSize(int mSize) {
        this.mSize = mSize;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String isRayTracing(boolean rayTracing) {
        if (rayTracing == true) {
            return "yes";
        }
        else
            return "no";
    }
    public void setRayTracing(boolean rayTracing) {
        this.rayTracing = rayTracing;
    }


}
