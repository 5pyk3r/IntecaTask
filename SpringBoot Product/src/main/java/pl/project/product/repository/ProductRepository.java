package pl.project.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.project.product.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query( "select o from Product o where o.id in :ids" )
    List<Product> findByInventoryIds(@Param("ids") List<Integer> inventoryIdList);
}
