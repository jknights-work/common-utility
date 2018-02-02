/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
public class JSONTool {
    
    private final JsonParser parser = JsonParserFactory.getJsonParser();
    private final ObjectMapper mapper = new ObjectMapper();
    
    public HashMap<String, Object> parseMap (String json) {
        HashMap<String, Object> result = null;
        if (!json.isEmpty()) {
            result = (HashMap<String, Object>) parser.parseMap(json);
        }
        return result;
    }
    
    public String parseString (Map<String, Object> data) {
        String result = null;
        if (data != null) {
            try {        
                result = (String) mapper.writeValueAsString(data);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(JSONTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    public String parseString (Object data) {
        String result = null;
        if (data != null) {
            try {        
                result = (String) mapper.writeValueAsString(data);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(JSONTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    
    //other json tools below
}
