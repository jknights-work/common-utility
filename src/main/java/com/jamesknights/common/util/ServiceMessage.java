/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
public class ServiceMessage {
    
    private HashMap<String, String> log = new HashMap<>();
    
    public void addMessage (String title, String message) {
        if (!title.isEmpty() && !message.isEmpty()) {
            log.put(title, message);
        }
    }
    
    @Override
    public String toString () {
        StringBuilder str = new StringBuilder();
        for (Map.Entry entry : log.entrySet()) {
            str.append(System.getProperty("line.separator"));
            str.append("Message: ").append(entry.getKey());
            str.append(System.getProperty("line.separator")).append("value: ").append(entry.getValue());
            str.append(System.getProperty("line.separator"));
        }
        return (String) str.toString();
    }
    
    //more app error methods here
    
}
