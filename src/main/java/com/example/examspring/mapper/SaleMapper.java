package com.example.examspring.mapper;

import com.example.examspring.dto.SaleDto;
import com.example.examspring.entity.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleMapper {
    Sale dtoToEntity(SaleDto p);
    SaleDto entityToDto(Sale p);
}
