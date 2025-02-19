package consultation_22.service;

import consultation_22.model.Category;
import consultation_22.model.Product;

import java.util.*;
import java.util.stream.Collectors;


public class ProductService {
    // Демонстрация работы с ArrayList
    private List<Product> productList = new ArrayList<>();

    // Демонстрация работы с HashSet
    private Set<Category> categories = new HashSet<>();

    // Демонстрация работы с LinkedList
    private List<Product> recentProducts = new LinkedList<>();

    // Демонстрация работы с TreeSet (сортированное множество)
    private Set<Product> sortedProducts = new TreeSet<>(Comparator.comparing(Product::getPrice));

    // Метод для добавления продукта (демонстрация работы с ArrayList)
    public void addProduct(Product product) {
        productList.add(product);             // добавляем новый продукт в конец списка
        recentProducts.add(0, product); // добавляем нeдавние продукты
        sortedProducts.add(product); // Автоматически сортируется по цене
        categories.add(product.getCategory()); // Автоматически исключаются дубликаты категорий
    }

    // Получение всех продуктов определенной категории (демонстрация фильтрации)
    public List<Product> getProductByCategory(Category category) {
        return productList.stream().filter(product -> product.getCategory().equals(category)).collect(Collectors.toList());
    }

    // Получение последних добавленных продуктов (демонстрация работы с LinkedList)
    public List<Product> getRecentProducts(int count) {
        return recentProducts.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    // Получение отсортированных по цене продуктов (демонстрация работы с TreeSet)
    public Set<Product> getSortedByPrice() {
        return sortedProducts;
    }

    // Получение отсортированных по цене продуктов по убыванию
    public List<Product> getSortedByPriceDesc() {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    // Получение уникальных категорий (демонстрация работы с HashSet)
    public Set<Category> getUniqueCategories() {
        return new HashSet<>(categories);
    }

    // Поиск продуктов по имени (демонстрация работы со Stream API и коллекциями)
    public List<Product> searchProducts(String nameProduct) {
        return productList.stream()
                .filter(p -> p.getName().toLowerCase().contains(nameProduct.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Получение статистики по ценам в категории (демонстрация агрегации)
    public Map<Category, DoubleSummaryStatistics> getPriceStatsByCategory() {
        return productList.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.summarizingDouble(Product::getPrice)
                ));
    }
}