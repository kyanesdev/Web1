public class Contactos{
  
  //Visualmente sin clickear en "mostrar mas"
  private String nombre;
  private String apellido;
  private String telefono;
  private String correo;
  private String trabajo;
  
  
  //Esto seran los metodos
  //Nombre
  public void SetNombre(String var){
    
    if(var == null){
      
      return;
      
    }
    
    if(var.trim().length() == 0){
      
      return;
      
    }
  
    
    var = var.trim();
    
    nombre = var;
  
}
  
public String getNombre(){
  
  if(nombre == null){
    
    return "No tiene nombre el contacto";
    
  }
  
  if(nombre.trim().length() == 0){
    
    return "No tiene nombre el contacto";
    
  }
    
     return nombre;

  }
  
  
  public String toString(){
    
    return nombre;
    
  }
  
  //Apellido
  public void SetApellido(String var){
    
    if(var == null){
      
      return;
      
    }
    
    if(var.trim().length() == 0){
      
      return;
      
    }
    
    var = var.trim();
    
    apellido = var;
    
  }
  
  public String getApellido(){
      
    if(apellido == null){
      
      return "No tiene apellido el contacto";
      
    }
    
    if(apellido.trim().length() == 0){
      
      return "No tiene apellido el contacto";
      
    }
       return apellido;

    }
    
  //Telefono
  public void SetTelefono(String var){
    
    if(var == null){
      
      return;
      
    }
    
    if(var.trim().length() == 0){
      
      return;
      
    }
    
    var = var.trim();
    
    telefono = var;
    
  }
  
  public String getTelefono(){
      
       return telefono;

    }
  
  //Correo
  public void SetCorreo(String var){
    
    if(var == null){
      
      return;
      
    }
    
    if(var.trim().length() == 0){
      
      return;
      
    }
    
    var = var.trim();
    
    correo = var;
    
  }
  
  public String getCorreo(){
      
       return correo;

    }
  
  //Trabajo  
  public void SetTrabajo(String var){
    
    if(var == null){
      
      return;
      
    }
    
    if(var.trim().length() == 0){
      
      return;
      
    }
    
    var = var.trim();
    
    trabajo = var;
    
  }
  
  public String getTrabajo(){
      
       return trabajo;

    }
  
  
  //Cuando mostras mas
  
  private String prefijo;
  private String segundoNombre;
  private String subfijo;
  private String nombreFonetico;
  private String segundoNombreFonetico;
  private String apellidoFonetico;
  private String apodo;
  private String archivarComo;
  private String departamento;
  private String pais;
  private String direccion;
  private String segundaDireccion;
  private String codigoPostal;
  private String ciudad;
  private String provincia;
  private String apartadoPostal;
  private String etiqueta;
  private String fechaNacimiento;
  private String evento;
  private String website;
  private String relaciones;
  private String chat;
  private String llamadaInternet;
  private String campoPersonalizado;
  private String notas;
  
  
  //Prefijo
  public void SetPrefijo(String var){
    
    
    var = var.trim();
    
    prefijo = var;
    
  }
  public String getPrefijo(){
      
       return prefijo;

    }
  
  
  //SegundoNombre
  public void SetSegundoNombre(String var){
    
    var = var.trim();
    
    segundoNombre = var;
    
  }
  public String getSegundoNombre(){
      
       return segundoNombre;

    }
  
  
  //Subfijo
  public void SetSubfijo(String var){
    
    var = var.trim();
    
    subfijo = var;
    
  }
  
  public String getSubfijo(){
      
       return subfijo;

    }
  
  //NombreFonetico
  public void SetNombreFonetico(String var){
    
    
    var = var.trim();
    
    nombreFonetico = var;
    
  }
  
  public String getNombreFonetico(){
      
       return nombreFonetico;

    }
  
  //SegundoNombreFonetico
  public void SetSegundoNombreFonetico(String var){
  
    
    var = var.trim();
    
    segundoNombreFonetico = var;
    
  }
  
  public String getSegundoNombreFonetico(){
      
       return segundoNombreFonetico;

    }
  
  //ApellidoFonetico
  public void SetApellidoFonetico(String var){
    
    
    var = var.trim();
    
    apellidoFonetico = var;
    
  }
  
  public String getApellidoFonetico(){
      
       return apellidoFonetico;

    }
  
  //Apodo
  public void SetApodo(String var){
    
    
    var = var.trim();
    
    apodo = var;
    
  }
  
  public String getApodo(){
      
       return apodo;

    }
  
  //ArchivarComo
  public void SetArchivarComo(String var){
    
    
    var = var.trim();
    
    archivarComo = var;
    
  }
  
  public String getArchivarComo(){
      
       return archivarComo;

    }
  
  //Departamento
  public void SetDepartamento(String var){
    
    var = var.trim();
    
    departamento = var;
    
  }
  
  public String getDepartamento(){
      
       return departamento;

    }
  
  
  //Pais
  public void SetPais(String var){
    
    var = var.trim();
    
    pais = var;
    
  }
  
  public String getPais(){
      
       return pais;

    }
  
  //Direccion
  public void SetDireccion(String var){
    
    
    var = var.trim();
    
    direccion = var;
    
  }
  
  public String getDireccion(){
      
       return direccion;

    }
  
  //SegundaDireccion
  public void SetSegundaDireccion(String var){
    
    
    var = var.trim();
    
    segundaDireccion = var;
    
  }
  
  
  public String getSegundaDireccion(){
      
       return segundaDireccion;

    }
  
  //CodigoPostal
  public void SetCodigoPostal(String var){
    
    
    var = var.trim();
    
    codigoPostal = var;
    
  }
  
  public String getCodigoPostal(){
      
       return codigoPostal;

    }
  
  //Ciudad
  public void SetCiudad(String var){
    
    
    var = var.trim();
    
    ciudad = var;
    
  }
  
  public String getCiudad(){
      
       return ciudad;

    }
  
  
  //Provincia
  public void SetProvincia(String var){
    
    
    var = var.trim();
    
    provincia = var;
    
  }
  
  public String getProvincia(){
      
       return provincia;

    }
  
  //ApartadoPostal
  public void SetApartadoPostal(String var){
    
    
    var = var.trim();
    
    apartadoPostal = var;
    
  }
  
  public String getApartadoPostal(){
      
       return apartadoPostal;

    }
  
  //Etiqueta
  public void SetEtiqueta(String var){
    
    
    var = var.trim();
    
    etiqueta = var;
    
  }
  
  public String getEtiqueta(){
      
       return etiqueta;

    }
  
  
  //FechaNacimiento
  public void SetFechaNacimiento(String var){
    
    
    var = var.trim();
    
    fechaNacimiento = var;
    
  }
  
  public String getFechaNacimiento(){
      
       return fechaNacimiento;

    }
  
  //Evento
  public void SetEvento(String var){
    
    
    var = var.trim();
    
    evento = var;
    
  }
  
  public String getEvento(){
      
       return evento;

    }
  
  //Website
  public void SetWebsite(String var){
    
    
    var = var.trim();
    
    website = var;
    
  }
  
  public String getWebsite(){
      
       return website;

    }
  
  
  //Relaciones
  public void SetRelaciones(String var){
    
    
    var = var.trim();
    
    relaciones = var;
    
  }
  
  public String getRelaciones(){
      
       return relaciones;

    }
  
  //Chat
  public void SetChat(String var){
    
    
    var = var.trim();
    
    chat = var;
    
  }
  
  public String getChat(){
      
       return chat;

    }
  
  
  //LlamadaInternet
  public void SetLlamadaInternet(String var){
    
    
    var = var.trim();
    
    llamadaInternet = var;
    
  }
  
  
  public String getLlamadaInternet(){
      
       return llamadaInternet;

    }
  
  //CampoPersonalizado
  public void SetCampoPersonalizado(String var){
    
    
    var = var.trim();
    
    campoPersonalizado = var;
    
  }
  
  
  public String getCampoPersonalizado(){
      
       return campoPersonalizado;

    }
  
  //Notas
  public void SetNotas(String var){
    
    
    var = var.trim();
    
    notas = var;
    
  }
  
  
  public String getNotas(){
      
       return notas;

    }
  
  
  
  
  
  
  
  
}