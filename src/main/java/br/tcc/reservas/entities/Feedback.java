package br.tcc.reservas.entities;

import br.tcc.reservas.entities.Reserva;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idfeedback")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFeedback;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reserva")
    private Reserva reserva;

    @Column(name = "notacomputador")
    private Integer notaComputador;

    @Column(name = "notalaboratorio")
    private Integer notaLaboratorio;

    @Column(name = "comentario", columnDefinition = "text")
    private String comentario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(idFeedback, feedback.idFeedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFeedback);
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Integer getNotaComputador() {
        return notaComputador;
    }

    public void setNotaComputador(Integer notaComputador) {
        this.notaComputador = notaComputador;
    }

    public Integer getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(Integer notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}