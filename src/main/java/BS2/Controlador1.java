package BS2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Controlador1 {
    @Autowired @Qualifier ("PersonaServiceImp") PersonaService ps;
    @GetMapping("/controlador1/addPersona")
    public Object addPersona(@RequestHeader String nombre, @RequestHeader String poblacion, @RequestHeader int edad){
        ps.setNombre(nombre);
        ps.setPoblacion(poblacion);
        ps.setEdad(edad);

        return new Persona(nombre, poblacion, edad);
    }

    @Autowired CiudadService ciudades;
    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestBody Ciudad newCiudad){
        ciudades.addCiudad(newCiudad);
    }

    @Autowired @Qualifier("bean1") PersonaService ps1;
    @Autowired @Qualifier("bean2") PersonaService ps2;
    @Autowired @Qualifier("bean3") PersonaService ps3;
    @GetMapping("/controlador/bean/{bean}")
    public Object getPersona(@PathVariable String bean) {

        switch (bean){
            case "bean1": return new Persona(ps1.getNombre(), ps1.getPoblacion(), ps1.getEdad());
            case "bean2": return new Persona(ps2.getNombre(), ps2.getPoblacion(), ps2.getEdad());
            case "bean3": return new Persona(ps3.getNombre(), ps3.getPoblacion(), ps3.getEdad());
            default: return "Error 123157573";
        }
    }
}