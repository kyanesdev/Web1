import java.util.Scanner;

public class App{
  

public static void main(String[] args) {  
  
  
  String opcion = "";
  

  
  
  do{

    System.out.println("");
    System.out.println ("a)Randomizar contactos");
    System.out.println("");
    System.out.println ("b)Poner datos de un contacto");
    System.out.println("");
    System.out.println ("c)Salir");
    System.out.println("");
    if(opcion!="c"){
      
    
    Scanner seleccion = new Scanner (System.in);


    opcion = seleccion.nextLine();
    
    /*if(seleccion.hasNextLine()){

     

    }
    */

  switch(opcion){
    
  
    case "a":
    System.out.println("");
    System.out.println ("Elegir el numero de contactos");
    Scanner s = new Scanner(System.in);
    int x;


    x = s.nextInt();
    s.nextLine();
    Contactos contacto[] = new Contactos[x];



    for(int i = 0 ; i<contacto.length ; i++){
      
      contacto[i] = ContactosRandom.generarContacto();

      System.out.println("");
      System.out.println ("El apellido es: \"" + contacto[i].getApellido() +"\"");
      System.out.println("");

      System.out.println("");
      System.out.println ("El telefono es: \"" + contacto[i].getTelefono() +"\"");
      System.out.println("");

      System.out.println("");
      System.out.println ("El correo es: \"" + contacto[i].getCorreo() +"\"");
      System.out.println("");

      System.out.println("");
      System.out.println ("El trabajo es: \"" + contacto[i].getTrabajo() +"\"");
      System.out.println("");


      guardarContacto.guardar(contacto[i] , i);
      

      
    
      
    }

    System.out.println("");
    ConsultarContactos.mostrarEnPantalla(contacto);
    System.out.println("");

    break;

    

    case "b":
    System.out.println("");
    System.out.println("Usted va a rellenar los datos de 1 contacto:");
    System.out.println("");
    System.out.println("Introduzca nombre:");
         
  
    Scanner entradaEscaner = new Scanner (System.in); //Creacion de un objeto Scanner
  
    Contactos c1 = new Contactos();
  
    c1.SetNombre(entradaEscaner.nextLine()); //Invocamos un metodo sobre un objeto Scanner
         
    System.out.println("");
    System.out.println ("El nombre es: \"" + c1.getNombre() +"\"");
    System.out.println("");
    
  
    System.out.println ("Introduzca apellido:");
  
  
    c1.SetApellido(entradaEscaner.nextLine());
         
    System.out.println("");
    System.out.println ("El apellido es: \"" + c1.getApellido() +"\"");
    System.out.println("");
    
    System.out.println ("Introduzca el correo:");
  
  
    c1.SetCorreo(entradaEscaner.nextLine());
    
    System.out.println("");
    System.out.println ("El correo es: \"" + c1.getCorreo() +"\"");
    System.out.println("");
    
    
    String respuesta = "";
    
    
    System.out.println("Desea introducir el resto de datos?");
    System.out.println("(No recomendado, vas a tardar mucho): s/n/salir");
    
    
    do{
      Scanner h = new Scanner(System.in);
      respuesta = h.nextLine();
    
    
    switch(respuesta){
      
      case "s":
      System.out.println("");
      
      
      System.out.println("ingrese el prefijo del contacto:");
            c1.SetPrefijo(entradaEscaner.nextLine());
            System.out.println("ingrese el segundo Nombre del contacto:");
            c1.SetSegundoNombre(entradaEscaner.nextLine());
            System.out.println("ingrese el sufijo del contacto:");
            c1.SetSubfijo(entradaEscaner.nextLine());
            System.out.println("ingrese el fonetica Nombre del contacto:");
            c1.SetNombreFonetico(entradaEscaner.nextLine());
            System.out.println("ingrese el fonetica Segundo Nombre del contacto:");
            c1.SetSegundoNombreFonetico(entradaEscaner.nextLine());
            System.out.println("ingrese el fonetica Apellido del contacto:");
            c1.SetApellidoFonetico(entradaEscaner.nextLine());
            System.out.println("ingrese el apodo del contacto:");
            c1.SetApodo(entradaEscaner.nextLine());
            System.out.println("ingrese el departamento del contacto:");
            c1.SetDepartamento(entradaEscaner.nextLine());
            System.out.println("ingrese el pais del contacto:");
            c1.SetPais(entradaEscaner.nextLine());
            System.out.println("ingrese el direccion del contacto:");
            System.out.println("ingrese el linea Direccion 2 del contacto:");
            c1.SetDireccion(entradaEscaner.nextLine());
            c1.SetSegundaDireccion(entradaEscaner.nextLine());
            System.out.println("ingrese el codigo Postal del contacto:");
            c1.SetCodigoPostal(entradaEscaner.nextLine());
            System.out.println("ingrese el ciudad del contacto:");
            c1.SetCiudad(entradaEscaner.nextLine());
            System.out.println("ingrese el provincia del contacto:");
            c1.SetProvincia(entradaEscaner.nextLine());
            System.out.println("ingrese el apartado Postal del contacto:");
            c1.SetApartadoPostal(entradaEscaner.nextLine());
            System.out.println("ingrese el etiqueta del contacto:");
            c1.SetEtiqueta(entradaEscaner.nextLine());
      
            System.out.println("Para salir escriba \"salir\"");
            System.out.println("");
      
      guardarContacto.guardar(c1 , 1);
      
  

      break;
      
      
      case "n":
      
      System.out.println("");
      System.out.println("Que tenga buen dia :D");
      System.out.println("");
      
      System.out.println("Para salir escriba \"salir\"");
      System.out.println("");
      
      guardarContacto.guardar(c1 , 1);
      
      break;
      
      default:
      
      System.out.println("");
      System.out.println("Opcion incorrecta");
      System.out.println("");
      
      break;
      
      }
      
    }while(!respuesta.equals("salir"));
    
   
    
    break;

    default:
    System.out.println ("Nos vemos");
    break;

    
  }

  seleccion.close();
  return;

  }
  
  }while(opcion!="c");
  
  
  
  }

 
 
 
}