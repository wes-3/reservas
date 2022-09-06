package br.tcc.reservas.entities;

import br.tcc.reservas.enumerators.ModalidadeCursoEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idcurso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "nomecurso")
    private String nomeCurso;

    @Column(name = "modalidade")
    @Enumerated(EnumType.STRING)
    private ModalidadeCursoEnum modalidade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(idCurso, curso.idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public ModalidadeCursoEnum getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeCursoEnum modalidade) {
        this.modalidade = modalidade;
    }
}