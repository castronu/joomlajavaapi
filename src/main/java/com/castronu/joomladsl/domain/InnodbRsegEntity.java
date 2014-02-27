package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "INNODB_RSEG", schema = "", catalog = "information_schema")
@Entity
public class InnodbRsegEntity {
    private long rsegId;

    @javax.persistence.Column(name = "RSEG_ID")
    @Basic
    public long getRsegId() {
        return rsegId;
    }

    public void setRsegId(long rsegId) {
        this.rsegId = rsegId;
    }

    private long spaceId;

    @javax.persistence.Column(name = "SPACE_ID")
    @Basic
    public long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(long spaceId) {
        this.spaceId = spaceId;
    }

    private long pageNo;

    @javax.persistence.Column(name = "PAGE_NO")
    @Basic
    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    private long maxSize;

    @javax.persistence.Column(name = "MAX_SIZE")
    @Basic
    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }

    private long currSize;

    @javax.persistence.Column(name = "CURR_SIZE")
    @Basic
    public long getCurrSize() {
        return currSize;
    }

    public void setCurrSize(long currSize) {
        this.currSize = currSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbRsegEntity that = (InnodbRsegEntity) o;

        if (currSize != that.currSize) return false;
        if (maxSize != that.maxSize) return false;
        if (pageNo != that.pageNo) return false;
        if (rsegId != that.rsegId) return false;
        if (spaceId != that.spaceId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (rsegId ^ (rsegId >>> 32));
        result = 31 * result + (int) (spaceId ^ (spaceId >>> 32));
        result = 31 * result + (int) (pageNo ^ (pageNo >>> 32));
        result = 31 * result + (int) (maxSize ^ (maxSize >>> 32));
        result = 31 * result + (int) (currSize ^ (currSize >>> 32));
        return result;
    }
}
