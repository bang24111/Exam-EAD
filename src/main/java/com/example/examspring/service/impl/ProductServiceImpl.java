package com.example.examspring.service.impl;

import com.example.examspring.dto.ProductDto;
import com.example.examspring.dto.PageDto;
import com.example.examspring.entity.Product;
import com.example.examspring.entity.Sale;
import com.example.examspring.mapper.ProductMapper;
import com.example.examspring.mapper.SaleMapper;
import com.example.examspring.repository.ProductRepository;
import com.example.examspring.repository.SaleRepository;
import com.example.examspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private ProductMapper mapper;

    @Autowired
    private SaleMapper saleMapper;

    @Override
    public PageDto<ProductDto> gets(ProductDto criteria) {
        Pageable pageable = PageRequest.of(criteria.getPageNumber(), criteria.getPageSize());
        Page<Product> products = repository.findAll(pageable);

        List<ProductDto> productDtos = products.getContent()
                .stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());

        PageDto<ProductDto> pageDto = new PageDto<>();
        pageDto.setPageNumber(products.getNumber());
        pageDto.setPageSize(products.getSize());
        pageDto.setTotalPages(products.getTotalPages());
        pageDto.setList(productDtos);

        return pageDto;
    }

    @Override
    public ProductDto getById(Long id) {
        if (id == null) {
            return new ProductDto();
        }

        Optional<Product> product = repository.findById(id);
        ProductDto result = mapper.entityToDto(product.get());

        List<Sale> saleList = saleRepository.findByProduct(product.get());

        result.setSaleList(saleList.stream().map(saleMapper::entityToDto).collect(Collectors.toList()));

        return result;
    }
}
