package ma.enset.universitytp2.controller;


import ma.enset.universitytp2.entity.Product;
import ma.enset.universitytp2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id){
        return productRepo.findById(id).orElseThrow(()->new RuntimeException("product not found"));
    }
    @GetMapping("/find/products")
    public  List<Product> findProductByName(@RequestParam(name = "kw", defaultValue = "") String kw){
        return productRepo.findByNameContains(kw);
    }
    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productRepo.save(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable Long id){
        productRepo.deleteById(id);
    }


}
