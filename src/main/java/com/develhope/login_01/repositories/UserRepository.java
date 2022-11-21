package com.develhope.login_01.repositories;

import com.develhope.login_01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByPasswordResetCode(String resetPasswordCode);

    User findByActivationCode(String activationCode);

    Optional<User> findById(Long id);

}
