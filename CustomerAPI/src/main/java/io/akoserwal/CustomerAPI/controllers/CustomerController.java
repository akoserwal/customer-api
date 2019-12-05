package io.akoserwal.CustomerAPI.controllers;

import io.akoserwal.CustomerAPI.model.Customer;
import io.akoserwal.CustomerAPI.model.EtcD;
import io.akoserwal.CustomerAPI.services.CustomerReconcilerSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "/apis/v1alpha1/customer")
public class CustomerController {

    @Autowired
    CustomerReconcilerSvc customerReconciler;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE,
            value = "/current")
    public Customer getCustomer(){
        return customerReconciler.getCustomerCurr();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = APPLICATION_JSON_VALUE,
            value = "/desired")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Customer updateCustomer(@RequestBody Customer customer){
            customerReconciler.setDesiredState(customer.getFirstName(), customer.getLastName(), customer.getEmail());
            return customerReconciler.getCustomerDes();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE,
            value = "/reconcile")
    public EtcD reconiledState(){
        return customerReconciler.getReconciler();
    }


}
