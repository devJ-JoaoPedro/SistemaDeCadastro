package Persons;
import Jobs.jobsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_person")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class personModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String contact;

    //cada pessoa so pode ter um trabalho
    @ManyToMany
    @JoinColumn(name = "jobs_id") // foreing key
    private jobsModel jobs;



}
