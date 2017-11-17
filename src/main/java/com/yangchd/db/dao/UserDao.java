package com.yangchd.db.dao;

import com.yangchd.db.table.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author yangchd  2017/11/2.
 */
@Repository
public interface UserDao extends JpaRepository<User,Serializable> {
}
