import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    private String ID;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;

}
