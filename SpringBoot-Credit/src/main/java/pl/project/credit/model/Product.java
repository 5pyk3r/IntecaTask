package pl.project.credit.model;

import lombok.Data;

import javax.persistence.*;


@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double value;

    private int creditId;
}
