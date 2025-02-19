package consultation_22;

import consultation_22.model.Product;
import consultation_22.model.Category;
import consultation_22.service.ProductService;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

public class ShopApp {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Создаем категории
        Category electronika = new Category(1, "Electronika");
        Category toys = new Category(2, "Toys");
        Category autoAccessories = new Category(3, "Auto Accessories");

        // Создаем продукты
        Product product1 = new Product(1, "Laptop", electronika, 1500);
        Product product2 = new Product(2, "Smartphone", electronika, 700);
        Product product3 = new Product(3, "VacuumCleaner", electronika, 300);

        Product product4 = new Product(4, "Barby", toys, 49);
        Product product5 = new Product(5, "Bear", toys, 69);
        Product product6 = new Product(6, "Cat", toys, 39);

        Product product7 = new Product(7, "Car rugs", autoAccessories, 100);
        Product product8 = new Product(8, "Car seat", autoAccessories, 200);
        Product product9 = new Product(9, "Car mirror", autoAccessories, 150);

        // Добавление продуктов
        System.out.println("=== Добавление продуктов ===");
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
        productService.addProduct(product4);
        productService.addProduct(product5);
        productService.addProduct(product6);
        productService.addProduct(product7);
        productService.addProduct(product8);
        productService.addProduct(product9);

        // Поиск по категории
        System.out.println("\n=== Продукты в категории 'Игрушки' ===");
        List<Product> toysProducts = productService.getProductByCategory(toys);
        toysProducts.forEach(System.out::println);

        // Добавление продуктов
        System.out.println("\n=== Последние 3 добавленных продукта ===");
        List<Product> recentProducts = productService.getRecentProducts(3);
        recentProducts.forEach(System.out::println);

        // Сортировка по цене (по возрастанию)
        System.out.println("\n=== Продукты, отсортированные по цене ===");
        productService.getSortedByPrice().forEach(System.out::println);

        // Сортировка по цене (по убыванию)
        System.out.println("\n=== Продукты, отсортированные по цене (по убыванию) ===");
        productService.getSortedByPriceDesc().forEach(System.out::println);

        // Уникальные категории
        System.out.println("\n=== Уникальные категории ===");
        productService.getUniqueCategories().forEach(System.out::println);

        // Поиск по имени
        System.out.println("\n=== Поиск продуктов, содержащих 'car' ===");
        productService.searchProducts("car").forEach(System.out::println);

        // Статистики по ценам
        System.out.println("\n=== Статистика цен по категориям ===");
        Map<Category, DoubleSummaryStatistics> priceStats = productService.getPriceStatsByCategory();
        priceStats.forEach((category, stats) ->
                System.out.printf("Категория: %s%n" +
                                "  Средняя цена: %.2f%n" +
                                "  Минимальная цена: %.2f%n" +
                                "  Максимальная цена: %.2f%n" +
                                "  Всего продуктов: %d%n",
                        category.getName(), stats.getAverage(),
                        stats.getMin(), stats.getMax(), stats.getCount())
        );
    }
}
