
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table (name = "capacidad")
public class capacidad implements Serializable{
    
    @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
    
    private String capacidad;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
