
package javabahia.exemplojava7ee.model;

import java.util.Objects;

/**
 *@author otaviojava  - otaviojava@java.net
 * 
 */
public class Perfil {
    
    
    private String perfil;
    
    private String frase;
    
    private Integer quantidade;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.perfil, other.perfil)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.perfil);
        return hash;
    }

    public Perfil() {
        initContador();
    }

    @Override
    public String toString() {
        return frase+" quantidade: "+quantidade;
    }

    
    public void initContador(){
    
    quantidade=new Integer(0);
    }
    public Perfil(String perfil, String frase) {
        this.perfil = perfil;
        this.frase = frase;
        initContador();
    }

    public void increment() {
        quantidade++;
    }
    
    
    
}
