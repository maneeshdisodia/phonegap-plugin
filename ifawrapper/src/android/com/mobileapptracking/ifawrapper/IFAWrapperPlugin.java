package com.mobileapptracking.ifawrapper;

import java.io.IOException;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class IFAWrapperPlugin extends CordovaPlugin {

    public static final String GETIFA = "getAppleAdvertisingIdentifier";
    
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {
        if (GETIFA.equals(action))
        {
            callbackContext.success();
            return true;
        }
        else
        {
            callbackContext.error("Unsupported action on Android");
            return false;
        }
    }
}