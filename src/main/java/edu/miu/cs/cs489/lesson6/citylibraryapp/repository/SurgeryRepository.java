package edu.miu.cs.cs489.lesson6.citylibraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Surgery;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {

}
