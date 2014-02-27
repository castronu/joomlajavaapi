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
@javax.persistence.Table(name = "d47tu_redirect_links", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuRedirectLinksEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String oldUrl;

    @javax.persistence.Column(name = "old_url")
    @Basic
    public String getOldUrl() {
        return oldUrl;
    }

    public void setOldUrl(String oldUrl) {
        this.oldUrl = oldUrl;
    }

    private String newUrl;

    @javax.persistence.Column(name = "new_url")
    @Basic
    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    private String referer;

    @javax.persistence.Column(name = "referer")
    @Basic
    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    private String comment;

    @javax.persistence.Column(name = "comment")
    @Basic
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private int hits;

    @javax.persistence.Column(name = "hits")
    @Basic
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    private byte published;

    @javax.persistence.Column(name = "published")
    @Basic
    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
    }

    private Timestamp createdDate;

    @javax.persistence.Column(name = "created_date")
    @Basic
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    private Timestamp modifiedDate;

    @javax.persistence.Column(name = "modified_date")
    @Basic
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuRedirectLinksEntity that = (D47TuRedirectLinksEntity) o;

        if (hits != that.hits) return false;
        if (id != that.id) return false;
        if (published != that.published) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (newUrl != null ? !newUrl.equals(that.newUrl) : that.newUrl != null) return false;
        if (oldUrl != null ? !oldUrl.equals(that.oldUrl) : that.oldUrl != null) return false;
        if (referer != null ? !referer.equals(that.referer) : that.referer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (oldUrl != null ? oldUrl.hashCode() : 0);
        result = 31 * result + (newUrl != null ? newUrl.hashCode() : 0);
        result = 31 * result + (referer != null ? referer.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + hits;
        result = 31 * result + (int) published;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
