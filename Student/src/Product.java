import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


class Product {
    private int product_id;
    private String product;
    private double stock;
    private int price;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime expiry_date;
    private String branch;

    public Product (int product_id,String product,double stock,int  price,LocalDateTime created_at,LocalDateTime updated_at,LocalDateTime expiry_date,String branch){
        this.product_id = product_id;
        this.product    = product;
        this.stock      = stock;
        this.price      = price;
        this.created_at =created_at;
        this.updated_at = updated_at;
        this.expiry_date=expiry_date;
        this.branch     =branch;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(Float stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public LocalDateTime getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDateTime expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void updateStock(Float quantity) {
        stock += quantity;
    }

}
