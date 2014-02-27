package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_contact_details", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuContactDetailsEntity {
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

    private String conPosition;

    @javax.persistence.Column(name = "con_position")
    @Basic
    public String getConPosition() {
        return conPosition;
    }

    public void setConPosition(String conPosition) {
        this.conPosition = conPosition;
    }

    private String address;

    @javax.persistence.Column(name = "address")
    @Basic
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String suburb;

    @javax.persistence.Column(name = "suburb")
    @Basic
    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    private String state;

    @javax.persistence.Column(name = "state")
    @Basic
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String country;

    @javax.persistence.Column(name = "country")
    @Basic
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String postcode;

    @javax.persistence.Column(name = "postcode")
    @Basic
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private String telephone;

    @javax.persistence.Column(name = "telephone")
    @Basic
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private String fax;

    @javax.persistence.Column(name = "fax")
    @Basic
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    private String misc;

    @javax.persistence.Column(name = "misc")
    @Basic
    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
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

    private String emailTo;

    @javax.persistence.Column(name = "email_to")
    @Basic
    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    private boolean defaultCon;

    @javax.persistence.Column(name = "default_con")
    @Basic
    public boolean isDefaultCon() {
        return defaultCon;
    }

    public void setDefaultCon(boolean defaultCon) {
        this.defaultCon = defaultCon;
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

    private int ordering;

    @javax.persistence.Column(name = "ordering")
    @Basic
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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

    private int userId;

    @javax.persistence.Column(name = "user_id")
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    private String mobile;

    @javax.persistence.Column(name = "mobile")
    @Basic
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String webpage;

    @javax.persistence.Column(name = "webpage")
    @Basic
    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    private String sortname1;

    @javax.persistence.Column(name = "sortname1")
    @Basic
    public String getSortname1() {
        return sortname1;
    }

    public void setSortname1(String sortname1) {
        this.sortname1 = sortname1;
    }

    private String sortname2;

    @javax.persistence.Column(name = "sortname2")
    @Basic
    public String getSortname2() {
        return sortname2;
    }

    public void setSortname2(String sortname2) {
        this.sortname2 = sortname2;
    }

    private String sortname3;

    @javax.persistence.Column(name = "sortname3")
    @Basic
    public String getSortname3() {
        return sortname3;
    }

    public void setSortname3(String sortname3) {
        this.sortname3 = sortname3;
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

    private byte featured;

    @javax.persistence.Column(name = "featured")
    @Basic
    public byte getFeatured() {
        return featured;
    }

    public void setFeatured(byte featured) {
        this.featured = featured;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuContactDetailsEntity that = (D47TuContactDetailsEntity) o;

        if (access != that.access) return false;
        if (catid != that.catid) return false;
        if (checkedOut != that.checkedOut) return false;
        if (createdBy != that.createdBy) return false;
        if (defaultCon != that.defaultCon) return false;
        if (featured != that.featured) return false;
        if (hits != that.hits) return false;
        if (id != that.id) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (ordering != that.ordering) return false;
        if (published != that.published) return false;
        if (userId != that.userId) return false;
        if (version != that.version) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (conPosition != null ? !conPosition.equals(that.conPosition) : that.conPosition != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdByAlias != null ? !createdByAlias.equals(that.createdByAlias) : that.createdByAlias != null)
            return false;
        if (emailTo != null ? !emailTo.equals(that.emailTo) : that.emailTo != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (misc != null ? !misc.equals(that.misc) : that.misc != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (sortname1 != null ? !sortname1.equals(that.sortname1) : that.sortname1 != null) return false;
        if (sortname2 != null ? !sortname2.equals(that.sortname2) : that.sortname2 != null) return false;
        if (sortname3 != null ? !sortname3.equals(that.sortname3) : that.sortname3 != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (suburb != null ? !suburb.equals(that.suburb) : that.suburb != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (webpage != null ? !webpage.equals(that.webpage) : that.webpage != null) return false;
        if (xreference != null ? !xreference.equals(that.xreference) : that.xreference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (conPosition != null ? conPosition.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (suburb != null ? suburb.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (misc != null ? misc.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (emailTo != null ? emailTo.hashCode() : 0);
        result = 31 * result + (defaultCon ? 1 : 0);
        result = 31 * result + (published ? 1 : 0);
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + ordering;
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + catid;
        result = 31 * result + access;
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (webpage != null ? webpage.hashCode() : 0);
        result = 31 * result + (sortname1 != null ? sortname1.hashCode() : 0);
        result = 31 * result + (sortname2 != null ? sortname2.hashCode() : 0);
        result = 31 * result + (sortname3 != null ? sortname3.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (createdByAlias != null ? createdByAlias.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + modifiedBy;
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (int) featured;
        result = 31 * result + (xreference != null ? xreference.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + hits;
        return result;
    }
}
