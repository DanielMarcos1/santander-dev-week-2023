package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

// O JpaRepository aceita dois tipos, ele espera um T onde colocamos a entidade que vamos utilizar
// e o tipo do ID dessa entidade.
@Repository 
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}