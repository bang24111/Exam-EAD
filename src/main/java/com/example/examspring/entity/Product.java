package com.example.examspring.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "product_table")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "prodName", nullable = false)
    private String prodName;
    @Column(name = "description")
    private String description;
    @Column(name = "dateOfManf")
    private LocalDateTime dateOfManf;
    @Column(name = "price")
    private double price;
}
