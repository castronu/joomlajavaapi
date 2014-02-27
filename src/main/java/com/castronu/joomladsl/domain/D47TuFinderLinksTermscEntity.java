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
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuFinderLinksTermscEntityPK.class)
@javax.persistence.Table(name = "d47tu_finder_links_termsc", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderLinksTermscEntity {
    private int linkId;

    @javax.persistence.Column(name = "link_id")
    @Id
    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    private int termId;

    @javax.persistence.Column(name = "term_id")
    @Id
    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderLinksTermscEntity that = (D47TuFinderLinksTermscEntity) o;

        if (linkId != that.linkId) return false;
        if (termId != that.termId) return false;
        if (Float.compare(that.weight, weight) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = linkId;
        result = 31 * result + termId;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        return result;
    }
}
