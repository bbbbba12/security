package test.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.security.domain.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String name);

    @Override
    void delete(Role role);

}