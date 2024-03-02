package com.example.examspring.service;

import com.example.examspring.dto.ProductDto;
import com.example.examspring.dto.PageDto;

public interface ProductService {
    PageDto<ProductDto> gets(ProductDto criteria);
    ProductDto getById(Long id);
}
