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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuBannerTracksEntityPK.class)
@javax.persistence.Table(name = "d47tu_banner_tracks", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuBannerTracksEntity {
    private Timestamp trackDate;

    @javax.persistence.Column(name = "track_date")
    @Id
    public Timestamp getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(Timestamp trackDate) {
        this.trackDate = trackDate;
    }

    private int trackType;

    @javax.persistence.Column(name = "track_type")
    @Id
    public int getTrackType() {
        return trackType;
    }

    public void setTrackType(int trackType) {
        this.trackType = trackType;
    }

    private int bannerId;

    @javax.persistence.Column(name = "banner_id")
    @Id
    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    private int count;

    @javax.persistence.Column(name = "count")
    @Basic
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuBannerTracksEntity that = (D47TuBannerTracksEntity) o;

        if (bannerId != that.bannerId) return false;
        if (count != that.count) return false;
        if (trackType != that.trackType) return false;
        if (trackDate != null ? !trackDate.equals(that.trackDate) : that.trackDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trackDate != null ? trackDate.hashCode() : 0;
        result = 31 * result + trackType;
        result = 31 * result + bannerId;
        result = 31 * result + count;
        return result;
    }
}
