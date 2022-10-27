
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table (name = "fecha de evento")
public class fecha implements Serializable{
    
    @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
    
    
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
