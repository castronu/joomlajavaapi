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
@javax.persistence.Table(name = "d47tu_finder_terms", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderTermsEntity {
    private int termId;

    @javax.persistence.Column(name = "term_id")
    @Id
    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    private String term;

    @javax.persistence.Column(name = "term")
    @Basic
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    private String stem;

    @javax.persistence.Column(name = "stem")
    @Basic
    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    private boolean common;

    @javax.persistence.Column(name = "common")
    @Basic
    public boolean isCommon() {
        return common;
    }

    public void setCommon(boolean common) {
        this.common = common;
    }

    private boolean phrase;

    @javax.persistence.Column(name = "phrase")
    @Basic
    public boolean isPhrase() {
        return phrase;
    }

    public void setPhrase(boolean phrase) {
        this.phrase = phrase;
    }

    private float weight;

    @javax.persistence.Column(name = "weight")
    @Basic
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private String soundex;

    @javax.persistence.Column(name = "soundex")
    @Basic
    public String getSoundex() {
        return soundex;
    }

    public void setSoundex(String soundex) {
        this.soundex = soundex;
    }

    private int links;

    @javax.persistence.Column(name = "links")
    @Basic
    public int getLinks() {
        return links;
    }

    public void setLinks(int links) {
        this.links = links;
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

        D47TuFinderTermsEntity that = (D47TuFinderTermsEntity) o;

        if (common != that.common) return false;
        if (links != that.links) return false;
        if (phrase != that.phrase) return false;
        if (termId != that.termId) return false;
        if (Float.compare(that.weight, weight) != 0) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (soundex != null ? !soundex.equals(that.soundex) : that.soundex != null) return false;
        if (stem != null ? !stem.equals(that.stem) : that.stem != null) return false;
        if (term != null ? !term.equals(that.term) : that.term != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = termId;
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (stem != null ? stem.hashCode() : 0);
        result = 31 * result + (common ? 1 : 0);
        result = 31 * result + (phrase ? 1 : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (soundex != null ? soundex.hashCode() : 0);
        result = 31 * result + links;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
