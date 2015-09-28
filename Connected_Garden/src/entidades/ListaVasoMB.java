package entidades;

import entidades.Vaso;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import br.com.gardenWebservice.entity.Vaso;
//import br.com.gardenWebservice.repository.VasoRepository;

@ManagedBean
@SessionScoped
public class ListaVasoMB {

	
	public List<Vaso> listarVasos(){	
		return new ListaVasoDao().buscaVasos();
		//return (List<Vaso>)new VasoRepository().buscaVasos(0, 0);
	}
	
	public String teste(){
		return "EQUIPE: Monica Pereira(Coordenadora), Alysson Lima, Raul Silva, Wanderson Medeiros";
	}
}
