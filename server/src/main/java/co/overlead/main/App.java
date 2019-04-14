package co.overlead.main;

import java.util.UUID;

import co.overlead.module.Bank;
import co.overlead.module.Client;
import co.overlead.module.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        runRedis();
       // runProducer();
        //runConsumer();
    }
    static void runRedis(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        Client client=new Client();
        client.setId(2);
        client.setName("bob");

        Bank bank =new Bank();
        bank.setName("MSB");

     //   User user=new User(transactions);
      //  user.setName(UUID.randomUUID().toString());


        EntityManager entityManager=entityManagerFactory.createEntityManager();





        try {

            entityManager.getTransaction().begin();
            entityManager.persist(client);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            entityManager.getTransaction().begin();
            entityManager.persist(bank);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            entityManager.getTransaction().begin();
   //         entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        entityManagerFactory.close();
    }


}