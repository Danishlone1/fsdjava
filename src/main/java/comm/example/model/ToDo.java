package comm.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "description")
    @NotNull(message = "Field cannot be empty")
    @Size(min = 1, message = "is required")
    private String description;
    @Column(name = "date")

    private String datepicker;

}