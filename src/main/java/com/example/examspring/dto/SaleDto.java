package com.example.examspring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Data
@SuperBuilder
@NoArgsConstructor
public class SaleDto extends PageDto<PageDto> {
    private long id;
    private Long salesmanId;
    private String salesmanName;
    private LocalDateTime dos;
    private ProductDto product;
}
