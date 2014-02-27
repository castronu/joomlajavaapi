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
@javax.persistence.Table(name = "d47tu_banners", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuBannersEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int cid;

    @javax.persistence.Column(name = "cid")
    @Basic
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    private int type;

    @javax.persistence.Column(name = "type")
    @Basic
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    private int imptotal;

    @javax.persistence.Column(name = "imptotal")
    @Basic
    public int getImptotal() {
        return imptotal;
    }

    public void setImptotal(int imptotal) {
        this.imptotal = imptotal;
    }

    private int impmade;

    @javax.persistence.Column(name = "impmade")
    @Basic
    public int getImpmade() {
        return impmade;
    }

    public void setImpmade(int impmade) {
        this.impmade = impmade;
    }

    private int clicks;

    @javax.persistence.Column(name = "clicks")
    @Basic
    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    private String clickurl;

    @javax.persistence.Column(name = "clickurl")
    @Basic
    public String getClickurl() {
        return clickurl;
    }

    public void setClickurl(String clickurl) {
        this.clickurl = clickurl;
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

    private String description;

    @javax.persistence.Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String custombannercode;

    @javax.persistence.Column(name = "custombannercode")
    @Basic
    public String getCustombannercode() {
        return custombannercode;
    }

    public void setCustombannercode(String custombannercode) {
        this.custombannercode = custombannercode;
    }

    private boolean sticky;

    @javax.persistence.Column(name = "sticky")
    @Basic
    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
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

    private String params;

    @javax.persistence.Column(name = "params")
    @Basic
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    private boolean ownPrefix;

    @javax.persistence.Column(name = "own_prefix")
    @Basic
    public boolean isOwnPrefix() {
        return ownPrefix;
    }

    public void setOwnPrefix(boolean ownPrefix) {
        this.ownPrefix = ownPrefix;
    }

    private String metakeyPrefix;

    @javax.persistence.Column(name = "metakey_prefix")
    @Basic
    public String getMetakeyPrefix() {
        return metakeyPrefix;
    }

    public void setMetakeyPrefix(String metakeyPrefix) {
        this.metakeyPrefix = metakeyPrefix;
    }

    private byte purchaseType;

    @javax.persistence.Column(name = "purchase_type")
    @Basic
    public byte getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(byte purchaseType) {
        this.purchaseType = purchaseType;
    }

    private byte trackClicks;

    @javax.persistence.Column(name = "track_clicks")
    @Basic
    public byte getTrackClicks() {
        return trackClicks;
    }

    public void setTrackClicks(byte trackClicks) {
        this.trackClicks = trackClicks;
    }

    private byte trackImpressions;

    @javax.persistence.Column(name = "track_impressions")
    @Basic
    public byte getTrackImpressions() {
        return trackImpressions;
    }

    public void setTrackImpressions(byte trackImpressions) {
        this.trackImpressions = trackImpressions;
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

    private Timestamp reset;

    @javax.persistence.Column(name = "reset")
    @Basic
    public Timestamp getReset() {
        return reset;
    }

    public void setReset(Timestamp reset) {
        this.reset = reset;
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

    private String language;

    @javax.persistence.Column(name = "language")
    @Basic
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

        D47TuBannersEntity that = (D47TuBannersEntity) o;

        if (catid != that.catid) return false;
        if (checkedOut != that.checkedOut) return false;
        if (cid != that.cid) return false;
        if (clicks != that.clicks) return false;
        if (createdBy != that.createdBy) return false;
        if (id != that.id) return false;
        if (impmade != that.impmade) return false;
        if (imptotal != that.imptotal) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (ordering != that.ordering) return false;
        if (ownPrefix != that.ownPrefix) return false;
        if (purchaseType != that.purchaseType) return false;
        if (state != that.state) return false;
        if (sticky != that.sticky) return false;
        if (trackClicks != that.trackClicks) return false;
        if (trackImpressions != that.trackImpressions) return false;
        if (type != that.type) return false;
        if (version != that.version) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (clickurl != null ? !clickurl.equals(that.clickurl) : that.clickurl != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdByAlias != null ? !createdByAlias.equals(that.createdByAlias) : that.createdByAlias != null)
            return false;
        if (custombannercode != null ? !custombannercode.equals(that.custombannercode) : that.custombannercode != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (metakeyPrefix != null ? !metakeyPrefix.equals(that.metakeyPrefix) : that.metakeyPrefix != null)
            return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (reset != null ? !reset.equals(that.reset) : that.reset != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cid;
        result = 31 * result + type;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + imptotal;
        result = 31 * result + impmade;
        result = 31 * result + clicks;
        result = 31 * result + (clickurl != null ? clickurl.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + catid;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (custombannercode != null ? custombannercode.hashCode() : 0);
        result = 31 * result + (sticky ? 1 : 0);
        result = 31 * result + ordering;
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (ownPrefix ? 1 : 0);
        result = 31 * result + (metakeyPrefix != null ? metakeyPrefix.hashCode() : 0);
        result = 31 * result + (int) purchaseType;
        result = 31 * result + (int) trackClicks;
        result = 31 * result + (int) trackImpressions;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + (reset != null ? reset.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (createdByAlias != null ? createdByAlias.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + modifiedBy;
        result = 31 * result + version;
        return result;
    }
}
