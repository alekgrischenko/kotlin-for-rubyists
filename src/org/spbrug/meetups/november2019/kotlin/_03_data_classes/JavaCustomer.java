package org.spbrug.meetups.november2019.kotlin._03_data_classes;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

class JavaOrder {
    private int productId;
    private int quantity;
    private BigDecimal price;

    public JavaOrder() {
    }

    public JavaOrder(int productId, int quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

public class JavaCustomer {
    private int id;
    private String name;
    private List<JavaOrder> orders;

    public JavaCustomer() {
    }

    public JavaCustomer(int id, String name, List<JavaOrder> orders) {
        this.id = id;
        this.name = name;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JavaOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<JavaOrder> javaOrders) {
        this.orders = javaOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KotlinCustomer customer = (KotlinCustomer) o;
        return getId() == customer.getId() &&
                getName().equals(customer.getName()) &&
                getOrders().equals(customer.getOrders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOrders());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}
