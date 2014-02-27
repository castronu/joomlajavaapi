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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuUpdateSitesExtensionsEntityPK.class)
@javax.persistence.Table(name = "d47tu_update_sites_extensions", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUpdateSitesExtensionsEntity {
    private int updateSiteId;

    @javax.persistence.Column(name = "update_site_id")
    @Id
    public int getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(int updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    private int extensionId;

    @javax.persistence.Column(name = "extension_id")
    @Id
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

        D47TuUpdateSitesExtensionsEntity that = (D47TuUpdateSitesExtensionsEntity) o;

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
