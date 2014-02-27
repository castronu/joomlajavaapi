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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuModulesMenuEntityPK.class)
@javax.persistence.Table(name = "d47tu_modules_menu", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuModulesMenuEntity {
    private int moduleid;

    @javax.persistence.Column(name = "moduleid")
    @Id
    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    private int menuid;

    @javax.persistence.Column(name = "menuid")
    @Id
    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuModulesMenuEntity that = (D47TuModulesMenuEntity) o;

        if (menuid != that.menuid) return false;
        if (moduleid != that.moduleid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleid;
        result = 31 * result + menuid;
        return result;
    }
}
