package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tag {

    @Id
    private Integer id;

    private String name;


}
