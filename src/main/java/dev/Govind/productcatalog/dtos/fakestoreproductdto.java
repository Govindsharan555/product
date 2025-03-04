package dev.Govind.productcatalog.dtos;

import lombok.Getter;
import lombok.Setter;

// GoivndSharanrr
@Setter
@Getter
public class fakestoreproductdto {

    private String id;
    private String title;
    private double price;
    private String category;
    private String descriptions;
    private String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
