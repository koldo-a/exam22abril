package com.ipartek.formacion.exam22abril.entidades;

public class MensajeUsuario {
    public static final String ERROR = "error";
    public static final String INFORMATIVO = "informativo";
    public static final String ALERTA = "alerta";

    private String mensaje;
    private String tipo;

    public MensajeUsuario(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
