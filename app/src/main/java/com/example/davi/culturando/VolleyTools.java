package com.example.davi.culturando;

import java.util.Map;

/**
 * Created by davitabosa on 03/02/17.
 */

public class VolleyTools {
    public static String stringifyRequest(Map<String, String> map, String... keys)
    {
        String output = "";
        int cont = 0;
        for(String key : keys){

            if(cont >0)
                output+=("&");
            output += key + "=";
            output +=(map.get(key));
            cont++;
        }
        return output;
    }
}
