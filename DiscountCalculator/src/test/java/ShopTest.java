import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    @Test
    public void testSortProductsByPrice() {
        // Создаем магазин и добавляем продукты с разными стоимостями
        Shop shop = new Shop();
        shop.addProduct(new Product("Product 1", 150));
        shop.addProduct(new Product("Product 2", 100));
        shop.addProduct(new Product("Product 3", 200));

        // Сортируем продукты по стоимости
        shop.sortProductsByPrice();

        // Получаем отсортированный список продуктов
        List<Product> sortedProducts = shop.getProducts();

        // Проверяем, что продукты отсортированы по возрастанию стоимости
        assertThat(sortedProducts).extracting(Product::getPrice).isSorted();
    }

    @Test
    public void testGetMostExpensiveProduct() {
        // Создаем магазин и добавляем продукты с разными стоимостями
        Shop shop = new Shop();
        shop.addProduct(new Product("Product 1", 150));
        shop.addProduct(new Product("Product 2", 100));
        shop.addProduct(new Product("Product 3", 200));

        // Получаем самый дорогой продукт
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверяем, что полученный продукт имеет самую высокую стоимость
        assertThat(mostExpensiveProduct.getPrice()).isEqualTo(200);
    }
}
