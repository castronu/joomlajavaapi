package com.castronu.joomladsl.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
public class D47TuBannerTracksEntityPK implements Serializable {
    private Timestamp trackDate;

    @Id
    @Column(name = "track_date")
    public Timestamp getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(Timestamp trackDate) {
        this.trackDate = trackDate;
    }

    private int trackType;

    @Id
    @Column(name = "track_type")
    public int getTrackType() {
        return trackType;
    }

    public void setTrackType(int trackType) {
        this.trackType = trackType;
    }

    private int bannerId;

    @Id
    @Column(name = "banner_id")
    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuBannerTracksEntityPK that = (D47TuBannerTracksEntityPK) o;

        if (bannerId != that.bannerId) return false;
        if (trackType != that.trackType) return false;
        if (trackDate != null ? !trackDate.equals(that.trackDate) : that.trackDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trackDate != null ? trackDate.hashCode() : 0;
        result = 31 * result + trackType;
        result = 31 * result + bannerId;
        return result;
    }
}
