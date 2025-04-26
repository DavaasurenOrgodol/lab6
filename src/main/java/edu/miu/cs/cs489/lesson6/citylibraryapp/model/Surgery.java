package edu.miu.cs.cs489.lesson6.citylibraryapp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToOne
    Address address;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.MERGE)
    private List<Appointment> appointments;

    public Surgery(String name, Address address) {
        this.name = name;
        this.address = address;
    }

}
