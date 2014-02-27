package com.castronu.joomladsl.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
public class D47TuModulesMenuEntityPK implements Serializable {
    private int moduleid;

    @Id
    @Column(name = "moduleid")
    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    private int menuid;

    @Id
    @Column(name = "menuid")
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

        D47TuModulesMenuEntityPK that = (D47TuModulesMenuEntityPK) o;

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
