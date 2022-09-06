package br.tcc.reservas.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "laboratorio")
public class Laboratorio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idlaboratorio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLaboratorio;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratorio")
    private Set<Computador> computadorLista = new HashSet<>();

    @Column(name = "local")
    private String local;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laboratorio that = (Laboratorio) o;
        return Objects.equals(idLaboratorio, that.idLaboratorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLaboratorio);
    }

    public Long getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public Set<Computador> getComputadorLista() {
        return computadorLista;
    }

    public void setComputadorLista(Set<Computador> computadorLista) {
        this.computadorLista = computadorLista;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
