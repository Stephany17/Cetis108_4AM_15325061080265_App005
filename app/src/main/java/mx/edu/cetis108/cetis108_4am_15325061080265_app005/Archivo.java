package mx.edu.cetis108.cetis108_4am_15325061080265_app005;

import java.util.Date;

/**
 * Created by Stephany on 09/06/2017.
 */

public class Archivo {
    String usuario;
    String nombre;
    String tipo;
    String ruta;
    Date fechaCreacion;
    Date fechaModificacion;


   public Archivo(String usuario, String nombre, String tipo, String ruta, Date fechaCreacion, Date fechaModificacion) {
       this.usuario = usuario;
       this.nombre = nombre;
       this.tipo = tipo;
       this.ruta = ruta;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
   }



    public Archivo()
    {
        this.usuario = "";
        this.nombre = "";
        this.tipo = "";
        this.ruta = "";
        this.fechaModificacion = null ;
        this.fechaCreacion = null;

    }


}

