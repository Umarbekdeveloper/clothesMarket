package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    private Integer id;

    @ManyToOne
    private User user;

    private Double rating;

    private String comment;

}
