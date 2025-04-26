package edu.miu.cs.cs489.lesson6.citylibraryapp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dentists")
@Data
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(mappedBy = "dentist", cascade = CascadeType.MERGE)
    private List<Appointment> appointments;

    public Dentist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
