package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_session", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuSessionEntity {
    private String sessionId;

    @javax.persistence.Column(name = "session_id")
    @Id
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    private byte clientId;

    @javax.persistence.Column(name = "client_id")
    @Basic
    public byte getClientId() {
        return clientId;
    }

    public void setClientId(byte clientId) {
        this.clientId = clientId;
    }

    private byte guest;

    @javax.persistence.Column(name = "guest")
    @Basic
    public byte getGuest() {
        return guest;
    }

    public void setGuest(byte guest) {
        this.guest = guest;
    }

    private String time;

    @javax.persistence.Column(name = "time")
    @Basic
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String data;

    @javax.persistence.Column(name = "data")
    @Basic
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private int userid;

    @javax.persistence.Column(name = "userid")
    @Basic
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuSessionEntity that = (D47TuSessionEntity) o;

        if (clientId != that.clientId) return false;
        if (guest != that.guest) return false;
        if (userid != that.userid) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessionId != null ? sessionId.hashCode() : 0;
        result = 31 * result + (int) clientId;
        result = 31 * result + (int) guest;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
