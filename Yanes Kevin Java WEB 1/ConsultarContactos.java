public class ConsultarContactos {


    public static void mostrarEnPantalla(Contactos[] contacto){

        System.out.println("Los contactos se veran por su nombre: ");


        for(int i=0; i < contacto.length; i++){


         System.out.println("Contacto " + i + ")"+ contacto[i]);

            
        
        }
    }
    

}
