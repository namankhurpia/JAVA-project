/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp.dao;

import emp.dbuitl.DBConnection;
import emp.pojo.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Naman Khurpia
 */
//data access objects
public class EmpDao {

    
    public static boolean AddEmployee(Emp e)throws SQLException
    {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into emp_table values(?,?,?)");
       
        ps.setInt(1,e.getEmpno());
        ps.setString(2,e.getEname());
        ps.setDouble(3,e.getSal());
        
        int count=ps.executeUpdate();
        if(count==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        

    }
    
    
}
