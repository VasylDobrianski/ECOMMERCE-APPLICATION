import category.Category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remainingStock;
    private UUID categoryId;

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStock, UUID categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingStock = remainingStock;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception {
        //Category ID --> goes to database --> checks all category IDs --> finds matching category to selected product

        for (Category category : StaticConstants.CATEGORY_LIST){
            if (getCategoryId().toString().equals(category.getId().toString())){
                return category.getName();
            }
        }
        throw new Exception("Category not found," + getName());
        //null.[any string method] --> null pointer exception (NOTE LINE)
    }

    public LocalDateTime getDeliveryDueDate() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST){
            if (getCategoryId().toString().equals(category.getId().toString())){
                return category.findDeliveryDueDate();
            }
        }
        throw new Exception("Category could not be found");
    }

}
