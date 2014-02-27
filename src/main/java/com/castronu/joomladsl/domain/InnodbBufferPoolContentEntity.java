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
@javax.persistence.Table(name = "INNODB_BUFFER_POOL_CONTENT", schema = "", catalog = "information_schema")
@Entity
public class InnodbBufferPoolContentEntity {
    private long blockNum;

    @javax.persistence.Column(name = "BLOCK_NUM")
    @Basic
    public long getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(long blockNum) {
        this.blockNum = blockNum;
    }

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

    private long records;

    @javax.persistence.Column(name = "RECORDS")
    @Basic
    public long getRecords() {
        return records;
    }

    public void setRecords(long records) {
        this.records = records;
    }

    private long datasize;

    @javax.persistence.Column(name = "DATASIZE")
    @Basic
    public long getDatasize() {
        return datasize;
    }

    public void setDatasize(long datasize) {
        this.datasize = datasize;
    }

    private long flushType;

    @javax.persistence.Column(name = "FLUSH_TYPE")
    @Basic
    public long getFlushType() {
        return flushType;
    }

    public void setFlushType(long flushType) {
        this.flushType = flushType;
    }

    private long fixCount;

    @javax.persistence.Column(name = "FIX_COUNT")
    @Basic
    public long getFixCount() {
        return fixCount;
    }

    public void setFixCount(long fixCount) {
        this.fixCount = fixCount;
    }

    private long lruPosition;

    @javax.persistence.Column(name = "LRU_POSITION")
    @Basic
    public long getLruPosition() {
        return lruPosition;
    }

    public void setLruPosition(long lruPosition) {
        this.lruPosition = lruPosition;
    }

    private long pageTypeId;

    @javax.persistence.Column(name = "PAGE_TYPE_ID")
    @Basic
    public long getPageTypeId() {
        return pageTypeId;
    }

    public void setPageTypeId(long pageTypeId) {
        this.pageTypeId = pageTypeId;
    }

    private String pageType;

    @javax.persistence.Column(name = "PAGE_TYPE")
    @Basic
    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
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

    private String tableSchema;

    @javax.persistence.Column(name = "TABLE_SCHEMA")
    @Basic
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbBufferPoolContentEntity that = (InnodbBufferPoolContentEntity) o;

        if (blockNum != that.blockNum) return false;
        if (datasize != that.datasize) return false;
        if (fixCount != that.fixCount) return false;
        if (flushType != that.flushType) return false;
        if (lruPosition != that.lruPosition) return false;
        if (offset != that.offset) return false;
        if (pageTypeId != that.pageTypeId) return false;
        if (records != that.records) return false;
        if (space != that.space) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;
        if (pageType != null ? !pageType.equals(that.pageType) : that.pageType != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (blockNum ^ (blockNum >>> 32));
        result = 31 * result + (int) (space ^ (space >>> 32));
        result = 31 * result + (int) (offset ^ (offset >>> 32));
        result = 31 * result + (int) (records ^ (records >>> 32));
        result = 31 * result + (int) (datasize ^ (datasize >>> 32));
        result = 31 * result + (int) (flushType ^ (flushType >>> 32));
        result = 31 * result + (int) (fixCount ^ (fixCount >>> 32));
        result = 31 * result + (int) (lruPosition ^ (lruPosition >>> 32));
        result = 31 * result + (int) (pageTypeId ^ (pageTypeId >>> 32));
        result = 31 * result + (pageType != null ? pageType.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        return result;
    }
}
