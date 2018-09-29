package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Candidatos;
import model.Jurados;
 
public class JuradoJpaDAO {
 
         private static JuradoJpaDAO instance;
         protected EntityManager entityManager;
         
         public static JuradoJpaDAO getInstance(){
                   if (instance == null){
                            instance = new JuradoJpaDAO();
                   }
                   
                   return instance;
         }
 
         private JuradoJpaDAO() {
                   entityManager = getEntityManager();
         }
 
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
 
                   return entityManager;
         }
 
         public Jurados getById(final int id) {
                   return entityManager.find(Jurados.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Jurados> findAll() {
                   return entityManager.createQuery("FROM " + Jurados.class.getName()).getResultList();
         }
 
         @SuppressWarnings("unchecked")
         public List<Jurados> findNome(String Jurado) {
                   return entityManager.createQuery("FROM Jurados WHERE Nome = '"+Jurado+"'").getResultList();
         }
         
         public void persist(Jurados Jurado) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(Jurado);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Jurados Jurado) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(Jurado);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Jurados Jurado) {
                   try {
                            entityManager.getTransaction().begin();
                            Jurado = entityManager.find(Jurados.class, Jurado.getId());
                            entityManager.remove(Jurado);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                            Jurados Jurado = getById(id);
                            remove(Jurado);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}