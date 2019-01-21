package cn.jsbintask.securityrestful.repository;

import cn.jsbintask.securityrestful.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jsbintask@foxmail.com
 * @date 2019/1/11 11:36
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
