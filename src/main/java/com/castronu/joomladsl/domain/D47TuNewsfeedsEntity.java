package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_newsfeeds", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuNewsfeedsEntity {
    private int catid;

    @javax.persistence.Column(name = "catid")
    @Basic
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private String alias;

    @javax.persistence.Column(name = "alias")
    @Basic
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String link;

    @javax.persistence.Column(name = "link")
    @Basic
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private boolean published;

    @javax.persistence.Column(name = "published")
    @Basic
    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    private int numarticles;

    @javax.persistence.Column(name = "numarticles")
    @Basic
    public int getNumarticles() {
        return numarticles;
    }

    public void setNumarticles(int numarticles) {
        this.numarticles = numarticles;
    }

    private int cacheTime;

    @javax.persistence.Column(name = "cache_time")
    @Basic
    public int getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(int cacheTime) {
        this.cacheTime = cacheTime;
    }

    private int checkedOut;

    @javax.persistence.Column(name = "checked_out")
    @Basic
    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    private Timestamp checkedOutTime;

    @javax.persistence.Column(name = "checked_out_time")
    @Basic
    public Timestamp getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Timestamp checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
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

    private byte rtl;

    @javax.persistence.Column(name = "rtl")
    @Basic
    public byte getRtl() {
        return rtl;
    }

    public void setRtl(byte rtl) {
        this.rtl = rtl;
    }

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    private String language;

    @javax.persistence.Column(name = "language")
    @Basic
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String params;

    @javax.persistence.Column(name = "params")
    @Basic
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    private Timestamp created;

    @javax.persistence.Column(name = "created")
    @Basic
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    private int createdBy;

    @javax.persistence.Column(name = "created_by")
    @Basic
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    private String createdByAlias;

    @javax.persistence.Column(name = "created_by_alias")
    @Basic
    public String getCreatedByAlias() {
        return createdByAlias;
    }

    public void setCreatedByAlias(String createdByAlias) {
        this.createdByAlias = createdByAlias;
    }

    private Timestamp modified;

    @javax.persistence.Column(name = "modified")
    @Basic
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    private int modifiedBy;

    @javax.persistence.Column(name = "modified_by")
    @Basic
    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    private String metakey;

    @javax.persistence.Column(name = "metakey")
    @Basic
    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    private String metadesc;

    @javax.persistence.Column(name = "metadesc")
    @Basic
    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    private String metadata;

    @javax.persistence.Column(name = "metadata")
    @Basic
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    private String xreference;

    @javax.persistence.Column(name = "xreference")
    @Basic
    public String getXreference() {
        return xreference;
    }

    public void setXreference(String xreference) {
        this.xreference = xreference;
    }

    private Timestamp publishUp;

    @javax.persistence.Column(name = "publish_up")
    @Basic
    public Timestamp getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Timestamp publishUp) {
        this.publishUp = publishUp;
    }

    private Timestamp publishDown;

    @javax.persistence.Column(name = "publish_down")
    @Basic
    public Timestamp getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Timestamp publishDown) {
        this.publishDown = publishDown;
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

    private int version;

    @javax.persistence.Column(name = "version")
    @Basic
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    private int hits;

    @javax.persistence.Column(name = "hits")
    @Basic
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    private String images;

    @javax.persistence.Column(name = "images")
    @Basic
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuNewsfeedsEntity that = (D47TuNewsfeedsEntity) o;

        if (access != that.access) return false;
        if (cacheTime != that.cacheTime) return false;
        if (catid != that.catid) return false;
        if (checkedOut != that.checkedOut) return false;
        if (createdBy != that.createdBy) return false;
        if (hits != that.hits) return false;
        if (id != that.id) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (numarticles != that.numarticles) return false;
        if (ordering != that.ordering) return false;
        if (published != that.published) return false;
        if (rtl != that.rtl) return false;
        if (version != that.version) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdByAlias != null ? !createdByAlias.equals(that.createdByAlias) : that.createdByAlias != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (images != null ? !images.equals(that.images) : that.images != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (xreference != null ? !xreference.equals(that.xreference) : that.xreference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catid;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (published ? 1 : 0);
        result = 31 * result + numarticles;
        result = 31 * result + cacheTime;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + ordering;
        result = 31 * result + (int) rtl;
        result = 31 * result + access;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (createdByAlias != null ? createdByAlias.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + modifiedBy;
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (xreference != null ? xreference.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + hits;
        result = 31 * result + (images != null ? images.hashCode() : 0);
        return result;
    }
}
