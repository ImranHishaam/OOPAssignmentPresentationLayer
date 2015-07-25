/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import org.json.JSONObject;

/**
 *
 * @author Imran
 */
public interface LoginDAO {
    
    public JSONObject loginNow(String email, String password, String rememberMe);
    
}
