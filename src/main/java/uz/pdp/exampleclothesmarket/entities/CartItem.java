package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class CartItem {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;

    private Integer quantity;

    private Float totalPrice;
}
