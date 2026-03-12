package Jobs;

import Persons.personModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_jobs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class jobsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameJob;
    private String jobLevel;

    // um trabalho pode conter varias pessoas
    @OneToMany(mappedBy = "jobs")
    private List<personModel> person;


}
