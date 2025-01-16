package tadjik.ilyosjon;

import java.sql.*;

public class MyDatabase {

    String url="jdbc:postgresql://localhost:5432/product";
    String username="postgres";
    String password="root";

    //User

    public void createUsers(User user){



        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String query="insert into users (id, name, email, password) values ("+user.getId()+",'"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"');";
            statement.execute(query);
            System.out.println("Ma`lumotlaringiz saqlandi!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void readUsers(){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="select * from users";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            String email=resultSet.getString(3);
            String password=resultSet.getString(4);

                User user = new User(id,name,email,password);
                System.out.println(user);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void updateUsers(Integer id , String newname){
        try {
            Connection connection=DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query="update users set name ='"+newname+"'where id ="+id;
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void deleteUsers(int id){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="delete from users where id = "+id;
            statement.execute(query);
            System.out.println("Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Product

    public void createProduct(Product product){



        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String query="insert into product (id, name, description, price) values ("+product.getId()+",'"+product.getName()+"','"+product.getDescription()+"','"+product.getPrice()+"');";
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void readProduct(){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="select * from product";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String description=resultSet.getString(3);
                String price=resultSet.getString(4);

                Product product = new Product(id,name,description,price);
                System.out.println(product);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void updateProduct(Integer id , String newprice){
        try {
            Connection connection=DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query="update product set price ='"+newprice+"'where id ="+id;
            statement.execute(query);
            System.out.println(" Updated ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void deleteProduct(int id){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="delete from product where id = "+id;
            statement.execute(query);
            System.out.println("Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Savat

    public void readSavat(){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="select * from savat";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String description=resultSet.getString(3);
                String price=resultSet.getString(4);

                Savat savat = new Savat(id, name, description, price);
                System.out.println(savat);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteSavat(int id){

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query="delete from savat where id = "+id;
            statement.execute(query);
            System.out.println("Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Sotib olish


}
