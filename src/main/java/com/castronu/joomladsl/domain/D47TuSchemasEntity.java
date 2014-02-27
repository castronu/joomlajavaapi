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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuSchemasEntityPK.class)
@javax.persistence.Table(name = "d47tu_schemas", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuSchemasEntity {
    private int extensionId;

    @javax.persistence.Column(name = "extension_id")
    @Id
    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    private String versionId;

    @javax.persistence.Column(name = "version_id")
    @Id
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuSchemasEntity that = (D47TuSchemasEntity) o;

        if (extensionId != that.extensionId) return false;
        if (versionId != null ? !versionId.equals(that.versionId) : that.versionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = extensionId;
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        return result;
    }
}
