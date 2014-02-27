package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_content_rating", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuContentRatingEntity {
    private int contentId;

    @javax.persistence.Column(name = "content_id")
    @Id
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    private int ratingSum;

    @javax.persistence.Column(name = "rating_sum")
    @Basic
    public int getRatingSum() {
        return ratingSum;
    }

    public void setRatingSum(int ratingSum) {
        this.ratingSum = ratingSum;
    }

    private int ratingCount;

    @javax.persistence.Column(name = "rating_count")
    @Basic
    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    private String lastip;

    @javax.persistence.Column(name = "lastip")
    @Basic
    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuContentRatingEntity that = (D47TuContentRatingEntity) o;

        if (contentId != that.contentId) return false;
        if (ratingCount != that.ratingCount) return false;
        if (ratingSum != that.ratingSum) return false;
        if (lastip != null ? !lastip.equals(that.lastip) : that.lastip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + ratingSum;
        result = 31 * result + ratingCount;
        result = 31 * result + (lastip != null ? lastip.hashCode() : 0);
        return result;
    }
}
