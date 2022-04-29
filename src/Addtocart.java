import java.util.ArrayList;
import java.util.List;

public interface Addtocart {
    List<Cart> cart = new ArrayList<>();
    void addCart(Component cart, int quantity);

    List<?> getCart();


}
