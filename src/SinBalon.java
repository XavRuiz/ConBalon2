
/**
 * Created by alumno on 27/06/2017.
 */
public class SinBalon {

    //List <String> listSinBalon;
    String ListaDep = "Boxeo,Natacion,Karate,Tiro al arco";

    public SinBalon() {

        //listSinBalon = new ArrayList<String>();
        //for (String depo : ListaDep) {  }
    }

    public String[] getListSinBalon(){
        return ListaDep;

    }

    public void agregarDeportesSinBalon (String dep) {

        ListaDep += "," +dep;

    }
}
