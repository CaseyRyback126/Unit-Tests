import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> productList;

    public Shop() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public void sortProductsByPrice() {
        productList.sort(Comparator.comparing(Product::getPrice));
    }

    public Product getMostExpensiveProduct() {
        if (productList.isEmpty()) {
            throw new IllegalStateException("Shop is empty");
        }

        return productList.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new IllegalStateException("No products found"));
    }
}
