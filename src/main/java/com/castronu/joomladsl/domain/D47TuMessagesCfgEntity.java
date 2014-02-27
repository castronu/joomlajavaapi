package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_messages_cfg", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuMessagesCfgEntity {
    private int userId;

    @javax.persistence.Column(name = "user_id")
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String cfgName;

    @javax.persistence.Column(name = "cfg_name")
    @Basic
    public String getCfgName() {
        return cfgName;
    }

    public void setCfgName(String cfgName) {
        this.cfgName = cfgName;
    }

    private String cfgValue;

    @javax.persistence.Column(name = "cfg_value")
    @Basic
    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuMessagesCfgEntity that = (D47TuMessagesCfgEntity) o;

        if (userId != that.userId) return false;
        if (cfgName != null ? !cfgName.equals(that.cfgName) : that.cfgName != null) return false;
        if (cfgValue != null ? !cfgValue.equals(that.cfgValue) : that.cfgValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (cfgName != null ? cfgName.hashCode() : 0);
        result = 31 * result + (cfgValue != null ? cfgValue.hashCode() : 0);
        return result;
    }
}
