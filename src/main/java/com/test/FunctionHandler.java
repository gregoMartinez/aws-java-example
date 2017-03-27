package com.test;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gregorio Martinez on 26/03/17.
 */
public class FunctionHandler {

    public Object handleRequest(Map<String,Object> input, Context context) {
        context.getLogger().log("Input: " + input);
        APIResponse apiResponse = new APIResponse(200,new HashMap<String ,Object>(), (String) input.get("body"));
        return apiResponse;
    }

}
