package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Avaliacao;
 
public class AvaliacaoJpaDAO {
 
         private static AvaliacaoJpaDAO instance;
         protected EntityManager entityManager;
         
         public static AvaliacaoJpaDAO getInstance(){
                   if (instance == null){
                            instance = new AvaliacaoJpaDAO();
                   }
                   
                   return instance;
         }
 
         private AvaliacaoJpaDAO() {
                   entityManager = getEntityManager();
         }
 
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
 
                   return entityManager;
         }
 
         public Avaliacao getById(final int id) {
                   return entityManager.find(Avaliacao.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Avaliacao> findAll() {
                   return entityManager.createQuery("FROM " + Avaliacao.class.getName()).getResultList();
         }
 
         public void persist(Avaliacao Avaliacao) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(Avaliacao);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Avaliacao Avaliacao) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(Avaliacao);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Avaliacao Avaliacao) {
                   try {
                           entityManager.getTransaction().begin();
                            Avaliacao = entityManager.find(Avaliacao.class, Avaliacao.getId());
                            entityManager.remove(Avaliacao);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                            Avaliacao Avaliacao = getById(id);
                            remove(Avaliacao);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}