package Threading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBapi{
	
	private static DBapi DBConInstance;
	private  Connection con;
    private  final String Driver = "oracle.jdbc.driver.OracleDriver";
    private  final String ConnectionString = "jdbc:oracle:thin:@uadbqa.vip.its.ebay.com:1521:UADB";
    private  final String user = "cstudio_user";
    private  final String pwd = "cstudio_user";

    



/**
     * Making constructor private
     */
    
    private DBapi(){
    	
    	
    }
    

    
    
    /**
     * create Database object
     */
     public static DBapi Database() {
    
    	//synchronized (DBConInstance) {

//    		synchronized (DBapi.class) { not working
    		
    		if(DBConInstance==null)
        	{
        		DBConInstance = new DBapi();
        	}
    		return DBConInstance;
    	    
		}
    	 

    
     /**
     * to load the database base driver
     * @return a database connection
     * @throws SQLException throws an exception if an error occurs
     */
    public Connection loadDriver() throws SQLException {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        con = DriverManager.getConnection(ConnectionString, user, pwd);
        return con;
    }

    /**
     * to get a result set of a query
     * @param query custom query
     * @return a result set of custom query
     * @throws SQLException throws an exception if an error occurs
     */
    public ResultSet getResultSet(String query) throws SQLException {
        Connection con = loadDriver();
        ResultSet rs;
        PreparedStatement st = con.prepareStatement(query);
        rs = st.executeQuery();

        return rs;
        
    }

    /**
     * 
     * closing connection is not required 
     *
     */
    
    
    
    
    
    
    /* *//**
     * to run an update query such as update, delete
     * @param query custom query
     * @throws SQLException throws an exception if an error occurs
     *//*
    public static void runQuery(String query) throws SQLException {
        Connection con = loadDriver();
        ResultSet rs;
        PreparedStatement st = con.prepareStatement(query);
        st.executeUpdate();
    }*/
	
    
    public synchronized void test()
    
    {
    	int i=0;
    	while(i<50)
    	{
    		System.out.println(Thread.currentThread().getName() + "  value of i "  + i);
    	
    		++i;
    	
    		System.out.println(Thread.currentThread().getName() + "  value of i after increment "  + i);
    	}
    	
    }
	
  
}