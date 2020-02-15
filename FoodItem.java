public class FoodItem {
    private String name;
    private double price;
    private String type;
    private String storeName;
    private String restriction;

    public FoodItem(String name, double price, String type, String storeName, String restriction) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.storeName = storeName;
        this.restriction = restriction;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", type='" + getType() + "'" +
            ", storeName='" + getStoreName() + "'" +
            ", restriction='" + getRestriction() + "'" +
            "}";
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getRestriction() {
        return this.restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

}