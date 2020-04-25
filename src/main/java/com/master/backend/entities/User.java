package com.master.backend.entities;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userLoggedInId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserLoggedInId() {
        return userLoggedInId;
    }

    public void setUserLoggedInId(long userLoggedInId) {
        this.userLoggedInId = userLoggedInId;
    }
}
