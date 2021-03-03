package pl.project.credit.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.project.credit.dto.DataDto;
import pl.project.credit.model.*;
import pl.project.credit.service.CreditService;

import java.util.List;

@RestController
@RequestMapping("/credits")
public class CreditController {

    private CreditService creditService;
    private RestTemplate restTemplate;

    public CreditController(CreditService creditService, RestTemplate restTemplate) {
        this.creditService = creditService;
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/GetCredits")
    public List<Credit> getAllCredits() {

        //taking credit ids
        Iterable<Integer> creditsIds = creditService.findAllCreditByIds();

        //aggregates products with specific ids
        ProductList products = restTemplate.getForObject("http://product:8081/products/GetProducts" + creditsIds,  ProductList.class);
        CustomerList customers = restTemplate.getForObject("http://customer:8082/customers/GetCustomers", CustomerList.class);
        return creditService.findAllCredits();
    }

    @PostMapping(value = "/CreateCredit", consumes ="application/json")
    public int createCredit(@RequestBody DataDto data) {
        //data from request
        Credit credit = data.getCredit();
        Product product = data.getProduct();
        Customer customer = data.getCustomer();

        creditService.saveCredit(credit);
        //taking credit id
        product.setCreditId(credit.getId());
        customer.setCreditId(credit.getId());

        //connecting to microservices for posting data
        restTemplate.postForObject("http://product:8081/products/CreateProduct" , product, Product.class);
        restTemplate.postForObject("http://customer:8082/customers/CreateCustomer" , customer, Customer.class);

        //return creditNumber which is id
        return credit.getId();
    }
}
