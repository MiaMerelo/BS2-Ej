package BS2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@RestController
public class Controlador2 {
    @Autowired @Qualifier("PersonaServiceImp") PersonaService p;
    @GetMapping("/controlador2/getPersona")
    Persona getPersona(){
        return new Persona(p.getNombre(), p.getPoblacion(), p.getEdad()*2);
    }

    @Autowired CiudadService ciudades;
    @GetMapping("/controlador2/getCiudad")
    public ArrayList<Ciudad> getCiudad(){
        return ciudades.getCiudades();
    }
}
