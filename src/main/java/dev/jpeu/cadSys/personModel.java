package dev.jpeu.cadSys;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_person")
public class personModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String cpf;
    String email;
    String contact;

    public personModel() {
    }

    public personModel(String name, String cpf, String email, String contact) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }


}
