package com.example;

import java.util.ArrayList;
import java.util.List;

public class Addresses {
    private List<String> _addresses;
    public Addresses() {
        _addresses = new ArrayList<>();
    }
    public void addAddress(String address) {
        _addresses.add(address);
    }
    public List<String> getAddresses() {
        return _addresses;
    }
    
}
