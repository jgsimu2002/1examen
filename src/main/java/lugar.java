
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table (name = "lugar")
public class lugar implements Serializable{
    
    @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
    
    private String lugar;

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
}
