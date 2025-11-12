import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        if (inventory == null) {
            return -1;
        }
        if (inventory.get(productId) == null) {
            return -1;
        }
        return inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        if (inventory == null) {
            return null;
        }
        List<String> result = new ArrayList<>();
        inventory.forEach((product, Price) -> {
            if (Price == price) {
                result.add(product);
            }
        });
        return result;
    }
}