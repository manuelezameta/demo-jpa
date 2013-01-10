/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author carloseg
 */
public class JPATest {

    private static EntityManagerFactory emf;
    private EntityManager em;

    public JPATest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void insert() {
        System.out.println("========================= insert().begin");
        EntityTransaction et = em.getTransaction();
        et.begin();

        Fool fool = new Fool();
        em.persist(fool);

        em.flush();
        et.commit();
        System.out.println("========================= read().end");
    }

    @Test
    public void insertNativo() {
        System.out.println("========================= insertNativo().begin");
        EntityTransaction et = em.getTransaction();
        et.begin();
        int i = em.createNativeQuery("insert into BAR (ID) values (:id)").setParameter("id", 3l).executeUpdate();
        System.out.println(i);
        em.flush();
        et.commit();
        System.out.println("========================= insertNativo().end");
    }

    @Test()
    public void read() {
        System.out.println("========================= read().begin");
        {
            Object result = em.createQuery("SELECT o FROM Fool o").getResultList();
            assertNotNull(result);
            System.out.println(result);
        }
        {
            List<Bar> list = em.createQuery("select o from Bar o").getResultList();
            assertNotNull(list);
            for (Bar foo : list) {
                System.out.println(foo);
            }
        }
        System.out.println("========================= read().end");

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("========================= setUpClass().begin");
        emf = Persistence.createEntityManagerFactory("demojpa");
        System.out.println("========================= setUpClass().end");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("========================= tearDownClass().begin");
        emf.close();
        System.out.println("========================= tearDownClass().end");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        em = emf.createEntityManager();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        em.close();
    }
}
