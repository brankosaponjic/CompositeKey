package brankosaponjic.compositekey.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CustomerID.class)
public class Customer {
    @Id
    private int id;
    @Id
    private String email;
    private String name;
}
