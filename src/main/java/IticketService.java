



public interface IticketService {
    
    public List <Iticket> getAllConcierto ();
    public Concierto getConciertobyId (long id);
    public void saveConcierto (Concierto concierto);
    public void detele (long id);
    
}
