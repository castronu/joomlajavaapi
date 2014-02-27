package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PROFILING", schema = "", catalog = "information_schema")
@Entity
public class ProfilingEntity {
    private long queryId;

    @javax.persistence.Column(name = "QUERY_ID")
    @Basic
    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    private long seq;

    @javax.persistence.Column(name = "SEQ")
    @Basic
    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    private String state;

    @javax.persistence.Column(name = "STATE")
    @Basic
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private BigDecimal duration;

    @javax.persistence.Column(name = "DURATION")
    @Basic
    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    private BigDecimal cpuUser;

    @javax.persistence.Column(name = "CPU_USER")
    @Basic
    public BigDecimal getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(BigDecimal cpuUser) {
        this.cpuUser = cpuUser;
    }

    private BigDecimal cpuSystem;

    @javax.persistence.Column(name = "CPU_SYSTEM")
    @Basic
    public BigDecimal getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(BigDecimal cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    private long contextVoluntary;

    @javax.persistence.Column(name = "CONTEXT_VOLUNTARY")
    @Basic
    public long getContextVoluntary() {
        return contextVoluntary;
    }

    public void setContextVoluntary(long contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    private long contextInvoluntary;

    @javax.persistence.Column(name = "CONTEXT_INVOLUNTARY")
    @Basic
    public long getContextInvoluntary() {
        return contextInvoluntary;
    }

    public void setContextInvoluntary(long contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    private long blockOpsIn;

    @javax.persistence.Column(name = "BLOCK_OPS_IN")
    @Basic
    public long getBlockOpsIn() {
        return blockOpsIn;
    }

    public void setBlockOpsIn(long blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    private long blockOpsOut;

    @javax.persistence.Column(name = "BLOCK_OPS_OUT")
    @Basic
    public long getBlockOpsOut() {
        return blockOpsOut;
    }

    public void setBlockOpsOut(long blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    private long messagesSent;

    @javax.persistence.Column(name = "MESSAGES_SENT")
    @Basic
    public long getMessagesSent() {
        return messagesSent;
    }

    public void setMessagesSent(long messagesSent) {
        this.messagesSent = messagesSent;
    }

    private long messagesReceived;

    @javax.persistence.Column(name = "MESSAGES_RECEIVED")
    @Basic
    public long getMessagesReceived() {
        return messagesReceived;
    }

    public void setMessagesReceived(long messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    private long pageFaultsMajor;

    @javax.persistence.Column(name = "PAGE_FAULTS_MAJOR")
    @Basic
    public long getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    public void setPageFaultsMajor(long pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    private long pageFaultsMinor;

    @javax.persistence.Column(name = "PAGE_FAULTS_MINOR")
    @Basic
    public long getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    public void setPageFaultsMinor(long pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    private long swaps;

    @javax.persistence.Column(name = "SWAPS")
    @Basic
    public long getSwaps() {
        return swaps;
    }

    public void setSwaps(long swaps) {
        this.swaps = swaps;
    }

    private String sourceFunction;

    @javax.persistence.Column(name = "SOURCE_FUNCTION")
    @Basic
    public String getSourceFunction() {
        return sourceFunction;
    }

    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    private String sourceFile;

    @javax.persistence.Column(name = "SOURCE_FILE")
    @Basic
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    private long sourceLine;

    @javax.persistence.Column(name = "SOURCE_LINE")
    @Basic
    public long getSourceLine() {
        return sourceLine;
    }

    public void setSourceLine(long sourceLine) {
        this.sourceLine = sourceLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfilingEntity that = (ProfilingEntity) o;

        if (blockOpsIn != that.blockOpsIn) return false;
        if (blockOpsOut != that.blockOpsOut) return false;
        if (contextInvoluntary != that.contextInvoluntary) return false;
        if (contextVoluntary != that.contextVoluntary) return false;
        if (messagesReceived != that.messagesReceived) return false;
        if (messagesSent != that.messagesSent) return false;
        if (pageFaultsMajor != that.pageFaultsMajor) return false;
        if (pageFaultsMinor != that.pageFaultsMinor) return false;
        if (queryId != that.queryId) return false;
        if (seq != that.seq) return false;
        if (sourceLine != that.sourceLine) return false;
        if (swaps != that.swaps) return false;
        if (cpuSystem != null ? !cpuSystem.equals(that.cpuSystem) : that.cpuSystem != null) return false;
        if (cpuUser != null ? !cpuUser.equals(that.cpuUser) : that.cpuUser != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (sourceFile != null ? !sourceFile.equals(that.sourceFile) : that.sourceFile != null) return false;
        if (sourceFunction != null ? !sourceFunction.equals(that.sourceFunction) : that.sourceFunction != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (queryId ^ (queryId >>> 32));
        result = 31 * result + (int) (seq ^ (seq >>> 32));
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (cpuUser != null ? cpuUser.hashCode() : 0);
        result = 31 * result + (cpuSystem != null ? cpuSystem.hashCode() : 0);
        result = 31 * result + (int) (contextVoluntary ^ (contextVoluntary >>> 32));
        result = 31 * result + (int) (contextInvoluntary ^ (contextInvoluntary >>> 32));
        result = 31 * result + (int) (blockOpsIn ^ (blockOpsIn >>> 32));
        result = 31 * result + (int) (blockOpsOut ^ (blockOpsOut >>> 32));
        result = 31 * result + (int) (messagesSent ^ (messagesSent >>> 32));
        result = 31 * result + (int) (messagesReceived ^ (messagesReceived >>> 32));
        result = 31 * result + (int) (pageFaultsMajor ^ (pageFaultsMajor >>> 32));
        result = 31 * result + (int) (pageFaultsMinor ^ (pageFaultsMinor >>> 32));
        result = 31 * result + (int) (swaps ^ (swaps >>> 32));
        result = 31 * result + (sourceFunction != null ? sourceFunction.hashCode() : 0);
        result = 31 * result + (sourceFile != null ? sourceFile.hashCode() : 0);
        result = 31 * result + (int) (sourceLine ^ (sourceLine >>> 32));
        return result;
    }
}
