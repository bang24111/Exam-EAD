package com.example.examspring.mapper;

import com.example.examspring.dto.ProductDto;
import com.example.examspring.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product dtoToEntity(ProductDto p);
    ProductDto entityToDto(Product p);
}
