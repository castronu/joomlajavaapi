package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_template_styles", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuTemplateStylesEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String template;

    @javax.persistence.Column(name = "template")
    @Basic
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    private boolean clientId;

    @javax.persistence.Column(name = "client_id")
    @Basic
    public boolean isClientId() {
        return clientId;
    }

    public void setClientId(boolean clientId) {
        this.clientId = clientId;
    }

    private String home;

    @javax.persistence.Column(name = "home")
    @Basic
    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
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

    private String params;

    @javax.persistence.Column(name = "params")
    @Basic
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuTemplateStylesEntity that = (D47TuTemplateStylesEntity) o;

        if (clientId != that.clientId) return false;
        if (id != that.id) return false;
        if (home != null ? !home.equals(that.home) : that.home != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (template != null ? !template.equals(that.template) : that.template != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (template != null ? template.hashCode() : 0);
        result = 31 * result + (clientId ? 1 : 0);
        result = 31 * result + (home != null ? home.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        return result;
    }
}
