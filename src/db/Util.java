/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Stefan Elez
 */
class Util {
    private Properties properties;
    private static Util instance;
    
    private Util() throws IOException{
        properties=new Properties();
        properties.load(new FileInputStream("db.properties"));
    }
    
    public static Util getInstance() throws IOException {
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }
    
    public String getDriver() {
        return properties.getProperty("mysql_driver");
    }
    
    public String getUrl(){
        return properties.getProperty("mysql_url");
    }
    
    public String getUser() {
        return properties.getProperty("mysql_user");
    }
    public String getPass() {
        return properties.getProperty("mysql_password");
    }
}
