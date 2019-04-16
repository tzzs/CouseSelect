package xyz.tzz6.courseselect.Repository;

import org.springframework.data.repository.CrudRepository;
import xyz.tzz6.courseselect.Model.DO.Role;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Role findByRole(String role);
}
