package com.castronu.joomladsl.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
public class D47TuFinderLinksTermseEntityPK implements Serializable {
    private int linkId;

    @Id
    @Column(name = "link_id")
    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    private int termId;

    @Id
    @Column(name = "term_id")
    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderLinksTermseEntityPK that = (D47TuFinderLinksTermseEntityPK) o;

        if (linkId != that.linkId) return false;
        if (termId != that.termId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = linkId;
        result = 31 * result + termId;
        return result;
    }
}
