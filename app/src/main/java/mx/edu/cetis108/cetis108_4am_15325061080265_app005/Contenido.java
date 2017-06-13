package mx.edu.cetis108.cetis108_4am_15325061080265_app005;

import java.util.Date;

/**
 * Created by Stephany on 09/06/2017.
 */

 public class Contenido {
    String nombre;
    String tipo;
    String ruta;
    Date fecha;
    String texto;

  public Contenido(String nombre, String tipo, String ruta, Date fecha, String texto)
   {
       this.nombre = nombre;
       this.tipo = tipo;
       this.ruta = ruta;
       this.fecha = fecha;
       this.texto = texto;
   }
    public Contenido()
    {
        this.nombre = "";
        this.tipo = "";
        this.ruta = "";
        this.fecha = null;
        this.texto = "";
    }

}

