package com.planningtool.egli.models.embedded;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author egli
 */
@Embeddable
public class EmbeddedSortable implements Serializable, Sortable {

    @Basic(optional = false)
    @Column(name = "SORTIERUNG", nullable = false)
    private Integer sortierung;

    @Override
    public Integer getSortierung() {
        return sortierung;
    }

    @Override
    public void setSortierung(Integer sortierung) {
        this.sortierung = sortierung;        
    }

    
}
