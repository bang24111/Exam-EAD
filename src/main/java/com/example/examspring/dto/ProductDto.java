package com.example.examspring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public class ProductDto extends PageDto<PageDto> {
    private long id;
    private String prodName;
    private String description;
    private LocalDateTime dateOfManf;
    private double price;
    private List<SaleDto> saleList;
}
