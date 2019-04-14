package co.overlead.module;

import javax.persistence.*;
import java.util.*;

public class User {
        private String id;
        private String name;
        private Long balance;

        private Collection<PayTransaction> transactions;

        public User(String name) {
            this.transactions = new ArrayList<PayTransaction>();
            this.id= UUID.randomUUID().toString();
            this.name=name;
        }

        public String getId() {
            return id;
        }
        public void setId() {
            this.id=UUID.randomUUID().toString();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public Long getBalance() {
            return balance;
        }
}