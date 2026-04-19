package ma.enset.universitytp2.controller;

import lombok.RequiredArgsConstructor;
import ma.enset.universitytp2.entity.Product;
import ma.enset.universitytp2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id){
        return productRepo.findById(id).get();
    }


}
