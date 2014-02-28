package com.castronu.joomlajavaapi.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "INNODB_IO_PATTERN", schema = "", catalog = "information_schema")
@Entity
public class InnodbIoPatternEntity {
    private long space;

    @javax.persistence.Column(name = "SPACE")
    @Basic
    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

    private long offset;

    @javax.persistence.Column(name = "OFFSET")
    @Basic
    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    private long indexId;

    @javax.persistence.Column(name = "INDEX_ID")
    @Basic
    public long getIndexId() {
        return indexId;
    }

    public void setIndexId(long indexId) {
        this.indexId = indexId;
    }

    private String tableName;

    @javax.persistence.Column(name = "TABLE_NAME")
    @Basic
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private String indexName;

    @javax.persistence.Column(name = "INDEX_NAME")
    @Basic
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    private long nRead;

    @javax.persistence.Column(name = "N_READ")
    @Basic
    public long getnRead() {
        return nRead;
    }

    public void setnRead(long nRead) {
        this.nRead = nRead;
    }

    private long nWrite;

    @javax.persistence.Column(name = "N_WRITE")
    @Basic
    public long getnWrite() {
        return nWrite;
    }

    public void setnWrite(long nWrite) {
        this.nWrite = nWrite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbIoPatternEntity that = (InnodbIoPatternEntity) o;

        if (indexId != that.indexId) return false;
        if (nRead != that.nRead) return false;
        if (nWrite != that.nWrite) return false;
        if (offset != that.offset) return false;
        if (space != that.space) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (space ^ (space >>> 32));
        result = 31 * result + (int) (offset ^ (offset >>> 32));
        result = 31 * result + (int) (indexId ^ (indexId >>> 32));
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + (int) (nRead ^ (nRead >>> 32));
        result = 31 * result + (int) (nWrite ^ (nWrite >>> 32));
        return result;
    }
}
