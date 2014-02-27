package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_content", schema = "", catalog = "testJoomlaDsl")
@Entity
public class Content {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int assetId;

    @javax.persistence.Column(name = "asset_id")
    @Basic
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    private String title;

    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    private String introtext;

    @javax.persistence.Column(name = "introtext")
    @Basic
    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    private String fulltext;
    @Column(name = "my_fulltext", nullable = false)
    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    private byte state;

    @javax.persistence.Column(name = "state")
    @Basic
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    private int catid;

    @javax.persistence.Column(name = "catid")
    @Basic
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    private Timestamp created;

    @javax.persistence.Column(name = "created")
    @Basic
    public Timestamp getCreated() {
        return created;
    }

    public void setCreatedTime(Timestamp created) {
        this.created = created;
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

    public void setModifiedTime(Timestamp modified) {
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

    private String images;

    @javax.persistence.Column(name = "images")
    @Basic
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    private String urls;

    @javax.persistence.Column(name = "urls")
    @Basic
    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    private String attribs;

    @javax.persistence.Column(name = "attribs")
    @Basic
    public String getAttribs() {
        return attribs;
    }

    public void setAttribs(String attribs) {
        this.attribs = attribs;
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

    private int ordering;

    @javax.persistence.Column(name = "ordering")
    @Basic
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
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

    private String metadata;

    @javax.persistence.Column(name = "metadata")
    @Basic
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    private byte featured;

    @javax.persistence.Column(name = "featured")
    @Basic
    public byte getFeatured() {
        return featured;
    }

    public void setFeatured(byte featured) {
        this.featured = featured;
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

    private String xreference;

    @javax.persistence.Column(name = "xreference")
    @Basic
    public String getXreference() {
        return xreference;
    }

    public void setXreference(String xreference) {
        this.xreference = xreference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Content that = (Content) o;

        if (access != that.access) return false;
        if (assetId != that.assetId) return false;
        if (catid != that.catid) return false;
        if (checkedOut != that.checkedOut) return false;
        if (createdBy != that.createdBy) return false;
        if (featured != that.featured) return false;
        if (hits != that.hits) return false;
        if (id != that.id) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (ordering != that.ordering) return false;
        if (state != that.state) return false;
        if (version != that.version) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (attribs != null ? !attribs.equals(that.attribs) : that.attribs != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdByAlias != null ? !createdByAlias.equals(that.createdByAlias) : that.createdByAlias != null)
            return false;
        if (fulltext != null ? !fulltext.equals(that.fulltext) : that.fulltext != null) return false;
        if (images != null ? !images.equals(that.images) : that.images != null) return false;
        if (introtext != null ? !introtext.equals(that.introtext) : that.introtext != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (urls != null ? !urls.equals(that.urls) : that.urls != null) return false;
        if (xreference != null ? !xreference.equals(that.xreference) : that.xreference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + assetId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (introtext != null ? introtext.hashCode() : 0);
        result = 31 * result + (fulltext != null ? fulltext.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + catid;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (createdByAlias != null ? createdByAlias.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + modifiedBy;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (urls != null ? urls.hashCode() : 0);
        result = 31 * result + (attribs != null ? attribs.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + ordering;
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + access;
        result = 31 * result + hits;
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (int) featured;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (xreference != null ? xreference.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", assetId=" + assetId +
                ", title='" + title + '\'' +
                ", alias='" + alias + '\'' +
                ", introtext='" + introtext + '\'' +
                ", fulltext='" + fulltext + '\'' +
                ", state=" + state +
                ", catid=" + catid +
                ", created=" + created +
                ", createdBy=" + createdBy +
                ", createdByAlias='" + createdByAlias + '\'' +
                ", modified=" + modified +
                ", modifiedBy=" + modifiedBy +
                ", checkedOut=" + checkedOut +
                ", checkedOutTime=" + checkedOutTime +
                ", publishUp=" + publishUp +
                ", publishDown=" + publishDown +
                ", images='" + images + '\'' +
                ", urls='" + urls + '\'' +
                ", attribs='" + attribs + '\'' +
                ", version=" + version +
                ", ordering=" + ordering +
                ", metakey='" + metakey + '\'' +
                ", metadesc='" + metadesc + '\'' +
                ", access=" + access +
                ", hits=" + hits +
                ", metadata='" + metadata + '\'' +
                ", featured=" + featured +
                ", language='" + language + '\'' +
                ", xreference='" + xreference + '\'' +
                '}';
    }


}
