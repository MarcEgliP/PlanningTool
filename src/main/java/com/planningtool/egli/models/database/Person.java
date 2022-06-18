package com.planningtool.egli.models.database;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "PERSON")
public class Person implements Serializable, Mutable, Uniquable{

    private static final long serialVersionUID = 103L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PERSON")
    private Integer id;

    @Column(name = "VORNAME")
    private String vorname;

    @Column(name = "NAME", nullable = false)
    private String nachname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFON")
    private String telefon;

    @Embedded
    private EmbeddedMutable embeddedMutable = new EmbeddedMutable();

    @Embedded
    private EmbeddedUniquable embeddedUniquable = new EmbeddedUniquable();

    @OneToMany(mappedBy="person", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Kunde> personKunden;

    @OneToMany(mappedBy="person", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Mitarbeiter> personMitarbeiter;

    @OneToMany(mappedBy="person", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ansprechsperson> personAnsprechspersonen;

    @Override
    public Long getIdUnique() {
        return embeddedUniquable.getIdUnique();
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
