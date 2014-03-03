package com.castronu.joomlajavaapi.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table
@Entity
public class Category {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
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

    private int parentId;

    @javax.persistence.Column(name = "parent_id")
    @Basic
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    private int lft;

    @javax.persistence.Column(name = "lft")
    @Basic
    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    private int rgt;

    @javax.persistence.Column(name = "rgt")
    @Basic
    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
    }

    private int level;

    @javax.persistence.Column(name = "level")
    @Basic
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private String path;

    @javax.persistence.Column(name = "path")
    @Basic
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String extension;

    @javax.persistence.Column(name = "extension")
    @Basic
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    private String title;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", assetId=" + assetId +
                ", parentId=" + parentId +
                ", lft=" + lft +
                ", rgt=" + rgt +
                ", level=" + level +
                ", path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                ", title='" + title + '\'' +
                ", alias='" + alias + '\'' +
                ", note='" + note + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                ", checkedOut=" + checkedOut +
                ", checkedOutTime=" + checkedOutTime +
                ", access=" + access +
                ", params='" + params + '\'' +
                ", metadesc='" + metadesc + '\'' +
                ", metakey='" + metakey + '\'' +
                ", metadata='" + metadata + '\'' +
                ", createdUserId=" + createdUserId +
                ", createdTime=" + createdTime +
                ", modifiedUserId=" + modifiedUserId +
                ", modifiedTime=" + modifiedTime +
                ", hits=" + hits +
                ", language='" + language + '\'' +
                ", version=" + version +
                '}';
    }

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

    private String note;

    @javax.persistence.Column(name = "note")
    @Basic
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    private boolean published;

    @javax.persistence.Column(name = "published")
    @Basic
    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
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

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
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

    private String metadesc;

    @javax.persistence.Column(name = "metadesc")
    @Basic
    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
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

    private String metadata;

    @javax.persistence.Column(name = "metadata")
    @Basic
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    private int createdUserId;

    @javax.persistence.Column(name = "created_user_id")
    @Basic
    public int getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }

    private Timestamp createdTime;

    @javax.persistence.Column(name = "created_time")
    @Basic
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    private int modifiedUserId;

    @javax.persistence.Column(name = "modified_user_id")
    @Basic
    public int getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    private Timestamp modifiedTime;

    @javax.persistence.Column(name = "modified_time")
    @Basic
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
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

    private String language;

    @javax.persistence.Column(name = "language")
    @Basic
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category that = (Category) o;

        if (access != that.access) return false;
        if (assetId != that.assetId) return false;
        if (checkedOut != that.checkedOut) return false;
        if (createdUserId != that.createdUserId) return false;
        if (hits != that.hits) return false;
        if (id != that.id) return false;
        if (level != that.level) return false;
        if (lft != that.lft) return false;
        if (modifiedUserId != that.modifiedUserId) return false;
        if (parentId != that.parentId) return false;
        if (published != that.published) return false;
        if (rgt != that.rgt) return false;
        if (version != that.version) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + assetId;
        result = 31 * result + parentId;
        result = 31 * result + lft;
        result = 31 * result + rgt;
        result = 31 * result + level;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (published ? 1 : 0);
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + access;
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + createdUserId;
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + modifiedUserId;
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        result = 31 * result + hits;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }

}
