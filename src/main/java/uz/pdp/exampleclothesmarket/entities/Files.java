package uz.pdp.exampleclothesmarket.entities;

import jakarta.persistence.*;
import uz.pdp.exampleclothesmarket.entities.enums.FileType;

import java.util.List;

@Entity
public class Files {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String url;

    private FileType fileType;

    private String size;

    @ManyToMany(mappedBy = "images")
    private List<Product> products;
}
