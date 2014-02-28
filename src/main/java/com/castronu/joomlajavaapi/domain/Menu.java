package com.castronu.joomlajavaapi.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table
@Entity
public class Menu {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String menutype;

    @javax.persistence.Column(name = "menutype")
    @Basic
    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
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

    private String alias;

    @javax.persistence.Column(name = "alias")
    @Basic
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String note;

    @javax.persistence.Column(name = "note")
    @Basic
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String path;

    @javax.persistence.Column(name = "path")
    @Basic
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String link;

    @javax.persistence.Column(name = "link")
    @Basic
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String type;

    @javax.persistence.Column(name = "type")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private byte published;

    @javax.persistence.Column(name = "published")
    @Basic
    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
    }

    private int parentId;

    @javax.persistence.Column(name = "parent_id")
    @Basic
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    private int level;

    @javax.persistence.Column(name = "level")
    @Basic
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private int componentId;

    @javax.persistence.Column(name = "component_id")
    @Basic
    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
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

    private int access;

    @javax.persistence.Column(name = "access")
    @Basic
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    private String img;

    @javax.persistence.Column(name = "img")
    @Basic
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    private int templateStyleId;

    @javax.persistence.Column(name = "template_style_id")
    @Basic
    public int getTemplateStyleId() {
        return templateStyleId;
    }

    public void setTemplateStyleId(int templateStyleId) {
        this.templateStyleId = templateStyleId;
    }

    private String params;

    @javax.persistence.Column(name = "params")
    @Basic
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    private int lft;

    @javax.persistence.Column(name = "lft")
    @Basic
    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    private int rgt;

    @javax.persistence.Column(name = "rgt")
    @Basic
    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
    }

    private byte home;

    @javax.persistence.Column(name = "home")
    @Basic
    public byte getHome() {
        return home;
    }

    public void setHome(byte home) {
        this.home = home;
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

    private byte clientId;

    @javax.persistence.Column(name = "client_id")
    @Basic
    public byte getClientId() {
        return clientId;
    }

    public void setClientId(byte clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu that = (Menu) o;

        if (access != that.access) return false;
        if (checkedOut != that.checkedOut) return false;
        if (clientId != that.clientId) return false;
        if (componentId != that.componentId) return false;
        if (home != that.home) return false;
        if (id != that.id) return false;
        if (level != that.level) return false;
        if (lft != that.lft) return false;
        if (parentId != that.parentId) return false;
        if (published != that.published) return false;
        if (rgt != that.rgt) return false;
        if (templateStyleId != that.templateStyleId) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (menutype != null ? !menutype.equals(that.menutype) : that.menutype != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (menutype != null ? menutype.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (int) published;
        result = 31 * result + parentId;
        result = 31 * result + level;
        result = 31 * result + componentId;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + access;
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + templateStyleId;
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + lft;
        result = 31 * result + rgt;
        result = 31 * result + (int) home;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (int) clientId;
        return result;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menutype='" + menutype + '\'' +
                ", title='" + title + '\'' +
                ", alias='" + alias + '\'' +
                ", note='" + note + '\'' +
                ", path='" + path + '\'' +
                ", link='" + link + '\'' +
                ", type='" + type + '\'' +
                ", published=" + published +
                ", parentId=" + parentId +
                ", level=" + level +
                ", componentId=" + componentId +
                ", checkedOut=" + checkedOut +
                ", checkedOutTime=" + checkedOutTime +
                ", access=" + access +
                ", img='" + img + '\'' +
                ", templateStyleId=" + templateStyleId +
                ", params='" + params + '\'' +
                ", lft=" + lft +
                ", rgt=" + rgt +
                ", home=" + home +
                ", language='" + language + '\'' +
                ", clientId=" + clientId +
                '}';
    }
}
