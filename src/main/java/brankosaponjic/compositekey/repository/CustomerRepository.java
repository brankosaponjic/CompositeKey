package brankosaponjic.compositekey.repository;

import brankosaponjic.compositekey.entities.Customer;
import brankosaponjic.compositekey.entities.CustomerID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, CustomerID> {
}
