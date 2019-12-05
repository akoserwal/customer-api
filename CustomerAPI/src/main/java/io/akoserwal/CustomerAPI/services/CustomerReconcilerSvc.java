package io.akoserwal.CustomerAPI.services;

import io.akoserwal.CustomerAPI.model.Customer;
import io.akoserwal.CustomerAPI.model.EtcD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerReconcilerSvc {

    @Autowired EtcD reconciler;

   public Customer setCurrentState() {
       Customer customer = new Customer();
       customer.setFirstName("Abhishek");
       customer.setLastName("Koserwal");
       customer.setEmail("akoserwal@github.io");
       reconciler.setCurrentState(customer);
       return customer;
    }

    public void setDesiredState(String firstName, String lastName, String email){
       Customer customer = new Customer();
       customer.setEmail(email);
       customer.setFirstName(firstName);
       customer.setLastName(lastName);
       reconciler.setDesiredState(customer);
    }

    public Customer getCustomerCurr() {
        setCurrentState();
        return reconciler.getCurrentState();
    }

    public Customer getCustomerDes(){
       return reconciler.getDesiredState();
    }

    public EtcD getReconciler(){
       return reconciler;
    }



}
