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
@javax.persistence.Table(name = "d47tu_overrider", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuOverriderEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String constant;

    @javax.persistence.Column(name = "constant")
    @Basic
    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    private String string;

    @javax.persistence.Column(name = "string")
    @Basic
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private String file;

    @javax.persistence.Column(name = "file")
    @Basic
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuOverriderEntity that = (D47TuOverriderEntity) o;

        if (id != that.id) return false;
        if (constant != null ? !constant.equals(that.constant) : that.constant != null) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (string != null ? !string.equals(that.string) : that.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (constant != null ? constant.hashCode() : 0);
        result = 31 * result + (string != null ? string.hashCode() : 0);
        result = 31 * result + (file != null ? file.hashCode() : 0);
        return result;
    }
}
