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
@javax.persistence.Table(name = "d47tu_content_frontpage", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuContentFrontpageEntity {
    private int contentId;

    @javax.persistence.Column(name = "content_id")
    @Id
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    private int ordering;

    @javax.persistence.Column(name = "ordering")
    @Basic
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuContentFrontpageEntity that = (D47TuContentFrontpageEntity) o;

        if (contentId != that.contentId) return false;
        if (ordering != that.ordering) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + ordering;
        return result;
    }
}
