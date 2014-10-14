/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongocrud;

/**
 * 
 *
 *
 * @author sapu
 */

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;


public class DBManager {
	private static DB database;
	
	public static DB getDatabase() {
		if(database == null) {
			MongoClient mongo;
			try {
				mongo = new MongoClient("localhost", 27017);
				database = mongo.getDB("University");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return database;
	}
}
