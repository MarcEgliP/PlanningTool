package com.planningtool.egli.models.database;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.planningtool.egli.models.embedded.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "PLANUNG")
public class Planung implements Serializable, Mutable, Uniquable {
    private static final long serialVersionUID = 113L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PLANUNG")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MITARBEITER", nullable = false)
    @JsonManagedReference
    private Mitarbeiter mitarbeiter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TICKET", nullable = false)
    @JsonManagedReference
    private Ticket ticket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ANSPRECHSPERSON")
    @JsonManagedReference
    private Ansprechsperson ansprechsperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PHASE")
    @JsonManagedReference
    private Phase phase;

    @Column(name = "VON", nullable = false)
    private LocalDateTime von;

    @Column(name = "BIS", nullable = false)
    private LocalDateTime bis;

    //TODO Datentyp im ERD ändern
    @Column(name = "SITZUNG", nullable = false)
    private boolean sitzung;

    @Embedded
    private EmbeddedMutable embeddedMutable = new EmbeddedMutable();

    @Embedded
    private EmbeddedUniquable embeddedUniquable = new EmbeddedUniquable();

    @Override
    public Date getMutiertam() {
        return this.embeddedMutable.getMutiertam();
    }

    @Override
    public void setMutiertam(Date mutiertam) {
        this.embeddedMutable.setMutiertam(mutiertam);
    }

    @Override
    public String getMutiertvon() {
        return this.embeddedMutable.getMutiertvon();
    }

    @Override
    public void setMutiertvon(String mutiertvon) {
        this.embeddedMutable.setMutiertvon(mutiertvon);
    }

    @Override
    public Long getIdUnique() {
        return serialVersionUID;
    }
}
