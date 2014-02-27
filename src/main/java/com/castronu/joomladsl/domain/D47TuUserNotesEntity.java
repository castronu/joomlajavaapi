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
@javax.persistence.Table(name = "d47tu_user_notes", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUserNotesEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int userId;

    @javax.persistence.Column(name = "user_id")
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int catid;

    @javax.persistence.Column(name = "catid")
    @Basic
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    private String subject;

    @javax.persistence.Column(name = "subject")
    @Basic
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String body;

    @javax.persistence.Column(name = "body")
    @Basic
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private byte state;

    @javax.persistence.Column(name = "state")
    @Basic
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    private int checkedOut;

    @javax.persistence.Column(name = "checked_out")
    @Basic
    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    private Timestamp checkedOutTime;

    @javax.persistence.Column(name = "checked_out_time")
    @Basic
    public Timestamp getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Timestamp checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    private int createdUserId;

    @javax.persistence.Column(name = "created_user_id")
    @Basic
    public int getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }

    private Timestamp createdTime;

    @javax.persistence.Column(name = "created_time")
    @Basic
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    private int modifiedUserId;

    @javax.persistence.Column(name = "modified_user_id")
    @Basic
    public int getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    private Timestamp modifiedTime;

    @javax.persistence.Column(name = "modified_time")
    @Basic
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    private Timestamp reviewTime;

    @javax.persistence.Column(name = "review_time")
    @Basic
    public Timestamp getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }

    private Timestamp publishUp;

    @javax.persistence.Column(name = "publish_up")
    @Basic
    public Timestamp getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Timestamp publishUp) {
        this.publishUp = publishUp;
    }

    private Timestamp publishDown;

    @javax.persistence.Column(name = "publish_down")
    @Basic
    public Timestamp getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Timestamp publishDown) {
        this.publishDown = publishDown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUserNotesEntity that = (D47TuUserNotesEntity) o;

        if (catid != that.catid) return false;
        if (checkedOut != that.checkedOut) return false;
        if (createdUserId != that.createdUserId) return false;
        if (id != that.id) return false;
        if (modifiedUserId != that.modifiedUserId) return false;
        if (state != that.state) return false;
        if (userId != that.userId) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (reviewTime != null ? !reviewTime.equals(that.reviewTime) : that.reviewTime != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + catid;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + createdUserId;
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + modifiedUserId;
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        result = 31 * result + (reviewTime != null ? reviewTime.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        return result;
    }
}
