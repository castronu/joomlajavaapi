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
@javax.persistence.Table(name = "d47tu_updates", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuUpdatesEntity {
    private int updateId;

    @javax.persistence.Column(name = "update_id")
    @Id
    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    private int updateSiteId;

    @javax.persistence.Column(name = "update_site_id")
    @Basic
    public int getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(int updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    private int extensionId;

    @javax.persistence.Column(name = "extension_id")
    @Basic
    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
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

    private String description;

    @javax.persistence.Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String element;

    @javax.persistence.Column(name = "element")
    @Basic
    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
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

    private String folder;

    @javax.persistence.Column(name = "folder")
    @Basic
    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    private byte clientId;

    @javax.persistence.Column(name = "client_id")
    @Basic
    public byte getClientId() {
        return clientId;
    }

    public void setClientId(byte clientId) {
        this.clientId = clientId;
    }

    private String version;

    @javax.persistence.Column(name = "version")
    @Basic
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String data;

    @javax.persistence.Column(name = "data")
    @Basic
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String detailsurl;

    @javax.persistence.Column(name = "detailsurl")
    @Basic
    public String getDetailsurl() {
        return detailsurl;
    }

    public void setDetailsurl(String detailsurl) {
        this.detailsurl = detailsurl;
    }

    private String infourl;

    @javax.persistence.Column(name = "infourl")
    @Basic
    public String getInfourl() {
        return infourl;
    }

    public void setInfourl(String infourl) {
        this.infourl = infourl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuUpdatesEntity that = (D47TuUpdatesEntity) o;

        if (clientId != that.clientId) return false;
        if (extensionId != that.extensionId) return false;
        if (updateId != that.updateId) return false;
        if (updateSiteId != that.updateSiteId) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (detailsurl != null ? !detailsurl.equals(that.detailsurl) : that.detailsurl != null) return false;
        if (element != null ? !element.equals(that.element) : that.element != null) return false;
        if (folder != null ? !folder.equals(that.folder) : that.folder != null) return false;
        if (infourl != null ? !infourl.equals(that.infourl) : that.infourl != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = updateId;
        result = 31 * result + updateSiteId;
        result = 31 * result + extensionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (element != null ? element.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (folder != null ? folder.hashCode() : 0);
        result = 31 * result + (int) clientId;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (detailsurl != null ? detailsurl.hashCode() : 0);
        result = 31 * result + (infourl != null ? infourl.hashCode() : 0);
        return result;
    }
}
