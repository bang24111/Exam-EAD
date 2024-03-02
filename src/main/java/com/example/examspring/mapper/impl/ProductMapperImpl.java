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
//import com.example.examspring.mapper.ProductMapper;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ProductMapperImpl implements ProductMapper {
//
//    @Override
//    public Product dtoToEntity(ProductDto p) {
//        if ( p == null ) {
//            return null;
//        }
//
//        Product product = new Product();
//
//        product.setId( p.getId() );
//        product.setProdName( p.getProdName() );
//        product.setDescription( p.getDescription() );
//        product.setDateOfManf( p.getDateOfManf() );
//        product.setPrice( p.getPrice() );
//        product.setSaleList( saleDtoListToSaleList( p.getSaleList() ) );
//
//        return product;
//    }
//
//    @Override
//    public ProductDto entityToDto(Product p) {
//        if ( p == null ) {
//            return null;
//        }
//
//        ProductDto productDto = new ProductDto();
//
//        productDto.setId( p.getId() );
//        productDto.setProdName( p.getProdName() );
//        productDto.setDescription( p.getDescription() );
//        productDto.setDateOfManf( p.getDateOfManf() );
//        productDto.setPrice( p.getPrice() );
//        productDto.setSaleList( saleListToSaleDtoList( p.getSaleList() ) );
//
//        return productDto;
//    }
//
//    protected Sale saleDtoToSale(SaleDto saleDto) {
//        if ( saleDto == null ) {
//            return null;
//        }
//
//        Sale sale = new Sale();
//
//        sale.setId( saleDto.getId() );
//        sale.setSalesmanId( saleDto.getSalesmanId() );
//        sale.setProduct( dtoToEntity( saleDto.getProduct() ) );
//        sale.setSalesmanName( saleDto.getSalesmanName() );
//        sale.setDOS( saleDto.getDOS() );
//
//        return sale;
//    }
//
//    protected List<Sale> saleDtoListToSaleList(List<SaleDto> list) {
//        if ( list == null ) {
//            return null;
//        }
//
//        List<Sale> list1 = new ArrayList<Sale>( list.size() );
//        for ( SaleDto saleDto : list ) {
//            list1.add( saleDtoToSale( saleDto ) );
//        }
//
//        return list1;
//    }
//
//    protected SaleDto saleToSaleDto(Sale sale) {
//        if ( sale == null ) {
//            return null;
//        }
//
//        SaleDto saleDto = new SaleDto();
//
//        saleDto.setId( sale.getId() );
//        saleDto.setSalesmanId( sale.getSalesmanId() );
//        saleDto.setSalesmanName( sale.getSalesmanName() );
//        saleDto.setDOS( sale.getDOS() );
//        saleDto.setProduct( entityToDto( sale.getProduct() ) );
//
//        return saleDto;
//    }
//
//    protected List<SaleDto> saleListToSaleDtoList(List<Sale> list) {
//        if ( list == null ) {
//            return null;
//        }
//
//        List<SaleDto> list1 = new ArrayList<SaleDto>( list.size() );
//        for ( Sale sale : list ) {
//            list1.add( saleToSaleDto( sale ) );
//        }
//
//        return list1;
//    }
//}
