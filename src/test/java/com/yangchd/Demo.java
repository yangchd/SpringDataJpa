package com.yangchd;

import com.yangchd.db.dao.PetDao;
import com.yangchd.db.dao.UserDao;
import com.yangchd.db.table.Pet;
import com.yangchd.db.table.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author yangchd  2017/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-data-jpa.xml")
public class Demo {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PetDao petDao;

    @Test
    public void add(){
        User user = new User();
        user.setName("小明");
        user.setSex("男");
        user.setAge("18");

        userDao.save(user);
        user = userDao.findByName("小明");

        Pet cat = new Pet();
        cat.setName("猫");
        cat.setPkUser(user.getPkUser());

        petDao.save(cat);

    }

    @Test
    public void getUser(){
        System.out.println(userDao.findAll().toString());
    }

}
