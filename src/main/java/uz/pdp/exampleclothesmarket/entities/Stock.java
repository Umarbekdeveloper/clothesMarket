package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Stock {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private Product product;

    private Integer quantity;
}
