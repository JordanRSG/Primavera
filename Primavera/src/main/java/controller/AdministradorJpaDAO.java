package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Administrador;
 
public class AdministradorJpaDAO {
 
         private static AdministradorJpaDAO instance;
         protected EntityManager entityManager;
         
         public static AdministradorJpaDAO getInstance(){
                   if (instance == null){
                            instance = new AdministradorJpaDAO();
                   }
                   
                   return instance;
         }
 
         private AdministradorJpaDAO() {
                   entityManager = getEntityManager();
         }
 
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
 
                   return entityManager;
         }
 
         public Administrador getById(final int id) {
                   return entityManager.find(Administrador.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Administrador> findAll() {
                   return entityManager.createQuery("FROM " + Administrador.class.getName()).getResultList();
         }
 
         public void persist(Administrador Administrador) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(Administrador);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Administrador Administrador) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(Administrador);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Administrador Administrador) {
                   try {
                            entityManager.getTransaction().begin();
                            Administrador = entityManager.find(Administrador.class, Administrador.getId());
                            entityManager.remove(Administrador);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                            Administrador Administrador = getById(id);
                            remove(Administrador);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}