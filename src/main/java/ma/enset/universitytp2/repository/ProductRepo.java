package ma.enset.universitytp2.repository;

import ma.enset.universitytp2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
