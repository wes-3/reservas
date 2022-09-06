package br.tcc.reservas.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "computador")
public class Computador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idcomputador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComputador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "laboratorio")
    private Laboratorio laboratorio;

    @Column(name = "posicao")
    private String posicao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computador that = (Computador) o;
        return Objects.equals(idComputador, that.idComputador) && Objects.equals(laboratorio, that.laboratorio) && Objects.equals(posicao, that.posicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComputador);
    }

    public Long getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Long idComputador) {
        this.idComputador = idComputador;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
