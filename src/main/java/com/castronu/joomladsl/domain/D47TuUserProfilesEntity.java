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
@javax.persistence.Table(name = "d47tu_user_profiles", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUserProfilesEntity {
    private int userId;

    @javax.persistence.Column(name = "user_id")
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String profileKey;

    @javax.persistence.Column(name = "profile_key")
    @Basic
    public String getProfileKey() {
        return profileKey;
    }

    public void setProfileKey(String profileKey) {
        this.profileKey = profileKey;
    }

    private String profileValue;

    @javax.persistence.Column(name = "profile_value")
    @Basic
    public String getProfileValue() {
        return profileValue;
    }

    public void setProfileValue(String profileValue) {
        this.profileValue = profileValue;
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

        D47TuUserProfilesEntity that = (D47TuUserProfilesEntity) o;

        if (ordering != that.ordering) return false;
        if (userId != that.userId) return false;
        if (profileKey != null ? !profileKey.equals(that.profileKey) : that.profileKey != null) return false;
        if (profileValue != null ? !profileValue.equals(that.profileValue) : that.profileValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (profileKey != null ? profileKey.hashCode() : 0);
        result = 31 * result + (profileValue != null ? profileValue.hashCode() : 0);
        result = 31 * result + ordering;
        return result;
    }
}
