package info.luckydog.tools.utils;

public class Product {

    private Double no;
    private String name;
    private Double weight;
    private Double amount;

    public Product(Double no, String name, Double weight, Double amount) {
        this.no = no;
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }

    public Double getNo() {
        return no;
    }

    public void setNo(Double no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
