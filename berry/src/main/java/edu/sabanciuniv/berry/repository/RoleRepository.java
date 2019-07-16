package edu.sabanciuniv.berry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sabanciuniv.berry.domain.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}