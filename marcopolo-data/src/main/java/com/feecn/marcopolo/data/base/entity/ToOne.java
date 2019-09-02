package com.feecn.marcopolo.data.base.entity;

import javax.persistence.*;

/**
 * @author pczhangyu
 */
@Entity
@Table(name = "tableOne")
public class ToOne {

    @Id
    @GeneratedValue
    private int ID;
    @Column(length = 32)
    private String UserName;
    @Column(length = 40)
    private String PassWord;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}