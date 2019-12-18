/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibereuro2012;

/**
 *
 * @author visita
 */
public class Game {
    private int id;
    private String fecha_partido;
    private String estadio;
    private String equipo_uno;
    private String equipo_dos;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fecha_partido
     */
    public String getFecha_partido() {
        return fecha_partido;
    }

    /**
     * @param fecha_partido the fecha_partido to set
     */
    public void setFecha_partido(String fecha_partido) {
        this.fecha_partido = fecha_partido;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    /**
     * @return the equipo_uno
     */
    public String getEquipo_uno() {
        return equipo_uno;
    }

    /**
     * @param equipo_uno the equipo_uno to set
     */
    public void setEquipo_uno(String equipo_uno) {
        this.equipo_uno = equipo_uno;
    }

    /**
     * @return the equipo_dos
     */
    public String getEquipo_dos() {
        return equipo_dos;
    }

    /**
     * @param equipo_dos the equipo_dos to set
     */
    public void setEquipo_dos(String equipo_dos) {
        this.equipo_dos = equipo_dos;
    }

    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", fecha_partido=" + fecha_partido + ", estadio=" + estadio + ", equipo_uno=" + equipo_uno + ", equipo_dos=" + equipo_dos + '}';
    }
    
    
    
    
}
