package com.yangchd.db.table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author yangchd  2017/11/2.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(name = "pk_user")
    private String pkUser;
    private String name;
    private String age;
    private String sex;

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "pkUser='" + pkUser + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
