package br.tcc.reservas.enumerators;

public enum ModalidadeCursoEnum {

    PRESENCIAL("Presencial"), EAD("EAD"), HIBRIDO("Híbrido");

    private final String label;

    ModalidadeCursoEnum(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
