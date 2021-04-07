import java.io.PrintWriter;
import java.io.File;


public class guardarContacto{
  
  public static boolean guardar(Contactos contacto , int i) {

    File file = new File(i+ ") " + "Contacto.json");

    

  	try{

      file.createNewFile();


  		PrintWriter archivo = new PrintWriter(file.getAbsolutePath());
      archivo.println("{");
      archivo.println("\"id\":" + i );
      archivo.println("\"Prefijo\"" + ":" + "\"" + contacto.getPrefijo() + "\",");
      archivo.println("\"Nombre\"" + ":" + "\"" + contacto.getNombre() + "\",");
      archivo.println("\"SegundoNombre\"" + ":" + "\"" + contacto.getSegundoNombre() + "\",");
      archivo.println("\"Apellido\"" + ":" + "\"" + contacto.getApellido() + "\",");
      archivo.println("\"Sufijo\"" + ":" + "\"" + contacto.getSubfijo() + "\",");
      archivo.println("\"FoneticaNombre\"" + ":" + "\"" + contacto.getNombreFonetico() + "\",");
      archivo.println("\"FoneticaSegundoNombre\"" + ":" + "\"" + contacto.getSegundoNombreFonetico() + "\",");
      archivo.println("\"FoneticaApellido\"" + ":" + "\"" + contacto.getApellidoFonetico() + "\",");
      archivo.println("\"Apodo\"" + ":" + "\"" + contacto.getApodo() + "\",");
      archivo.println("\"Departamento\"" + ":" + "\"" + contacto.getDepartamento() + "\",");
      archivo.println("\"Correo\"" + ":" + "\"" + contacto.getCorreo() + "\",");
      archivo.println("\"Telefono\"" + ":" + "\"" + contacto.getTelefono() + "\",");
      archivo.println("\"Pais\"" + ":" + "\"" + contacto.getPais() + "\",");
      archivo.println("\"Direccion\"" + ":" + "\"" + contacto.getDireccion() + "\",");
      archivo.println("\"SegundaDireccion\"" + ":" + "\"" + contacto.getSegundaDireccion() + "\",");
      archivo.println("\"CodigoPostal\"" + ":" + " \"" + contacto.getCodigoPostal() + "\",");
      archivo.println("\"Ciudad\"" + ":" + "\"" + contacto.getCiudad() + "\",");
      archivo.println("\"Provincia\"" + ":" + "\"" + contacto.getProvincia() + "\",");
      archivo.println("\"ApartadoPostal\"" + ":" + "\"" + contacto.getApartadoPostal() + "\",");
      archivo.println("\"Etiqueta\"" + ":" + "\"" + contacto.getEtiqueta() + " \",");
      
      archivo.println("}");
      archivo.close();
    }catch(Exception e){
    	System.out.println("ERROR");
    }

    return true;
  }

  }
  
