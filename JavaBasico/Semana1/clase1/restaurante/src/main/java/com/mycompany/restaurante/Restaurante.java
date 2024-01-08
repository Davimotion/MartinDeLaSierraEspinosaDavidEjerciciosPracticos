

package com.mycompany.restaurante;

import com.mycompany.restaurante.logica.Controladora;
import com.mycompany.restaurante.logica.Platillo;
import java.util.List;


public class Restaurante {

    public static void main(String[] args) {
        
        Controladora control= new Controladora();
        
       // proceso de altas
//        Platillo plat1= new Platillo(1, "spaghettis con atun", "tomate, atun, spaghettis y queso", 8.99);
//        Platillo plat2= new Platillo(2, "paella", "tomate, conejo, arroz", 14.99);
//        Platillo plat3= new Platillo(3, "hamburguesa", "tomate, carne picada, pan y queso", 9.99);
//        
//        control.crearPlatillo(plat2);
//        control.crearPlatillo(plat3);
        
        //proceso de lectura
        List<Platillo> listaPlatillos = control.traerPlatillos(); //ANTES DE BORRADO
        for (Platillo plat:listaPlatillos){
            System.out.println(plat.toString());
        }
        System.out.println("");
        
        
//        //proceso de eliminacion
//        int idEliminar = 3;
//        control.eliminarPlatillo(idEliminar);
        
       
            
      
        //proceso de edicion
        int idEditar = 5;
        Platillo platEdit= control.buscarPlatillo(idEditar);
        platEdit.setPrecio(30.00);
        
        control.editarPlatillo(platEdit);
        
        
        
        System.out.println("DESPUES DE editar");
        listaPlatillos= control.traerPlatillos();
        for (Platillo plat:listaPlatillos){
            System.out.println(plat.toString());
        }
    }   
}
