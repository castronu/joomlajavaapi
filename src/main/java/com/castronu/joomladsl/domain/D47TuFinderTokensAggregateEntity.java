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
@javax.persistence.Table(name = "d47tu_finder_tokens_aggregate", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderTokensAggregateEntity {
    private int termId;

    @javax.persistence.Column(name = "term_id")
    @Basic
    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    private String mapSuffix;

    @javax.persistence.Column(name = "map_suffix")
    @Basic
    public String getMapSuffix() {
        return mapSuffix;
    }

    public void setMapSuffix(String mapSuffix) {
        this.mapSuffix = mapSuffix;
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

    private float termWeight;

    @javax.persistence.Column(name = "term_weight")
    @Basic
    public float getTermWeight() {
        return termWeight;
    }

    public void setTermWeight(float termWeight) {
        this.termWeight = termWeight;
    }

    private boolean context;

    @javax.persistence.Column(name = "context")
    @Basic
    public boolean isContext() {
        return context;
    }

    public void setContext(boolean context) {
        this.context = context;
    }

    private float contextWeight;

    @javax.persistence.Column(name = "context_weight")
    @Basic
    public float getContextWeight() {
        return contextWeight;
    }

    public void setContextWeight(float contextWeight) {
        this.contextWeight = contextWeight;
    }

    private float totalWeight;

    @javax.persistence.Column(name = "total_weight")
    @Basic
    public float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
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

        D47TuFinderTokensAggregateEntity that = (D47TuFinderTokensAggregateEntity) o;

        if (common != that.common) return false;
        if (context != that.context) return false;
        if (Float.compare(that.contextWeight, contextWeight) != 0) return false;
        if (phrase != that.phrase) return false;
        if (termId != that.termId) return false;
        if (Float.compare(that.termWeight, termWeight) != 0) return false;
        if (Float.compare(that.totalWeight, totalWeight) != 0) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (mapSuffix != null ? !mapSuffix.equals(that.mapSuffix) : that.mapSuffix != null) return false;
        if (stem != null ? !stem.equals(that.stem) : that.stem != null) return false;
        if (term != null ? !term.equals(that.term) : that.term != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = termId;
        result = 31 * result + (mapSuffix != null ? mapSuffix.hashCode() : 0);
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (stem != null ? stem.hashCode() : 0);
        result = 31 * result + (common ? 1 : 0);
        result = 31 * result + (phrase ? 1 : 0);
        result = 31 * result + (termWeight != +0.0f ? Float.floatToIntBits(termWeight) : 0);
        result = 31 * result + (context ? 1 : 0);
        result = 31 * result + (contextWeight != +0.0f ? Float.floatToIntBits(contextWeight) : 0);
        result = 31 * result + (totalWeight != +0.0f ? Float.floatToIntBits(totalWeight) : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
