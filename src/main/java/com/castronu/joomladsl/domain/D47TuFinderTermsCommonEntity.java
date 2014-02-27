package com.castronu.joomladsl.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "d47tu_finder_terms_common", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderTermsCommonEntity {
    private String term;

    @javax.persistence.Column(name = "term")
    @Basic
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderTermsCommonEntity that = (D47TuFinderTermsCommonEntity) o;

        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (term != null ? !term.equals(that.term) : that.term != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = term != null ? term.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
