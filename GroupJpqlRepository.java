package com.firstspring.firstspring.studentsController;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public interface GroupJpqlRepository extends JpaRepository {
    Object items = null;

    static void showAll(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JetBrainsLink_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();

        Query query = (Query) entitymanager.createQuery("select item from Groups item");

        List<Groups> findAll();

    }

}
git