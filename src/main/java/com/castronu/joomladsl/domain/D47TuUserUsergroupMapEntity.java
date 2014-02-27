package com.castronu.joomladsl.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuUserUsergroupMapEntityPK.class)
@javax.persistence.Table(name = "d47tu_user_usergroup_map", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUserUsergroupMapEntity {
    private int userId;

    @javax.persistence.Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int groupId;

    @javax.persistence.Column(name = "group_id")
    @Id
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUserUsergroupMapEntity that = (D47TuUserUsergroupMapEntity) o;

        if (groupId != that.groupId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + groupId;
        return result;
    }
}
