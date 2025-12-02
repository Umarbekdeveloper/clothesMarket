package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.*;
import uz.pdp.exampleclothesmarket.entities.enums.Size;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;

//    private String image;

    private String color;

    @Enumerated(EnumType.STRING)
    private Size size;

    private boolean forMale;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Tag> tagIds;

    private Double totalRating;

    private String brandName;

    @ManyToMany(mappedBy = "products")
    @JoinTable(
            name = "product_files",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "file_id", referencedColumnName = "id")
    )
    private List<Files> images;

}
