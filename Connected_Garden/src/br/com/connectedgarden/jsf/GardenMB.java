package br.com.connectedgarden.jsf;

import java.sql.SQLException;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.connectedgarden.dao.GardenDao;
import br.com.connectedgarden.entity.Garden;

@ManagedBean
@SessionScoped
public class GardenMB extends SuperMB{

	public static final String GARDEN = "/garden.jsf";
	public static final String REGISTER_GARDEN = "/registerGarden.jsf";
	
	private Garden garden;
	private GardenDao dao;
	private Garden newGarden;
	
	public GardenMB(){
		reset();
	}
	
	public void reset(){
		garden = new Garden();
		dao = new GardenDao();
	}
	
	public String iniciar() throws SQLException{
		garden = dao.findGardenByUser(getUser().getId(), 0);
		
		return GARDEN;
	}
	
	public String registerGarden(){
		newGarden = new Garden();
		
		return REGISTER_GARDEN;
	}

	public String storesGarden() throws SQLException{
		newGarden.setIdUser(getUser().getId());
		newGarden.setIpServer("");
		newGarden.setIpServer("");
		newGarden.setLastUpdate(new Date());
		newGarden.setActive(true);		
		
		dao.storesGarden(newGarden);
		
		reset();
		iniciar();
		return GARDEN;
	}
	
	public Garden getGarden() {
		return garden;
	}

	public void setGarden(Garden garden) {
		this.garden = garden;
	}

	public GardenDao getDao() {
		return dao;
	}

	public void setDao(GardenDao dao) {
		this.dao = dao;
	}

	public Garden getNewGarden() {
		return newGarden;
	}

	public void setNewGarden(Garden newGarden) {
		this.newGarden = newGarden;
	}
}
