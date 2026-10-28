package org.ybdev.calabriamanom.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ybdev.calabriamanom.Entities.UserEntity;
import org.ybdev.calabriamanom.Utils.Role;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    boolean existsByRole(Role role);
}