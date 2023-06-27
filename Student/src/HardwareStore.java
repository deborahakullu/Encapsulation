
//write a java program that manages a hardware store. The store must have a name,contact and where it is located.The store
//consists of different products. new products can be added to the store each new day and the store manager keeps track of all these
//new products.The store manager always updates these products based on the number in stock once  a new product has been brought.
//The manager presents a list of these products to his boss with the total products in the store
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class HardwareStore {
    private String name;
    private String contact;
    private String location;
    private List<Product> products;

    public HardwareStore(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void updateProductStock(String productName, double quantity) {
        Iterator var4 = this.products.iterator();

        while(var4.hasNext()) {
            Product product = (Product)var4.next();
            if (product.getProduct().equals(productName)) {
                product.updateStock ((float) quantity);
                break;
            }
        }

    }

    public void displayProductList() {
        System.out.println("Product List:");
        Iterator var1 = this.products.iterator();

        while(var1.hasNext()) {
            Product product = (Product)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = product.getProduct();
            var10000.println(var10001 + " - Stock: " + product.getStock());
        }

    }

    public double getTotalProducts() {
        return (double)this.products.size();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
