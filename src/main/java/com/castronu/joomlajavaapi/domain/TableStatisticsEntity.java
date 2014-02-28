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
@javax.persistence.Table(name = "TABLE_STATISTICS", schema = "", catalog = "information_schema")
@Entity
public class TableStatisticsEntity {
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

    private long rowsRead;

    @javax.persistence.Column(name = "ROWS_READ")
    @Basic
    public long getRowsRead() {
        return rowsRead;
    }

    public void setRowsRead(long rowsRead) {
        this.rowsRead = rowsRead;
    }

    private long rowsChanged;

    @javax.persistence.Column(name = "ROWS_CHANGED")
    @Basic
    public long getRowsChanged() {
        return rowsChanged;
    }

    public void setRowsChanged(long rowsChanged) {
        this.rowsChanged = rowsChanged;
    }

    private long rowsChangedXIndexes;

    @javax.persistence.Column(name = "ROWS_CHANGED_X_INDEXES")
    @Basic
    public long getRowsChangedXIndexes() {
        return rowsChangedXIndexes;
    }

    public void setRowsChangedXIndexes(long rowsChangedXIndexes) {
        this.rowsChangedXIndexes = rowsChangedXIndexes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableStatisticsEntity that = (TableStatisticsEntity) o;

        if (rowsChanged != that.rowsChanged) return false;
        if (rowsChangedXIndexes != that.rowsChangedXIndexes) return false;
        if (rowsRead != that.rowsRead) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableSchema != null ? tableSchema.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowsRead ^ (rowsRead >>> 32));
        result = 31 * result + (int) (rowsChanged ^ (rowsChanged >>> 32));
        result = 31 * result + (int) (rowsChangedXIndexes ^ (rowsChangedXIndexes >>> 32));
        return result;
    }
}
