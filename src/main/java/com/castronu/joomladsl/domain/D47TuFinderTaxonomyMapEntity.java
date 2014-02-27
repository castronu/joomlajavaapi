package com.castronu.joomladsl.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.IdClass(com.castronu.joomladsl.domain.D47TuFinderTaxonomyMapEntityPK.class)
@javax.persistence.Table(name = "d47tu_finder_taxonomy_map", schema = "", catalog = "testJoomlaDsl")
@Entity
public class D47TuFinderTaxonomyMapEntity {
    private int linkId;

    @javax.persistence.Column(name = "link_id")
    @Id
    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    private int nodeId;

    @javax.persistence.Column(name = "node_id")
    @Id
    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D47TuFinderTaxonomyMapEntity that = (D47TuFinderTaxonomyMapEntity) o;

        if (linkId != that.linkId) return false;
        if (nodeId != that.nodeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = linkId;
        result = 31 * result + nodeId;
        return result;
    }
}
