
package javabahia.exemplojava7ee.bean.model;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javabahia.exemplojava7ee.model.Perfil;

/**
 *@author otaviojava  - otaviojava@java.net
 * 
 */
@ManagedBean(name="perfil")
@ApplicationScoped
public class PerfilBean {
    
   private List<Perfil> frases;
  

    
    public PerfilBean() {
        frases= new ArrayList<>();//contrutor diamante
        frases.add(new Perfil("coin","O projeto coin JSR 334"));
        frases.add(new Perfil("nio2","O Nio2  JSR 203"));
        frases.add(new Perfil("concorrencia","O pacote de concorrência JSR 166"));
        frases.add(new Perfil("vinci"," O projeto Da Vinci Machine JSR 292"));
        frases.add(new Perfil(""," Não gostou"));
        
    }

    public List<Perfil> getFrases() {
        return frases;
    }
    
    
    public void contarUsuarios(String perfil){
    switch(perfil){//switch com String
        case "coin":
            frases.get(0).increment();
            break;
        case "nio2":
            frases.get(1).increment();
            break;
        case "concorrencia":
            frases.get(2).increment();
            break;
        case "vinci":
            frases.get(3).increment();
            break;
           
            default:
                   frases.get(4).increment();
                
    }
    
    }
    
   

    
}
