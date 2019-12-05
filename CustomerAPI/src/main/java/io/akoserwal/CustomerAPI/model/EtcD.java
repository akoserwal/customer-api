package io.akoserwal.CustomerAPI.model;

import org.springframework.stereotype.Component;

@Component
public class EtcD {
    Customer currentState;
    Customer desiredState;

    public Customer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Customer currentState) {
        this.currentState = currentState;
    }

    public Customer getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(Customer desiredState) {
        this.desiredState = desiredState;
    }
}
