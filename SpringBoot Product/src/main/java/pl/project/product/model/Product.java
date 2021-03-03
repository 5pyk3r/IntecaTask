package pl.project.product.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "productName")
    private String name;

    private double value;

    private int creditId;
}
