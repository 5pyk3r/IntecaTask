package pl.project.customer.controller;


import org.springframework.web.bind.annotation.*;
import pl.project.customer.model.Customer;
import pl.project.customer.model.CustomerList;
import pl.project.customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/GetCustomers")
    public CustomerList getAllCustomers(){
        CustomerList customerList = new CustomerList();
        customerList.setCustomerList(customerService.findAllCustomers());
        return customerList;
    }

    @PostMapping("/CreateCustomer")
    public void createCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }
}
