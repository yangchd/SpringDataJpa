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

import java.util.ArrayList;
import java.util.List;


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
    public void test(){
        User user = new User();
        user.setName("小明");
        user.setSex("男");
        user.setAge("18");

        List<Pet> pets = new ArrayList<Pet>();
        Pet cat = new Pet();
        cat.setName("猫");
        pets.add(cat);

        Pet dog = new Pet();
        dog.setName("狗");
        pets.add(dog);

        user.setPets(pets);

        userDao.save(user);
    }

}
