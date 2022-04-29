
public class CPU extends Component{

    private int cores;
    private int threads;
    private double speed;
    private String socket;

    public CPU(String brand, String name, double price, int stocks,String socket, int cores, int threads,double speed) {
        super(brand, name, price, stocks);
        setSocket(socket);
        setCores(cores);
        setThreads(threads);
        setSpeed(speed);
    }

    public void display() {
        super.display();
        System.out.println("CPU Socket: "+ socket);
        System.out.println("Cores: " + cores);
        System.out.println("Threads " + threads);
        System.out.println("Base Frequency: " + speed + " GHz");
        System.out.println();
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }



}
