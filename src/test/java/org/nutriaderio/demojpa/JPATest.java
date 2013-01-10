/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.text.MessageFormat;
import java.util.Date;
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
        Long begin = System.nanoTime();
        EntityTransaction et = em.getTransaction();
        et.begin();

        Long id = (Long) em.createNamedQuery("Comercio.nextId").setParameter("psf", "01001").getSingleResult();
        for (long i = 0; i < 1000; i++) {

            Comercio comercio = new Comercio(MessageFormat.format("{0,number,0000}", id + i), "01001");
            comercio.setComNomcomlrg("Comercio de prueba " + i);
            comercio.setComNomcomcrt("CP " + i);
            comercio.setComCatcom("T00000701001");
            comercio.setComCodsct("T00000702001");
            comercio.setComDirecc("Av. Galvez barrenechea 1094 san isidro");
            comercio.setComDepar("Lima");
            comercio.setComProvi("lima");
            comercio.setComDistri("San isidro");
            comercio.setComUrban("Corpac");
            comercio.setComTelcon1("4152400");
            comercio.setComNomcon1("Novatronic");
            comercio.setComMailcon1("soporte@novatronic.com");
            comercio.setComTelcon2("+5114152400");
            comercio.setComNomcon2("Novatronic");
            comercio.setComMailcon2("soporte@novatronic.com");
            comercio.setComNroctafinanciera("999-999999-99999999-999-9");
            comercio.setComLineacredito(1000d);
            comercio.setComEstado("T00000201001");

            em.persist(comercio);

        }

        em.flush();
        et.commit();

        Long end = System.nanoTime();


        System.out.println("========================= read().end, total time " + (end - begin));
    }

//    @Test
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
            Object result = em.createQuery("SELECT COUNT(*) FROM Comercio o where o.comercioPK.comCodpsf = '01001'").getResultList();
            assertNotNull(result);
            System.out.println(result);
        }
//        {
//            List<Bar> list = em.createQuery("select o from Bar o").getResultList();
//            assertNotNull(list);
//            for (Bar foo : list) {
//                System.out.println(foo);
//            }
//        }
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
