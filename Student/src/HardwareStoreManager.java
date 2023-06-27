//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HardwareStoreManager {
    public HardwareStoreManager() {
    }

    public static void main(String[] args) {
        HardwareStore store = new HardwareStore("Deborah Furniture World", "+256-781-383307", "Kampala City");
        Product product1 = new Product(1, "Hammer", 30.0, 30000, LocalDateTime.now(),LocalDateTime.now(), LocalDateTime.of(2022, 6, 13, 15, 56),  "Kampala");
        Product product2 = new Product(2, "Nail", 20.0, 20000, LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), "Jinja");
        Product product3 = new Product(3, "Cement", 40.0, 50000, LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(),"Lira");
        System.out.println("StoreName: " + store.getName());
        System.out.println("Contact: " + store.getContact());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Product list " + store.getProducts());
        System.out.println();
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.updateProductStock("Hammer", 15.0);
        store.updateProductStock("Nail", 20.0);
        store.updateProductStock("Cement", 40.0);
        System.out.println("Product list " + store.getProducts());
        System.out.println();
        System.out.println("Product Name: " + product1.getProduct());
        System.out.println("Product_id " + product1.getProduct_id());
        System.out.println("Price of product1: " + product1.getPrice());
        System.out.println("Available stock: " + product1.getStock());
        System.out.println("Created at: " + product1.getCreated_at());
        System.out.println("Updated at: " + product1.getUpdated_at());
        System.out.println();
        System.out.println(" Setting Product2");
        product2.setProduct("Nail");
        product2.setPrice(10000);
        product2.setStock (20.0F);
        product2.setCreated_at(LocalDateTime.of(2023, 6, 22, 12, 56));
        product2.setUpdated_at(LocalDateTime.of(2023, 6, 23, 12, 56));
        System.out.println();
        System.out.println("Product Name: " + product2.getProduct());
        System.out.println("Product_id " + product2.getProduct_id());
        System.out.println("Price of product2: " + product2.getPrice());
        System.out.println("Available stock: " + product2.getStock());
        System.out.println("Created at: " + product2.getCreated_at());
        System.out.println("Updated at: " + product2.getUpdated_at());
        System.out.println();
        store.displayProductList();
        System.out.println("Total Products: " + store.getTotalProducts());
    }
}
