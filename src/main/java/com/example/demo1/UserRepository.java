package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ：LiuJianhua
 * @date ：Created in 2020/9/17 15:03
 * @description :
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>
{

}
