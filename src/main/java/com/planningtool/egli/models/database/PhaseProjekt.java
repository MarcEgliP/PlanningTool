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
@Table(name = "PHASE_PROJEKT")
public class PhaseProjekt implements Serializable, Mutable, Uniquable {
    private static final long serialVersionUID = 107L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PHASE_PROJEKT")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PHASE", nullable = false)
    @JsonBackReference
    private Phase phase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROJEKT", nullable = false)
    @JsonBackReference
    private Projekt projekt;

    @Column(name = "VON", nullable = false)
    private LocalDateTime von;

    @Column(name = "BIS", nullable = false)
    private LocalDateTime bis;

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
