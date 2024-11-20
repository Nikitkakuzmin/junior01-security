package kz.bitlab.group1.security.securitypro1.repository;

import kz.bitlab.group1.security.securitypro1.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
