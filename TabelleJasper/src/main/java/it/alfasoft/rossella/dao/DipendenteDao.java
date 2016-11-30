package it.alfasoft.rossella.dao;

import hibernateUtil.HibernateUtil;
import it.alfasoft.rossella.model.Dipendente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DipendenteDao {
	 // 1 create
	
		public boolean createFattura(Dipendente d) {
			boolean res = false;

			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				
				tx.begin();
				session.persist(d);
				tx.commit();
				
				res = true;
			} catch (Exception ex) {
				tx.rollback();
			} finally {
				session.close();
			}
			return res;

		}
		//2a read con id del DB
		
				public Dipendente readDipendenteConId(long id) {
					
					Session session = HibernateUtil.openSession();
					Transaction tx = null;
					Dipendente d = null;
					
					try {	
						tx = session.getTransaction();
						
						tx.begin();
						Query query = session.createQuery("from Dipendente where id=:idInserito");
						query.setLong("idInserito", id);
						d = (Dipendente) query.uniqueResult();
						tx.commit();
						
					} catch (Exception ex) {
						tx.rollback();
					} finally {
						session.close();			
					}		
					return d;
				}
				
				
				//2b read tutti
				@SuppressWarnings("unchecked")
				public List<Dipendente> readTuttiDipendenti(){
				
				List<Dipendente> lista = new ArrayList<Dipendente>();

				Session session = HibernateUtil.openSession();
				Transaction tx = null;
				
				try {	
					tx = session.getTransaction();
					tx.begin();
					
					Query query = session.createQuery("From Dipendente");
					
					lista= query.list();
						
					tx.commit();
					
				} catch (Exception ex) {
					tx.rollback();
				} finally {
					session.close();			
				}
				
				return lista;
				}
				
				
				//3 update
				
				public boolean updateDipendente(Dipendente d) {
					
					boolean res = false;
					
					Session session = HibernateUtil.openSession();
					
					Transaction tx = null;
					
					try {
						
						tx = session.getTransaction();
						
						tx.begin();
						
						session.update(d);
						
						tx.commit();
						
						res = true;
						
					} catch (Exception ex) {
						
						tx.rollback();
						
					} finally {
						
						session.close();
						
					}
					
					return res;
					
				}
				
				//4 delete
				
					public boolean deleteDipendente(Dipendente d) {

						boolean res = false;

						Session session = HibernateUtil.openSession();

						Transaction tx = null;

						try {

							tx = session.getTransaction();

							tx.begin();

							session.delete(d);

							tx.commit();

							res = true;

						} catch (Exception ex) {

							tx.rollback();

						} finally {

							session.close();

						}

						return res;

					}
					
					

	


}
