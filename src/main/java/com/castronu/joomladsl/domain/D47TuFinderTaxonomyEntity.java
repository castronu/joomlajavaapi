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
@javax.persistence.Table(name = "d47tu_finder_taxonomy", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderTaxonomyEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int parentId;

    @javax.persistence.Column(name = "parent_id")
    @Basic
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    private String title;

    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    private boolean access;

    @javax.persistence.Column(name = "access")
    @Basic
    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    private boolean ordering;

    @javax.persistence.Column(name = "ordering")
    @Basic
    public boolean isOrdering() {
        return ordering;
    }

    public void setOrdering(boolean ordering) {
        this.ordering = ordering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderTaxonomyEntity that = (D47TuFinderTaxonomyEntity) o;

        if (access != that.access) return false;
        if (id != that.id) return false;
        if (ordering != that.ordering) return false;
        if (parentId != that.parentId) return false;
        if (state != that.state) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + parentId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        result = 31 * result + (access ? 1 : 0);
        result = 31 * result + (ordering ? 1 : 0);
        return result;
    }
}
