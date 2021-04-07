import java.util.Random;


public class ContactosRandom {
    
    public static Contactos generarContacto(){

        Contactos test = new Contactos(); 
        Random r = new Random();

        
        test.SetNombre(GenerarInfo.generarNombre(r.nextInt(3)+1));
        test.SetApellido(GenerarInfo.generarApellido(r.nextInt(3)+1));
        test.SetCorreo(GenerarInfo.generarCorreo(r.nextInt(3)+1));
        test.SetTelefono(GenerarInfo.generarTelefono(r.nextInt(3)+1));
        test.SetTrabajo(GenerarInfo.generarTrabajo(r.nextInt(3)+1));
        return test;



    }   


    
}
