package test.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.security.domain.entity.Account;


public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
