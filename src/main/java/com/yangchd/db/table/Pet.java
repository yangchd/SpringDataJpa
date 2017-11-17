package com.yangchd.db.table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author yangchd  2017/11/6.
 */
@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(name = "pk_pet")
    private String pkPet;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = User.class)
    @JoinColumn(name = "pk_user")
    private User user;

    public String getPkPet() {
        return pkPet;
    }

    public void setPkPet(String pkPet) {
        this.pkPet = pkPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pkPet='" + pkPet + '\'' +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
