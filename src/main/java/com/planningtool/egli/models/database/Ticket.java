package com.planningtool.egli.models.database;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.planningtool.egli.models.embedded.EmbeddedMutable;
import com.planningtool.egli.models.embedded.EmbeddedUniquable;
import com.planningtool.egli.models.embedded.Mutable;
import com.planningtool.egli.models.embedded.Uniquable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "TICKET")
public class Ticket implements Serializable, Mutable, Uniquable {
    public static final long serialVersionUID = 108L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_TICKET")
    private Integer id;

    @Column(name = "TITEL", nullable = false)
    private String titel;

    @Column(name = "BESCHRIEB", nullable = false)
    private String beschrieb;

    @Column(name = "TERMIN", nullable = false)
    private LocalDateTime termin;

    @Column(name = "PRIORITAET", nullable = false)
    private Integer prioritaet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATUS", nullable = false)
    @JsonBackReference
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROJEKT", nullable = false)
    @JsonBackReference
    private Projekt projekt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KUNDE", nullable = false)
    @JsonBackReference
    private Kunde kunde;

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
