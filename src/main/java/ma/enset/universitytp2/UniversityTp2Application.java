package ma.enset.universitytp2;

import ma.enset.universitytp2.entity.Product;
import ma.enset.universitytp2.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversityTp2Application {


    public static void main(String[] args) {
        SpringApplication.run(UniversityTp2Application.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo) {
        return args -> {
            Product p1 = new Product();
            p1.setName("Playstation5");
            p1.setPrice(5000);
            p1.setQuantity(3);
            Product p2 = new Product();
            p2.setName("PC");
            p2.setPrice(8500);
            p2.setQuantity(2);
           Product p3 = new Product(null,"Iphone",9000,2);
           productRepo.save(p1);
           productRepo.save(p2);
           productRepo.save(p3);
           List<Product> products = productRepo.findAll();
           products.stream().forEach(System.out::println);

        };
    }


    }

