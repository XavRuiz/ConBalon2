/**
 * Created by alumno on 27/06/2017.
 */
public class ConBalon {
    //List <String> listaConBalon;

    String listaDeportes;

    public ConBalon(){
        listaDeportes= "futbol,basketbol,beisbol,futbol americano,softbol,waterpolo,voleibol";
    }

    public String getLista(){
        return listaDeportes;
    }

    public void agregarDeportesConBalon(String deporte){
        listaDeportes+=","+deporte;
    }
}
