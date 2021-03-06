package com.example.rest.repository;

import com.example.rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vagharhak Grigoryan
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
