package com.planningtool.egli.models.database;

import com.planningtool.egli.models.embedded.Mutable;
import com.planningtool.egli.models.embedded.Sortable;
import com.planningtool.egli.models.embedded.Uniquable;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "PLANUNG")
public class Planung implements Serializable, Mutable, Sortable, Uniquable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PLANUNG")
    private Integer id;

    @OneToMany(mappedBy="planung", fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MITARBEITER", nullable = false)
    private Set<Mitarbeiter> mitarbeiter;

    @Override
    public Date getMutiertam() {
        return null;
    }

    @Override
    public void setMutiertam(Date mutiertam) {}

    @Override
    public String getMutiertvon() {
        return null;
    }

    @Override
    public void setMutiertvon(String mutiertvon) {

    }

    @Override
    public Integer getSortierung() {
        return null;
    }

    @Override
    public void setSortierung(Integer sortierung) {

    }

    @Override
    public Long getIdUnique() {
        return null;
    }

    @Override
    public void setIdUnique(Long idUnique) {

    }
}
