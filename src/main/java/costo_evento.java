
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table (name = "costo de evento")
public class costo_evento implements Serializable{
    
    @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
    
    private String costo;

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
    
}
