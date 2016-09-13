package com.matc.persistence;

import com.matc.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {

    private final Logger logger = Logger.getLogger(this.getClass());
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = "SELECT * FROM users";

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchUser.getAllUsers()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchUser.getAllUsers()...Exception: " + e);
        }
        return users;
    }

    //TODO add a method or methods to return a single user based on search criteria
    public List<User> getStudentByLastName(String studentLastName) {
        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = "SELECT * FROM users WHERE last_name = '" + studentLastName + "' limit 1";

        try{
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchUser.getStudentByLastName()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchUser.getStudentByLastName()...Exception: " + e);
        }
        return users;
    }




    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        // TODO map the remaining fields
        user.setUserid(results.getString("id"));
        user.setLastName(results.getString("last_name"));
        user.setFirstName(results.getString("first_name"));
        logger.info("The first name is " + user.getFirstName());
        user.setDateOfBirth (results.getDate("date_of_birth").toLocalDate()); // converted string to the Local Date
        //user.setDateOfBirth( results.getDate("date_of_birth")).toLocalDate();



        return user;
    }

}
