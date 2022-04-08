package aberturadeconta;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class AberturaDeConta {
    
    public static void main(String[] args) {
        
        //acessar dados do sistema
        Date relogio = new Date();
           System.out.println("A hora do sistema é: ");
           System.out.println(relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println (idioma.getDisplayLanguage()); // imprime “Português”
        
        Toolkit dimensao = Toolkit.getDefaultToolkit();
        Dimension d = dimensao.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);
           
           
        Conta p1 = new Conta();
        p1.setDono("Jubileu");
        p1.setNumConta(1519);
        p1.abrirConta("CC");
              
               
        Conta p2 = new Conta ();
        p2.setDono("Creusa");
        p2.setNumConta(1234);
        p2.abrirConta("CP");
       
        p1.depositar(300);
        p2.depositar(500);
        
        p2.sacar(100);
        p1.sacar(1000);
                
        
        p1.statusConta();
        p2.statusConta();
        
    
    }
    
}
