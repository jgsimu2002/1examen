
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;




@Entity
@Table (name = "cantante")
public class cantante implements Serializable{
    
    @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
    
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
