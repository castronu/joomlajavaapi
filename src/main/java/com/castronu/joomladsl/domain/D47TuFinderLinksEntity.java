package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:29
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_finder_links", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderLinksEntity {
    private int linkId;

    @javax.persistence.Column(name = "link_id")
    @Id
    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    private String url;

    @javax.persistence.Column(name = "url")
    @Basic
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String route;

    @javax.persistence.Column(name = "route")
    @Basic
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    private String title;

    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    private Timestamp indexdate;

    @javax.persistence.Column(name = "indexdate")
    @Basic
    public Timestamp getIndexdate() {
        return indexdate;
    }

    public void setIndexdate(Timestamp indexdate) {
        this.indexdate = indexdate;
    }

    private String md5Sum;

    @javax.persistence.Column(name = "md5sum")
    @Basic
    public String getMd5Sum() {
        return md5Sum;
    }

    public void setMd5Sum(String md5Sum) {
        this.md5Sum = md5Sum;
    }

    private boolean published;

    @javax.persistence.Column(name = "published")
    @Basic
    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    private int state;

    @javax.persistence.Column(name = "state")
    @Basic
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
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

    private Timestamp publishStartDate;

    @javax.persistence.Column(name = "publish_start_date")
    @Basic
    public Timestamp getPublishStartDate() {
        return publishStartDate;
    }

    public void setPublishStartDate(Timestamp publishStartDate) {
        this.publishStartDate = publishStartDate;
    }

    private Timestamp publishEndDate;

    @javax.persistence.Column(name = "publish_end_date")
    @Basic
    public Timestamp getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(Timestamp publishEndDate) {
        this.publishEndDate = publishEndDate;
    }

    private Timestamp startDate;

    @javax.persistence.Column(name = "start_date")
    @Basic
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    private Timestamp endDate;

    @javax.persistence.Column(name = "end_date")
    @Basic
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    private double listPrice;

    @javax.persistence.Column(name = "list_price")
    @Basic
    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    private double salePrice;

    @javax.persistence.Column(name = "sale_price")
    @Basic
    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    private int typeId;

    @javax.persistence.Column(name = "type_id")
    @Basic
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    private byte[] object;

    @javax.persistence.Column(name = "object")
    @Basic
    public byte[] getObject() {
        return object;
    }

    public void setObject(byte[] object) {
        this.object = object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderLinksEntity that = (D47TuFinderLinksEntity) o;

        if (access != that.access) return false;
        if (linkId != that.linkId) return false;
        if (Double.compare(that.listPrice, listPrice) != 0) return false;
        if (published != that.published) return false;
        if (Double.compare(that.salePrice, salePrice) != 0) return false;
        if (state != that.state) return false;
        if (typeId != that.typeId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (indexdate != null ? !indexdate.equals(that.indexdate) : that.indexdate != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (md5Sum != null ? !md5Sum.equals(that.md5Sum) : that.md5Sum != null) return false;
        if (!Arrays.equals(object, that.object)) return false;
        if (publishEndDate != null ? !publishEndDate.equals(that.publishEndDate) : that.publishEndDate != null)
            return false;
        if (publishStartDate != null ? !publishStartDate.equals(that.publishStartDate) : that.publishStartDate != null)
            return false;
        if (route != null ? !route.equals(that.route) : that.route != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = linkId;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (route != null ? route.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (indexdate != null ? indexdate.hashCode() : 0);
        result = 31 * result + (md5Sum != null ? md5Sum.hashCode() : 0);
        result = 31 * result + (published ? 1 : 0);
        result = 31 * result + state;
        result = 31 * result + access;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (publishStartDate != null ? publishStartDate.hashCode() : 0);
        result = 31 * result + (publishEndDate != null ? publishEndDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        temp = listPrice != +0.0d ? Double.doubleToLongBits(listPrice) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = salePrice != +0.0d ? Double.doubleToLongBits(salePrice) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + typeId;
        result = 31 * result + (object != null ? Arrays.hashCode(object) : 0);
        return result;
    }
}
