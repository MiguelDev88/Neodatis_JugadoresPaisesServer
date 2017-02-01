package jugadorespaisesmiguel;
import funciones.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;


// @author Miguel

public class JugadoresPaisesMiguel {

    
    public static void main(String[] args) {
        
        BufferedReader leer= new BufferedReader (new InputStreamReader (System.in));
        byte op=0;
        
        ODBServer server = ODBFactory.openServer(8000);
        server.addBase("base", "C:\\Users\\a15carlosmpf\\Desktop\\JugadoresPaisesMiguel2\\jugadores.db");
        server.startServer(true);
        
        do{
            try{
                op=Menu.menuPrincipal(leer);
                switch(op){
                    case 1:
                        Consultas.consultas();
                        break;
                    case 2:
                        System.out.println("\n - FIN DEL PROGRAMA - \n");
                        System.exit(0);
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }while(op!=0);
  
    }
    
}
