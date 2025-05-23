package edu.miu.cs.cs489.lesson6.citylibraryapp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "appointments")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    Dentist dentist;
    @ManyToOne
    Surgery surgery;
    @ManyToOne
    Patient patient;
    @Column(name = "app_date_time")
    LocalDateTime appDateTime;
}
