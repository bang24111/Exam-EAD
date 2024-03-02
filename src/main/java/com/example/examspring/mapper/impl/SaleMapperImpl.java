//package com.example.examspring.mapper.impl;
//
//import com.example.examspring.dto.ProductDto;
//import com.example.examspring.dto.SaleDto;
//import com.example.examspring.entity.Product;
//import com.example.examspring.entity.Sale;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.processing.Generated;
//
//import com.example.examspring.mapper.SaleMapper;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SaleMapperImpl implements SaleMapper {
//
//    @Override
//    public Sale dtoToEntity(SaleDto p) {
//        if ( p == null ) {
//            return null;
//        }
//
//        Sale sale = new Sale();
//
//        sale.setId( p.getId() );
//        sale.setSalesmanId( p.getSalesmanId() );
//        sale.setProduct( productDtoToProduct( p.getProduct() ) );
//        sale.setSalesmanName( p.getSalesmanName() );
//        sale.setDOS( p.getDOS() );
//
//        return sale;
//    }
//
//    @Override
//    public SaleDto entityToDto(Sale p) {
//        if ( p == null ) {
//            return null;
//        }
//
//        SaleDto saleDto = new SaleDto();
//
//        saleDto.setId( p.getId() );
//        saleDto.setSalesmanId( p.getSalesmanId() );
//        saleDto.setSalesmanName( p.getSalesmanName() );
//        saleDto.setDOS( p.getDOS() );
//        saleDto.setProduct( productToProductDto( p.getProduct() ) );
//
//        return saleDto;
//    }
//
//    protected List<Sale> saleDtoListToSaleList(List<SaleDto> list) {
//        if ( list == null ) {
//            return null;
//        }
//
//        List<Sale> list1 = new ArrayList<Sale>( list.size() );
//        for ( SaleDto saleDto : list ) {
//            list1.add( dtoToEntity( saleDto ) );
//        }
//
//        return list1;
//    }
//
//    protected Product productDtoToProduct(ProductDto productDto) {
//        if ( productDto == null ) {
//            return null;
//        }
//
//        Product product = new Product();
//
//        product.setId( productDto.getId() );
//        product.setProdName( productDto.getProdName() );
//        product.setDescription( productDto.getDescription() );
//        product.setDateOfManf( productDto.getDateOfManf() );
//        product.setPrice( productDto.getPrice() );
//        product.setSaleList( saleDtoListToSaleList( productDto.getSaleList() ) );
//
//        return product;
//    }
//
//    protected List<SaleDto> saleListToSaleDtoList(List<Sale> list) {
//        if ( list == null ) {
//            return null;
//        }
//
//        List<SaleDto> list1 = new ArrayList<SaleDto>( list.size() );
//        for ( Sale sale : list ) {
//            list1.add( entityToDto( sale ) );
//        }
//
//        return list1;
//    }
//
//    protected ProductDto productToProductDto(Product product) {
//        if ( product == null ) {
//            return null;
//        }
//
//        ProductDto productDto = new ProductDto();
//
//        productDto.setId( product.getId() );
//        productDto.setProdName( product.getProdName() );
//        productDto.setDescription( product.getDescription() );
//        productDto.setDateOfManf( product.getDateOfManf() );
//        productDto.setPrice( product.getPrice() );
//        productDto.setSaleList( saleListToSaleDtoList( product.getSaleList() ) );
//
//        return productDto;
//    }
//}
