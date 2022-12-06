package com.example.javademo.repository;

import com.example.javademo.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Override
    Optional<Client> findById(Long id);
}
