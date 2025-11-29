package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Delivery {
    @Id
    private Integer id;

    private String country;

    @ManyToOne
    private User user;

//    @OneToOne
//    private Order order;
}
