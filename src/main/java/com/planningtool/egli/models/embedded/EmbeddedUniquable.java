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
public class EmbeddedUniquable implements Serializable, Uniquable {

    @Basic(optional = false)
    @Column(name = "ID_UNIQUE", nullable = false)
    private Long idUnique;

    @Override
    public Long getIdUnique() {
        return idUnique;
    }    
}
