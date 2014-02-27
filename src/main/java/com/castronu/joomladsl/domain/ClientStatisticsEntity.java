package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:28
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "CLIENT_STATISTICS", schema = "", catalog = "information_schema")
@Entity
public class ClientStatisticsEntity {
    private String client;

    @javax.persistence.Column(name = "CLIENT")
    @Basic
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    private long totalConnections;

    @javax.persistence.Column(name = "TOTAL_CONNECTIONS")
    @Basic
    public long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(long totalConnections) {
        this.totalConnections = totalConnections;
    }

    private long concurrentConnections;

    @javax.persistence.Column(name = "CONCURRENT_CONNECTIONS")
    @Basic
    public long getConcurrentConnections() {
        return concurrentConnections;
    }

    public void setConcurrentConnections(long concurrentConnections) {
        this.concurrentConnections = concurrentConnections;
    }

    private long connectedTime;

    @javax.persistence.Column(name = "CONNECTED_TIME")
    @Basic
    public long getConnectedTime() {
        return connectedTime;
    }

    public void setConnectedTime(long connectedTime) {
        this.connectedTime = connectedTime;
    }

    private long busyTime;

    @javax.persistence.Column(name = "BUSY_TIME")
    @Basic
    public long getBusyTime() {
        return busyTime;
    }

    public void setBusyTime(long busyTime) {
        this.busyTime = busyTime;
    }

    private long cpuTime;

    @javax.persistence.Column(name = "CPU_TIME")
    @Basic
    public long getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(long cpuTime) {
        this.cpuTime = cpuTime;
    }

    private long bytesReceived;

    @javax.persistence.Column(name = "BYTES_RECEIVED")
    @Basic
    public long getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    private long bytesSent;

    @javax.persistence.Column(name = "BYTES_SENT")
    @Basic
    public long getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(long bytesSent) {
        this.bytesSent = bytesSent;
    }

    private long binlogBytesWritten;

    @javax.persistence.Column(name = "BINLOG_BYTES_WRITTEN")
    @Basic
    public long getBinlogBytesWritten() {
        return binlogBytesWritten;
    }

    public void setBinlogBytesWritten(long binlogBytesWritten) {
        this.binlogBytesWritten = binlogBytesWritten;
    }

    private long rowsFetched;

    @javax.persistence.Column(name = "ROWS_FETCHED")
    @Basic
    public long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    private long rowsUpdated;

    @javax.persistence.Column(name = "ROWS_UPDATED")
    @Basic
    public long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    private long tableRowsRead;

    @javax.persistence.Column(name = "TABLE_ROWS_READ")
    @Basic
    public long getTableRowsRead() {
        return tableRowsRead;
    }

    public void setTableRowsRead(long tableRowsRead) {
        this.tableRowsRead = tableRowsRead;
    }

    private long selectCommands;

    @javax.persistence.Column(name = "SELECT_COMMANDS")
    @Basic
    public long getSelectCommands() {
        return selectCommands;
    }

    public void setSelectCommands(long selectCommands) {
        this.selectCommands = selectCommands;
    }

    private long updateCommands;

    @javax.persistence.Column(name = "UPDATE_COMMANDS")
    @Basic
    public long getUpdateCommands() {
        return updateCommands;
    }

    public void setUpdateCommands(long updateCommands) {
        this.updateCommands = updateCommands;
    }

    private long otherCommands;

    @javax.persistence.Column(name = "OTHER_COMMANDS")
    @Basic
    public long getOtherCommands() {
        return otherCommands;
    }

    public void setOtherCommands(long otherCommands) {
        this.otherCommands = otherCommands;
    }

    private long commitTransactions;

    @javax.persistence.Column(name = "COMMIT_TRANSACTIONS")
    @Basic
    public long getCommitTransactions() {
        return commitTransactions;
    }

    public void setCommitTransactions(long commitTransactions) {
        this.commitTransactions = commitTransactions;
    }

    private long rollbackTransactions;

    @javax.persistence.Column(name = "ROLLBACK_TRANSACTIONS")
    @Basic
    public long getRollbackTransactions() {
        return rollbackTransactions;
    }

    public void setRollbackTransactions(long rollbackTransactions) {
        this.rollbackTransactions = rollbackTransactions;
    }

    private long deniedConnections;

    @javax.persistence.Column(name = "DENIED_CONNECTIONS")
    @Basic
    public long getDeniedConnections() {
        return deniedConnections;
    }

    public void setDeniedConnections(long deniedConnections) {
        this.deniedConnections = deniedConnections;
    }

    private long lostConnections;

    @javax.persistence.Column(name = "LOST_CONNECTIONS")
    @Basic
    public long getLostConnections() {
        return lostConnections;
    }

    public void setLostConnections(long lostConnections) {
        this.lostConnections = lostConnections;
    }

    private long accessDenied;

    @javax.persistence.Column(name = "ACCESS_DENIED")
    @Basic
    public long getAccessDenied() {
        return accessDenied;
    }

    public void setAccessDenied(long accessDenied) {
        this.accessDenied = accessDenied;
    }

    private long emptyQueries;

    @javax.persistence.Column(name = "EMPTY_QUERIES")
    @Basic
    public long getEmptyQueries() {
        return emptyQueries;
    }

    public void setEmptyQueries(long emptyQueries) {
        this.emptyQueries = emptyQueries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientStatisticsEntity that = (ClientStatisticsEntity) o;

        if (accessDenied != that.accessDenied) return false;
        if (binlogBytesWritten != that.binlogBytesWritten) return false;
        if (busyTime != that.busyTime) return false;
        if (bytesReceived != that.bytesReceived) return false;
        if (bytesSent != that.bytesSent) return false;
        if (commitTransactions != that.commitTransactions) return false;
        if (concurrentConnections != that.concurrentConnections) return false;
        if (connectedTime != that.connectedTime) return false;
        if (cpuTime != that.cpuTime) return false;
        if (deniedConnections != that.deniedConnections) return false;
        if (emptyQueries != that.emptyQueries) return false;
        if (lostConnections != that.lostConnections) return false;
        if (otherCommands != that.otherCommands) return false;
        if (rollbackTransactions != that.rollbackTransactions) return false;
        if (rowsFetched != that.rowsFetched) return false;
        if (rowsUpdated != that.rowsUpdated) return false;
        if (selectCommands != that.selectCommands) return false;
        if (tableRowsRead != that.tableRowsRead) return false;
        if (totalConnections != that.totalConnections) return false;
        if (updateCommands != that.updateCommands) return false;
        if (client != null ? !client.equals(that.client) : that.client != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = client != null ? client.hashCode() : 0;
        result = 31 * result + (int) (totalConnections ^ (totalConnections >>> 32));
        result = 31 * result + (int) (concurrentConnections ^ (concurrentConnections >>> 32));
        result = 31 * result + (int) (connectedTime ^ (connectedTime >>> 32));
        result = 31 * result + (int) (busyTime ^ (busyTime >>> 32));
        result = 31 * result + (int) (cpuTime ^ (cpuTime >>> 32));
        result = 31 * result + (int) (bytesReceived ^ (bytesReceived >>> 32));
        result = 31 * result + (int) (bytesSent ^ (bytesSent >>> 32));
        result = 31 * result + (int) (binlogBytesWritten ^ (binlogBytesWritten >>> 32));
        result = 31 * result + (int) (rowsFetched ^ (rowsFetched >>> 32));
        result = 31 * result + (int) (rowsUpdated ^ (rowsUpdated >>> 32));
        result = 31 * result + (int) (tableRowsRead ^ (tableRowsRead >>> 32));
        result = 31 * result + (int) (selectCommands ^ (selectCommands >>> 32));
        result = 31 * result + (int) (updateCommands ^ (updateCommands >>> 32));
        result = 31 * result + (int) (otherCommands ^ (otherCommands >>> 32));
        result = 31 * result + (int) (commitTransactions ^ (commitTransactions >>> 32));
        result = 31 * result + (int) (rollbackTransactions ^ (rollbackTransactions >>> 32));
        result = 31 * result + (int) (deniedConnections ^ (deniedConnections >>> 32));
        result = 31 * result + (int) (lostConnections ^ (lostConnections >>> 32));
        result = 31 * result + (int) (accessDenied ^ (accessDenied >>> 32));
        result = 31 * result + (int) (emptyQueries ^ (emptyQueries >>> 32));
        return result;
    }
}
