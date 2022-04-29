import java.util.ArrayList;
import java.util.List;

public class Shop implements Addtocart{

    @Override
    public void addCart(Component c, int quantity) {

        if (c.getStocks() == 0){
            System.out.println("Item is currently out of stock");
        }
        else if (quantity == 0){
            System.out.println("Invalid item quantity for " + c.getBrand() + " " + c.getName());
        }
        else if(c.getStocks() < quantity){
            System.out.println("Not enough stocks for " + c.getBrand() + " " + c.getName());
        }
        else {
            cart.add(new Cart(c.getBrand(), c.getName(), c.getPrice(), c.getStocks(), quantity));
        }
    }
    @Override
    public List getCart() {

        return cart;
    }


    public static void main(String[] args) {


        Component c1 = new CPU("Intel", "i5-11400", 182.00, 2, "LGA1200", 6, 12, 2.40);
        //c1.display();
        Component c2 = new GPU("MSI", "RTX 3070 Gaming X Trio", 420.00, 2, 1830, 8, "GDDR6", true);
        Component c3 = new Motherboard("MSI", "H510M-A-PRO", 189.99, 3, "H510", "LGA1200", 2);
        Component c4 = new RAM("Kingston", "Fury Beast", 163.0, 4, "DDR4", 16, 3600);

        List<Component> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(new CPU("Ryzen", "5 5600x", 149.99, 3, "AM4", 8, 12, 2.80));
        list.add(new RAM("Corsair", "Vengeance", 122.00 , 2, "DDR4", 16, 3200));
        list.forEach(Component -> Component.display());

        Shop cart = new Shop();
        cart.addCart(c1, 2);
        cart.addCart(c2, 2);
        cart.addCart(c3, 1);
        cart.addCart(c4, 1);
        cart.addCart(list.get(5),2);

        List<Cart> list2 = cart.getCart();
        list2.forEach(Cart->Cart.cashOut());

        double total = 0;
        for (Cart i : list2){
            double total1 = i.getPrice() * i.getQuantity();
            total = total1 + total;
        }
        System.out.println("Total: $"+total);

        Paymentmethod pm = Paymentmethod.INSTALLMENT;
        pm.payment();

    }
}
