package com.yangchd.db.dao;

import com.yangchd.db.table.Pet;
import com.yangchd.db.table.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author yangchd  2017/11/6.
 */
@Repository
public interface PetDao extends JpaRepository<Pet,Serializable> {
}
