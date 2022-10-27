@Service
public class Service implements IticketService{
    
    @Autowired
    private Repository repository;
    
    @Override
    public List<Iticket> listconciertos (){
    return(List<Iticket>)repository.findAll ();
    
    }
    
    @Override
    
    puplic concierto getConciertoById (long id) {
    return Conciertorepository.save (concierto);
    }
    
    @Override
    
    puplic void saveoncierto (Concierto concierto) {
    return Conciertorepository.save (concierto);
    }
    
    @Override
    
    puplic void detele (long id) {
    
    Conciertorepository.deteleById(id);
    }
    
    
    
}
