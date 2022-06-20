package com.planningtool.egli.models.embedded;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author egli
 */
@Embeddable
public class EmbeddedMutable implements Serializable, Mutable {

    @Basic(optional = false)
    @Column(name = "MUTIERTAM", nullable = false)
    private Date mutiertam;

    @Basic(optional = false)
    @Column(name = "MUTIERTVON", nullable = false)
    private String mutiertvon;

    @Override
    public Date getMutiertam() {
        return mutiertam;
    }

    @Override
    public void setMutiertam(Date mutiertam) {
        this.mutiertam = mutiertam;        
    }

    @Override
    public String getMutiertvon() {
        return mutiertvon;
    }

    @Override
    public void setMutiertvon(String mutiertvon) {
       this.mutiertvon = mutiertvon;
    }

}
