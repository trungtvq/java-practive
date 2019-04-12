import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        Client client=new Client();
        client.setId(2);
        client.setName("bob");

        Bank bank =new Bank();
        bank.setName("MSB");


        EntityManager entityManager=entityManagerFactory.createEntityManager();

        entityManager.persist(client);

        entityManager.persist(bank);

        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
