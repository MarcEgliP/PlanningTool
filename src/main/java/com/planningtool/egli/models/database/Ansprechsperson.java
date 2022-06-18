package com.planningtool.egli.models.database;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.planningtool.egli.models.embedded.EmbeddedMutable;
import com.planningtool.egli.models.embedded.EmbeddedUniquable;
import com.planningtool.egli.models.embedded.Mutable;
import com.planningtool.egli.models.embedded.Uniquable;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Getter
@Setter
@Table(name = "ANSPRECHSPERSON")
public class Ansprechsperson implements Serializable, Mutable, Uniquable{

    private static final long serialVersionUID = 105L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ANSPRECHSPERSON")
    private Integer id;

    @Column(name = "VERANTWORTUNG", nullable = false)
    private String verantwortung;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSON")
    @JsonManagedReference
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KUNDE")
    @JsonManagedReference
    private Kunde kunde;

    @Embedded
    private EmbeddedMutable embeddedMutable = new EmbeddedMutable();

    @Embedded
    private EmbeddedUniquable embeddedUniquable = new EmbeddedUniquable();

    @Override
    public Long getIdUnique() {
        return embeddedUniquable.getIdUnique();
    }

    @Override
    public void setIdUnique(Long idUnique) {
        embeddedUniquable.setIdUnique(idUnique);
        
    }

    @Override
    public Date getMutiertam() {
        return embeddedMutable.getMutiertam();
    }

    @Override
    public void setMutiertam(Date mutiertam) {
        embeddedMutable.setMutiertam(mutiertam);
    }

    @Override
    public String getMutiertvon() {
       return embeddedMutable.getMutiertvon();
    }

    @Override
    public void setMutiertvon(String mutiertvon) {
        embeddedMutable.setMutiertvon(mutiertvon);
    }
}
