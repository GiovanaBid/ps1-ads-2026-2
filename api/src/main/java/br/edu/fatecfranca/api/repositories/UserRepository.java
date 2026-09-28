package br.edu.fatecfranca.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecfranca.api.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}