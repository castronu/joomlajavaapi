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
@javax.persistence.Table(name = "d47tu_languages", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuLanguagesEntity {
    private int langId;

    @javax.persistence.Column(name = "lang_id")
    @Id
    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    private String langCode;

    @javax.persistence.Column(name = "lang_code")
    @Basic
    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
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

    private String titleNative;

    @javax.persistence.Column(name = "title_native")
    @Basic
    public String getTitleNative() {
        return titleNative;
    }

    public void setTitleNative(String titleNative) {
        this.titleNative = titleNative;
    }

    private String sef;

    @javax.persistence.Column(name = "sef")
    @Basic
    public String getSef() {
        return sef;
    }

    public void setSef(String sef) {
        this.sef = sef;
    }

    private String image;

    @javax.persistence.Column(name = "image")
    @Basic
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    private String sitename;

    @javax.persistence.Column(name = "sitename")
    @Basic
    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    private int published;

    @javax.persistence.Column(name = "published")
    @Basic
    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
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

    private int ordering;

    @javax.persistence.Column(name = "ordering")
    @Basic
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuLanguagesEntity that = (D47TuLanguagesEntity) o;

        if (access != that.access) return false;
        if (langId != that.langId) return false;
        if (ordering != that.ordering) return false;
        if (published != that.published) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (langCode != null ? !langCode.equals(that.langCode) : that.langCode != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (sef != null ? !sef.equals(that.sef) : that.sef != null) return false;
        if (sitename != null ? !sitename.equals(that.sitename) : that.sitename != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (titleNative != null ? !titleNative.equals(that.titleNative) : that.titleNative != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId;
        result = 31 * result + (langCode != null ? langCode.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (titleNative != null ? titleNative.hashCode() : 0);
        result = 31 * result + (sef != null ? sef.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + (sitename != null ? sitename.hashCode() : 0);
        result = 31 * result + published;
        result = 31 * result + access;
        result = 31 * result + ordering;
        return result;
    }
}
