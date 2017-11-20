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

    @JoinColumn(name = "pk_user")
    private String pkUser;

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

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pkPet='" + pkPet + '\'' +
                ", name='" + name + '\'' +
                ", pkUser='" + pkUser + '\'' +
                '}';
    }
}
