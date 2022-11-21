package ArryList;

public class Phone{
    private String Brand;
    private int Price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        Brand = brand;
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
