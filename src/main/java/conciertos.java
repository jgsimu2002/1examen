
import java.awt.SecondaryLoop;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table (name = "Itiecket")
public abstract class conciertos implements Serializable{

   @ID
   @GenaratedValue(stantegy = GenerationType.IDENTITY)
   private long id;
   private long Iticket;
   
   public long getId () {
   return id;
   }
    
   public long setId (long id) {
   this.id = id;
       return 0;
   }
   
   public long getIticket () {
   return Iticket;
   }
   
   public void setIticket (String Iticket) {
   this.Iticket = id;
   }
}
