package pl.project.customer.service;

import org.springframework.stereotype.Service;
import pl.project.customer.model.Customer;
import pl.project.customer.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
