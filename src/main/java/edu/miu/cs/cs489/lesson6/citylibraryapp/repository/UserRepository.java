package edu.miu.cs.cs489.lesson6.citylibraryapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs489.lesson6.citylibraryapp.user.User;

// import com.org.product.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    void deleteByUsername(String username);
}
