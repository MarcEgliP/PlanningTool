package com.planningtool.egli.models.database;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "PROJEKT")
public class Projekt implements Serializable, Mutable, Uniquable {
    public static final long serialVersionUID = 106L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROJEKT")
    private Integer id;

    @Column(name = "TITEL", nullable = false)
    private String titel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KUNDE", nullable = false)
    @JsonManagedReference
    private Kunde kunde;

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
