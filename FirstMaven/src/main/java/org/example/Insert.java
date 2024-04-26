/*package org.example;

//import org.example.Delete;
import org.example.SqlConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static void main(String[] args) {
        // insertCustomer(111,"defne","çınar","def@gmail.com","5041579645");
        insertProducts(3,"perde", 10.22, "Description1",3);
        // insertOrders(11,777, 1,25,Date.valueOf("2024-04-22"));

    }

    public static void insertCustomer(int customerID,String firstName, String lastName, String email, String phone){
        String insertCustomersSQL = "INSERT INTO customers (customer_id, first_name, last_name, email, phone) VALUES (?, ?, ?, ?, ?)";
        SqlConnection sqlConnection = new SqlConnection();
        try (Connection connection = sqlConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, customerID);
            insertCustomerStatement.setString(2, firstName);
            insertCustomerStatement.setString(3, lastName);
            insertCustomerStatement.setString(4, email);
            insertCustomerStatement.setString(5, phone);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void insertProducts(int productId,String productName, double price, String description, int categoryID){
        String insertProductSQL = "INSERT INTO products (product_id, product_name, price, description, category) VALUES (?, ?, ?, ?, ?)";
        SqlConnection sqlConnection = new SqlConnection();
        try (Connection connection = sqlConnection.getConnection();
             PreparedStatement insertProductStatement = connection.prepareStatement(insertProductSQL)) {

            insertProductStatement.setInt(1, productId);
            insertProductStatement.setString(2, productName);
            insertProductStatement.setDouble(3, price);
            insertProductStatement.setString(4, description);
            insertProductStatement.setInt(5, categoryID);
            int affectedRow = insertProductStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertOrders(int orderId,int customerId, int productId, int quantity, Date orderDate){
        String insertProductSQL = "INSERT INTO orders (order_id,customer_id,product_id, quantity, order_date) VALUES (?, ?, ?, ?, ?)";
        SqlConnection dbConnection = new SqlConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertProductStatement = connection.prepareStatement(insertProductSQL)) {

            insertProductStatement.setInt(1, orderId);
            insertProductStatement.setInt(2, customerId);
            insertProductStatement.setInt(3, productId);
            insertProductStatement.setInt(4, quantity);
            insertProductStatement.setDate(5, orderDate);
            int affectedRow = insertProductStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}*/