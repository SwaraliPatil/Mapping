import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private Long addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;

}
