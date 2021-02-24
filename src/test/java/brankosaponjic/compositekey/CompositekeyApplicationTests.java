package brankosaponjic.compositekey;

import brankosaponjic.compositekey.entities.Customer;
import brankosaponjic.compositekey.entities.CustomerID;
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

        CustomerID id = new CustomerID();

        id.setId(4567);
        id.setEmail("juancarlos@gmail.com");
        customer.setId(id);
        customer.setName("Juan Carlos");
        repository.save(customer);
    }

}
