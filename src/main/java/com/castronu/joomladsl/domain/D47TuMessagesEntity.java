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
@javax.persistence.Table(name = "d47tu_messages", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuMessagesEntity {
    private int messageId;

    @javax.persistence.Column(name = "message_id")
    @Id
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    private int userIdFrom;

    @javax.persistence.Column(name = "user_id_from")
    @Basic
    public int getUserIdFrom() {
        return userIdFrom;
    }

    public void setUserIdFrom(int userIdFrom) {
        this.userIdFrom = userIdFrom;
    }

    private int userIdTo;

    @javax.persistence.Column(name = "user_id_to")
    @Basic
    public int getUserIdTo() {
        return userIdTo;
    }

    public void setUserIdTo(int userIdTo) {
        this.userIdTo = userIdTo;
    }

    private byte folderId;

    @javax.persistence.Column(name = "folder_id")
    @Basic
    public byte getFolderId() {
        return folderId;
    }

    public void setFolderId(byte folderId) {
        this.folderId = folderId;
    }

    private Timestamp dateTime;

    @javax.persistence.Column(name = "date_time")
    @Basic
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    private boolean state;

    @javax.persistence.Column(name = "state")
    @Basic
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    private boolean priority;

    @javax.persistence.Column(name = "priority")
    @Basic
    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
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

    private String message;

    @javax.persistence.Column(name = "message")
    @Basic
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuMessagesEntity that = (D47TuMessagesEntity) o;

        if (folderId != that.folderId) return false;
        if (messageId != that.messageId) return false;
        if (priority != that.priority) return false;
        if (state != that.state) return false;
        if (userIdFrom != that.userIdFrom) return false;
        if (userIdTo != that.userIdTo) return false;
        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + userIdFrom;
        result = 31 * result + userIdTo;
        result = 31 * result + (int) folderId;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        result = 31 * result + (priority ? 1 : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}
