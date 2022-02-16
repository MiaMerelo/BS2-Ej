package BS2;

import java.util.ArrayList;

public class CiudadServiceImp implements CiudadService{
    ArrayList<Ciudad> ciudades= new ArrayList<>();

    public ArrayList<Ciudad> getCiudades(){
        return ciudades;
    }

    public void addCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }
}
