
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    
    @Autowired
    private IticketService conciertoService;
    
    @Autowired
    
    private IticketService ConciertoService;
    
    
    @GetMapping ("/Concierto")
    
    public String index (Model model) {
    List<Concierto> listaconcierto =conciertoService.getAllConcierto();
    model.addAtribute("titulo" , "TablaConcierto");
    model.addAtribute("Concierto" , ListaConcierto);
    return concierto;
    }
    
     @GetMapping ("/ConciertoN")
    
    public String crearConcierto (Model model) {
    List<Concierto> listaconcierto =conciertoService.getAllConcierto();
    model.addAtribute("titulo" , new Concierto());
    model.addAtribute("Concierto" , ListaConcierto);
    return concierto;
    }
    
       @PostMapping ("/save")
    
    public String GuardarConcierto(@ModelAtribute Concierto concierto) {
    conciertoService.saveConcierto(concierto);
    return "redirect:/concierto";
    }
    
    
     @GetMapping ("/ConciertoN")
    
    public String editarConcierto(@PathVariable("id") long idConcierto, Model model) {
    Concierto concierto = conciertoService.getConciertobyId(idConcierto);
    List<Concierto> listaConcierto = conciertoService.listConcierto();
    model.addAtribute("titulo" , new Concierto());
    model.addAtribute("Concierto" , ListaConcierto);
    }
    
    
     @GetMapping ("/detele/{id}")
    
    public String eliminarConcierto (@PathVariable("id") long idConcierto) {
    ConciertoService.detele(idConcierto);
    return "redirect:/concierto";
    }
    
    
}
