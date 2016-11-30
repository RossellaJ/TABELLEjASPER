import java.util.Date;

import it.alfasoft.rossella.dao.BustaPagaDao;
import it.alfasoft.rossella.dao.DipendenteDao;
import it.alfasoft.rossella.dao.FatturaDao;
import it.alfasoft.rossella.model.BustaPaga;
import it.alfasoft.rossella.model.Dipendente;
import it.alfasoft.rossella.model.Fattura;


public class Test {

	public static void main(String[] args) {
		DipendenteDao dDao = new DipendenteDao();
		FatturaDao fDao = new FatturaDao();
		BustaPagaDao bDao = new BustaPagaDao();
		
		
		Date d = new Date();
		
		Dipendente d1 = new Dipendente("Nello","lll",45,d);
		Dipendente d2 = new Dipendente("Luigi","fff",14,d);
		Dipendente d3 = new Dipendente("Alfonsa","ggg",74,d);
		Dipendente d4 = new Dipendente("Antonella","eee",23,d);
		
		BustaPaga b1 = new BustaPaga("Piero","25/11/2014",2500);
		BustaPaga b2 = new BustaPaga("Laura","07/05/2015",900);
		BustaPaga b3 = new BustaPaga("Katie","02/09/201",1700);
		
		Fattura f1= new Fattura(d,740,"cod101");
		Fattura f2= new Fattura(d,250,"cod102");
		
		
		dDao.createFattura(d1);
		dDao.createFattura(d2);
		dDao.createFattura(d3);
		dDao.createFattura(d4);
		
		bDao.createBusta(b1);
		bDao.createBusta(b2);
		bDao.createBusta(b3);
		
		fDao.createFattura(f1);
		fDao.createFattura(f2);
		
		
	}

}
