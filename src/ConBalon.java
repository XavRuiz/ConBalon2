/**
 * Created by alumno on 27/06/2017.
 */
public class ConBalon {
    List <String> listaConBalon;
    String[] deportes= {"futbol","basketbol", "beisbol","futbol americano","softbol", "waterpolo", "voleibol"};
    public ConBalon(){
        listaConBalon= new ArrayList<String>();
        for(String deporte : deportes){
            listaConBalon.add(deporte);
        }
    }

    public List<String> getLista(){
        return listaConBalon;
    }

    public void agregarDeportesConBalon(String deporte){
        listaConBalon.add(deporte);
    }
}
