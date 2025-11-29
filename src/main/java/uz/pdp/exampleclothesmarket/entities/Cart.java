package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.*;
import uz.pdp.exampleclothesmarket.entities.enums.Status;

import java.time.LocalDateTime;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean isActive;

    private Status status;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    private User user;
}
