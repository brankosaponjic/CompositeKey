package brankosaponjic.compositekey;

import brankosaponjic.compositekey.entities.Customer;
import brankosaponjic.compositekey.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompositekeyApplicationTests {

    @Autowired
    CustomerRepository repository;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setId(1234);
        customer.setEmail("johndoe@gmail.com");
        customer.setName("John Doe");
        repository.save(customer);
    }

}
