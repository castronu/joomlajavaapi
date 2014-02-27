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
@javax.persistence.Table(name = "d47tu_banner_clients", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuBannerClientsEntity {
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

    private String contact;

    @javax.persistence.Column(name = "contact")
    @Basic
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    private String email;

    @javax.persistence.Column(name = "email")
    @Basic
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String extrainfo;

    @javax.persistence.Column(name = "extrainfo")
    @Basic
    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
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

    private String metakey;

    @javax.persistence.Column(name = "metakey")
    @Basic
    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    private byte ownPrefix;

    @javax.persistence.Column(name = "own_prefix")
    @Basic
    public byte getOwnPrefix() {
        return ownPrefix;
    }

    public void setOwnPrefix(byte ownPrefix) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuBannerClientsEntity that = (D47TuBannerClientsEntity) o;

        if (checkedOut != that.checkedOut) return false;
        if (id != that.id) return false;
        if (ownPrefix != that.ownPrefix) return false;
        if (purchaseType != that.purchaseType) return false;
        if (state != that.state) return false;
        if (trackClicks != that.trackClicks) return false;
        if (trackImpressions != that.trackImpressions) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (extrainfo != null ? !extrainfo.equals(that.extrainfo) : that.extrainfo != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (metakeyPrefix != null ? !metakeyPrefix.equals(that.metakeyPrefix) : that.metakeyPrefix != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (extrainfo != null ? extrainfo.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (int) ownPrefix;
        result = 31 * result + (metakeyPrefix != null ? metakeyPrefix.hashCode() : 0);
        result = 31 * result + (int) purchaseType;
        result = 31 * result + (int) trackClicks;
        result = 31 * result + (int) trackImpressions;
        return result;
    }
}
