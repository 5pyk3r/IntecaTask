package pl.project.product.service;

import org.springframework.stereotype.Service;
import pl.project.product.model.Product;
import pl.project.product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> findAllProductsByIds(Iterable<Integer> iterable){
        return productRepository.findAllById(iterable);
    }
}
