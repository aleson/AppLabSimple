package com.applabsimple.AppLabSimple.entity.dto.pojo;

import com.applabsimple.AppLabSimple.entity.dto.AlsUser;

import java.sql.Date;

public class AlsUserPOJO {

    private Long userId;

    private String name;

    private String surname;

    private String username;

    private String password;

    private Date creationDate;

    private Date modificationDate;

    private String groupId;

    private String description;

    private AlsUserPOJO() {
    }

    public static AlsUserPOJO getInstance() {
        return new AlsUserPOJO();
    }

    public AlsUserPOJO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public AlsUserPOJO setName(String name) {
        this.name = name;
        return this;
    }

    public AlsUserPOJO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public AlsUserPOJO setUsername(String username) {
        this.username = username;
        return this;
    }

    public AlsUserPOJO setPassword(String password) {
        this.password = password;
        return this;
    }

    public AlsUserPOJO setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public AlsUserPOJO setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }

    public AlsUserPOJO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public AlsUserPOJO setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlsUser build() {
        AlsUser user = new AlsUser();
        user.setUserId(userId);
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);
        user.setPassword(password);
        user.setCreationDate(creationDate);
        user.setModificationDate(modificationDate);
        user.setGroupId(groupId);
        user.setDescription(description);
        return user;
    }
}
