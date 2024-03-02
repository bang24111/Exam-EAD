package com.example.examspring.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "sale_table")
@Data
@SuperBuilder
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "salesmanId", nullable = false)
    private Long salesmanId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prodId",referencedColumnName = "id")
    private Product product;
    @Column(name = "salesmanName")
    private String salesmanName;
    @Column(name = "dOS")
    private LocalDateTime dos;
}
