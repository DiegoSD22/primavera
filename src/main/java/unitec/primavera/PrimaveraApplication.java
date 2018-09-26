package unitec.primavera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{
    
    int x;

	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        x=2;
        System.out.println("Hola mundo");
        TarjetaCredito tc=new TarjetaCredito("diego", 1234);
                
                TarjetaDebito td=new TarjetaDebito("asencio", 3124);
                
                TarjetaNomina tn=new TarjetaNomina("gerardo", 4535);
                
                ArrayList<Tarjetas> tarjetas=new ArrayList<>();
                tarjetas.add(tc);
                tarjetas.add(td);
                tarjetas.add(tn);
                
                for(Tarjetas t: tarjetas){
                    t.pagar();
                }
    }
}
