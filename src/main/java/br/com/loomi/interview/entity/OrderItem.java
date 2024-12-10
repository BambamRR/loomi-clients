package br.com.loomi.interview.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderItemId;

    @OneToMany
    @JoinColumn(name = "orderId")
    private Order order;

    @OneToMany
    @JoinColumn(name = "productId")
    private Product product;

    @Column(name = "qtt_item")
    private Integer qttItem;

    @Column(name = "item_price")
    private BigDecimal itemPrice;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    public OrderItem(){

    }

    public OrderItem(UUID orderItemId, Order order, Product product, Integer qttItem, BigDecimal itemPrice, BigDecimal subtotal) {
        this.orderItemId = orderItemId;
        this.order = order;
        this.product = product;
        this.qttItem = qttItem;
        this.itemPrice = itemPrice;
        this.subtotal = subtotal;
    }

    public Integer getQttItem() {
        return qttItem;
    }

    public void setQttItem(Integer qttItem) {
        this.qttItem = qttItem;
    }

    public UUID getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(UUID orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {

        this.subtotal = subtotal;
    }
}
