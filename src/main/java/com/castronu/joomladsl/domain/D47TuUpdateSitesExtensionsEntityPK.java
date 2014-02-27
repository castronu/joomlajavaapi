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
public class D47TuUpdateSitesExtensionsEntityPK implements Serializable {
    private int updateSiteId;

    @Id
    @Column(name = "update_site_id")
    public int getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(int updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    private int extensionId;

    @Id
    @Column(name = "extension_id")
    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUpdateSitesExtensionsEntityPK that = (D47TuUpdateSitesExtensionsEntityPK) o;

        if (extensionId != that.extensionId) return false;
        if (updateSiteId != that.updateSiteId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = updateSiteId;
        result = 31 * result + extensionId;
        return result;
    }
}
