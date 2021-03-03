package pl.project.product.controller;

import org.springframework.web.bind.annotation.*;
import pl.project.product.model.Product;
import pl.project.product.model.ProductList;
import pl.project.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/GetProducts")
    public ProductList getAllProducts(@RequestParam(value = "creditsIds")Iterable<Integer> listOfIds){

        ProductList productList = new ProductList();
        productList.setProductList(productService.findAllProductsByIds(listOfIds));
        return productList;
    }

    @PostMapping("/CreateProduct")
    public void createProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }


}
