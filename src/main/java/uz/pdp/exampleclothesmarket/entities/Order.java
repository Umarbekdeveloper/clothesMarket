package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import uz.pdp.exampleclothesmarket.entities.enums.Status;

public class Order {
    @Id
    private Integer id;

    @OneToOne
    private Cart cart;

    private Delivery delivery;

    private PromoCode promocode;

    private boolean isActive;

    private Status status;
}
