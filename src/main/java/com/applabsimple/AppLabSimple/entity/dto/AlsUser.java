package com.applabsimple.AppLabSimple.entity.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "als_users")
public class AlsUser implements Serializable {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "modification_date")
    private Date modificationDate;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "description")
    private String description;

    public AlsUser() {
    }

    public AlsUser(long userId, String name, String surname, String username, String password,
                   Date creationDate, Date modificationDate, String groupId, String description) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.groupId = groupId;
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlsUser alsUsers = (AlsUser) o;
        return userId == alsUsers.userId &&
                Objects.equals(name, alsUsers.name) &&
                Objects.equals(surname, alsUsers.surname) &&
                Objects.equals(username, alsUsers.username) &&
                Objects.equals(password, alsUsers.password) &&
                Objects.equals(creationDate, alsUsers.creationDate) &&
                Objects.equals(modificationDate, alsUsers.modificationDate) &&
                Objects.equals(groupId, alsUsers.groupId) &&
                Objects.equals(description, alsUsers.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, surname, username, password, creationDate, modificationDate, groupId, description);
    }

    @Override
    public String toString() {
        return "AlsUsers{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                ", groupId='" + groupId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
