package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_users", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUsersEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String username;

    @javax.persistence.Column(name = "username")
    @Basic
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;

    @javax.persistence.Column(name = "email")
    @Basic
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;

    @javax.persistence.Column(name = "password")
    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private byte block;

    @javax.persistence.Column(name = "block")
    @Basic
    public byte getBlock() {
        return block;
    }

    public void setBlock(byte block) {
        this.block = block;
    }

    private byte sendEmail;

    @javax.persistence.Column(name = "sendEmail")
    @Basic
    public byte getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(byte sendEmail) {
        this.sendEmail = sendEmail;
    }

    private Timestamp registerDate;

    @javax.persistence.Column(name = "registerDate")
    @Basic
    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    private Timestamp lastvisitDate;

    @javax.persistence.Column(name = "lastvisitDate")
    @Basic
    public Timestamp getLastvisitDate() {
        return lastvisitDate;
    }

    public void setLastvisitDate(Timestamp lastvisitDate) {
        this.lastvisitDate = lastvisitDate;
    }

    private String activation;

    @javax.persistence.Column(name = "activation")
    @Basic
    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    private String params;

    @javax.persistence.Column(name = "params")
    @Basic
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    private Timestamp lastResetTime;

    @javax.persistence.Column(name = "lastResetTime")
    @Basic
    public Timestamp getLastResetTime() {
        return lastResetTime;
    }

    public void setLastResetTime(Timestamp lastResetTime) {
        this.lastResetTime = lastResetTime;
    }

    private int resetCount;

    @javax.persistence.Column(name = "resetCount")
    @Basic
    public int getResetCount() {
        return resetCount;
    }

    public void setResetCount(int resetCount) {
        this.resetCount = resetCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUsersEntity that = (D47TuUsersEntity) o;

        if (block != that.block) return false;
        if (id != that.id) return false;
        if (resetCount != that.resetCount) return false;
        if (sendEmail != that.sendEmail) return false;
        if (activation != null ? !activation.equals(that.activation) : that.activation != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (lastResetTime != null ? !lastResetTime.equals(that.lastResetTime) : that.lastResetTime != null)
            return false;
        if (lastvisitDate != null ? !lastvisitDate.equals(that.lastvisitDate) : that.lastvisitDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) block;
        result = 31 * result + (int) sendEmail;
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (lastvisitDate != null ? lastvisitDate.hashCode() : 0);
        result = 31 * result + (activation != null ? activation.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (lastResetTime != null ? lastResetTime.hashCode() : 0);
        result = 31 * result + resetCount;
        return result;
    }
}
