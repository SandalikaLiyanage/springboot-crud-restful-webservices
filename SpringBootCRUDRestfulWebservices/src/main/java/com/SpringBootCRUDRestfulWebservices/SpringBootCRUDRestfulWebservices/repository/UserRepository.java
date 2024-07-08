package com.SpringBootCRUDRestfulWebservices.SpringBootCRUDRestfulWebservices.repository;

import com.SpringBootCRUDRestfulWebservices.SpringBootCRUDRestfulWebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
