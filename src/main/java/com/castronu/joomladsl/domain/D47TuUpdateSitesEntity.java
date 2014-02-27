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
@javax.persistence.Table(name = "d47tu_update_sites", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUpdateSitesEntity {
    private int updateSiteId;

    @javax.persistence.Column(name = "update_site_id")
    @Id
    public int getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(int updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String type;

    @javax.persistence.Column(name = "type")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String location;

    @javax.persistence.Column(name = "location")
    @Basic
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private int enabled;

    @javax.persistence.Column(name = "enabled")
    @Basic
    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    private long lastCheckTimestamp;

    @javax.persistence.Column(name = "last_check_timestamp")
    @Basic
    public long getLastCheckTimestamp() {
        return lastCheckTimestamp;
    }

    public void setLastCheckTimestamp(long lastCheckTimestamp) {
        this.lastCheckTimestamp = lastCheckTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUpdateSitesEntity that = (D47TuUpdateSitesEntity) o;

        if (enabled != that.enabled) return false;
        if (lastCheckTimestamp != that.lastCheckTimestamp) return false;
        if (updateSiteId != that.updateSiteId) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = updateSiteId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + enabled;
        result = 31 * result + (int) (lastCheckTimestamp ^ (lastCheckTimestamp >>> 32));
        return result;
    }
}
