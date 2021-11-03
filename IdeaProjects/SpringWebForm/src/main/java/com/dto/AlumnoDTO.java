package com.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AlumnoDTO {
    private int idAlumno;
    private String apePaterno;
    private String apeMaterno;
    private String nombres;

    // en el formulario donde se use esta fecha
    // se tiene que usar este formato definido dd/MM/yyyy
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    //private Date fecNac;

    // si utilizamos el input type="date" de html5 debemos usar en la anotación
    // el siguiente formato para que spring no genere un error "yyyy-MM-dd"
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecNac;

    private String email;
    private String genero;
    private String nivel;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
