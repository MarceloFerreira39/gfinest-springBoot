package com.projeto.gfinest.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.gfinest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
