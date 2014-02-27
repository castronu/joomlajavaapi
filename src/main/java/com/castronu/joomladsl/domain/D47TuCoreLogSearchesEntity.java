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
@javax.persistence.Table(name = "d47tu_core_log_searches", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuCoreLogSearchesEntity {
    private String searchTerm;

    @javax.persistence.Column(name = "search_term")
    @Basic
    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    private int hits;

    @javax.persistence.Column(name = "hits")
    @Basic
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuCoreLogSearchesEntity that = (D47TuCoreLogSearchesEntity) o;

        if (hits != that.hits) return false;
        if (searchTerm != null ? !searchTerm.equals(that.searchTerm) : that.searchTerm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = searchTerm != null ? searchTerm.hashCode() : 0;
        result = 31 * result + hits;
        return result;
    }
}
