package xyz.tzz6.courseselect.Repository;

import org.springframework.data.repository.CrudRepository;
import xyz.tzz6.courseselect.Model.DO.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByStu_id(Long stu_id);
}
