package com.andvardy.testapp.repositories;

import com.andvardy.testapp.models.ERole;
import com.andvardy.testapp.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
