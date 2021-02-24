package brankosaponjic.compositekey.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CustomerID implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String email;
}
