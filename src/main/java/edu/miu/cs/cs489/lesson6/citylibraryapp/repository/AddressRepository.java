package edu.miu.cs.cs489.lesson6.citylibraryapp.repository;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
