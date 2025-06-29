package com.codewithmosh.store.repositories;

import com.codewithmosh.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

//    Optional<User> findByName(String name); //this derived method was added by me
//    User findByEmail(String email);
    Optional<User> findByEmail(String email);
}
