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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuAssociationsEntityPK.class)
@javax.persistence.Table(name = "d47tu_associations", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuAssociationsEntity {
    private String id;

    @javax.persistence.Column(name = "id")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String context;

    @javax.persistence.Column(name = "context")
    @Id
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String key;

    @javax.persistence.Column(name = "key")
    @Basic
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuAssociationsEntity that = (D47TuAssociationsEntity) o;

        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }
}
