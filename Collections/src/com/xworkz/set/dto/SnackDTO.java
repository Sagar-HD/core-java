package src.com.xworkz.set.dto;

import java.io.Serializable;
import java.util.Objects;

public class SnackDTO implements Serializable, Comparable<SnackDTO> {
    private String name;
    private String flavor;
    private double weight;
    private double price;

    public SnackDTO(String flavor, String name, double price, double weight) {
        this.flavor = flavor;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int compareTo(SnackDTO o) {
        return Double.compare(this.price,o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SnackDTO)) return false;
        SnackDTO snackDTO = (SnackDTO) o;
        return Double.compare(weight, snackDTO.weight) == 0 && Double.compare(price, snackDTO.price) == 0 && Objects.equals(name, snackDTO.name) && Objects.equals(flavor, snackDTO.flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavor, weight, price);
    }

    @Override
    public String toString() {
        return "SnackDTO [name=" + name + ", flavor=" + flavor + ", weight=" + weight + ", price=" + price + "]";
    }
}