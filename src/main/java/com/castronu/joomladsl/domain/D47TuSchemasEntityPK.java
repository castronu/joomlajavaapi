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
public class D47TuSchemasEntityPK implements Serializable {
    private int extensionId;

    @Id
    @Column(name = "extension_id")
    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    private String versionId;

    @Id
    @Column(name = "version_id")
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

        D47TuSchemasEntityPK that = (D47TuSchemasEntityPK) o;

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
