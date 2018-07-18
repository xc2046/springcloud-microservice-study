package com.xc.study.respository;

import com.xc.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xc on 2018/7/10.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
