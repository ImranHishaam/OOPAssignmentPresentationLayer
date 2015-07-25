/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplementation;

import DAOInterface.LoginDAO;
import org.json.JSONObject;

/**
 *
 * @author Imran
 */
public class LoginImplementation implements LoginDAO {
    
    @Override
    public JSONObject loginNow(String email, String password, String rememberMe){
        
        String check = loginToModel(email, password, rememberMe);
        
        if (check.equals("Incorrect username and password")){
           String error = "{\"error\":\"true\"}";
           return new JSONObject(error);
       }
        JSONObject userObject = new JSONObject(check);
     
        return userObject;
    }

    private static String loginToModel(java.lang.String email, java.lang.String password, java.lang.String rememberMe) {
        businesslayerservices.BusinessLayerService_Service service = new businesslayerservices.BusinessLayerService_Service();
        businesslayerservices.BusinessLayerService port = service.getBusinessLayerServicePort();
        return port.loginToModel(email, password, rememberMe);
    }
    
}
