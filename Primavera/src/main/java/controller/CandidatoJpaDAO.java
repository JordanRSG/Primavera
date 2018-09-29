package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Candidatos;
 
public class CandidatoJpaDAO {
 
         private static CandidatoJpaDAO instance;
         protected EntityManager entityManager;
         
         public static CandidatoJpaDAO getInstance(){
                   if (instance == null){
                            instance = new CandidatoJpaDAO();
                   }
                   
                   return instance;
         }
 
         private CandidatoJpaDAO() {
                   entityManager = getEntityManager();
         }
 
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
 
                   return entityManager;
         }
 
         public Candidatos getById(final int id) {
                   return entityManager.find(Candidatos.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Candidatos> findAll() {
                   return entityManager.createQuery("FROM " + Candidatos.class.getName()).getResultList();
         }
 
         public void persist(Candidatos Candidato) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(Candidato);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Candidatos Candidato) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(Candidato);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Candidatos Candidato) {
                   try {
                            entityManager.getTransaction().begin();
                            Candidato = entityManager.find(Candidatos.class, Candidato.getId());
                            entityManager.remove(Candidato);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                            Candidatos Candidato = getById(id);
                            remove(Candidato);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}