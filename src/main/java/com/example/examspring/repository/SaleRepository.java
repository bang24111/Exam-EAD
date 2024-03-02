package com.example.examspring.repository;

import com.example.examspring.entity.Product;
import com.example.examspring.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>, JpaSpecificationExecutor {
    List<Sale> findByProduct(Product product);
}
