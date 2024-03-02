package com.example.examspring.controller;

import com.example.examspring.dto.PageDto;
import com.example.examspring.dto.ProductDto;
import com.example.examspring.dto.SaleDto;
import com.example.examspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductController{
    @Autowired
    private ProductService service;

    public static final int PAGE_SIZE = 10;
    public static final int PAGE_NUMBER = 0;

    //View
    @GetMapping(value = "/products")
    public ModelAndView gets(@RequestParam(value = "pageNumber", required = false) Integer pageNumber,
                             @RequestParam(value = "pageSize", required = false) Integer pageSize,
                             HttpServletRequest request) {
        ProductDto criteria = new ProductDto();
        if (pageNumber == null || pageNumber < 0) {
            criteria.setPageNumber(PAGE_NUMBER);
        } else {
            criteria.setPageNumber(pageNumber);
        }
        if (pageSize == null || pageSize <= 0) {
            criteria.setPageSize(PAGE_SIZE);
        } else {
            criteria.setPageSize(pageSize);
        }
        ModelAndView view = new ModelAndView("product/list");
        PageDto<ProductDto> productDtoPageDto = service.gets(criteria);

        view.addObject("products", productDtoPageDto.getList());
        view.addObject("pages", productDtoPageDto);
        return view;
    }

    @GetMapping(value = "/product")
    public ModelAndView gets(@RequestParam() Long id,
                             HttpServletRequest request) {
        ModelAndView view = new ModelAndView("product/detail");
        ProductDto productDto = service.getById(id);

        view.addObject("product", productDto);
        view.addObject("saleList", productDto.getSaleList());
        return view;
    }
}
