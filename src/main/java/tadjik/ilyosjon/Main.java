package tadjik.ilyosjon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.User
                    2.Product
                    3.Savat
                    4.Sotib olish
                    """);
            int tanlash = scannerInt.nextInt();
            switch (tanlash) {
                case 1 -> {
                    System.out.println("""
                            1.Creat
                            2.Read
                            3.Update
                            4.Delete
                            """);




                    int tanlashuser = scannerInt.nextInt();
                    switch (tanlashuser) {
                        case 1 -> {

                            System.out.println(" Enter id ");
                            int userId = scannerInt.nextInt();

                            System.out.println(" Enter name ");
                            String name = scannerString.nextLine();

                            System.out.println(" Enter email ");
                            String email = scannerString.nextLine();

                            System.out.println(" Enter password ");
                            String password = scannerString.nextLine();

                            User user = new User(userId, name, email, password);
                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.createUsers(user);
                        }
                        case 2 -> {
                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.readUsers();
                        }
                        case 3 -> {
                            System.out.println(" Qaysi userni update qilasiz Id ni kiriting ");
                            int userid = scannerInt.nextInt();

                            System.out.println(" Yangi name kiriting ");
                            String newname = scannerString.nextLine();

                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.updateUsers(userid, newname);


                        }
                        case 4 -> {
                            System.out.println(" Qaysi userni o`chirmoqchisiz id ni kiriting : ");
                            int delid = scannerInt.nextInt();

                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.deleteUsers(delid);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("""
                            1.Creat
                            2.Read
                            3.Update
                            4.Delete
                            """);
                    int tanlashProduct = scannerInt.nextInt();
                    switch (tanlashProduct) {
                        case 1 -> {
                            System.out.println(" Enter id ");
                            int productId = scannerInt.nextInt();

                            System.out.println(" Enter name ");
                            String productname = scannerString.nextLine();

                            System.out.println(" Enter description ");
                            String productDescription = scannerString.nextLine();

                            System.out.println(" Enter price ");
                            String productPrice = scannerString.nextLine();

                            Product product = new Product(productId, productname, productDescription, productPrice);
                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.createProduct(product);
                        }
                        case 2 -> {
                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.readProduct();
                        }
                        case 3 -> {
                            System.out.println(" Qaysi productni update qilasiz Id ni kiriting ");
                            int userid = scannerInt.nextInt();

                            System.out.println(" Yangi price kiriting ");
                            String newprice = scannerString.nextLine();

                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.updateProduct(userid, newprice);


                        }
                        case 4 -> {
                            System.out.println(" Qaysi productni o`chirmoqchisiz id ni kiriting  ");
                            int delid = scannerInt.nextInt();

                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.deleteProduct(delid);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("""
                            1.Read
                            2.Delete
                            """);
                    int tanlashSavat = scannerInt.nextInt();
                    switch (tanlashSavat) {
                        case 1 -> {
                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.readSavat();
                        }
                        case 2 -> {
                            System.out.println(" savatdan qaysi productni O`chirmoqchisiz id ni kiriting ");
                            int delid = scannerInt.nextInt();

                            MyDatabase myDatabase = new MyDatabase();
                            myDatabase.deleteSavat(delid);
                        }
                    }
                }
                case 4 -> {
                    MyDatabase myDatabase = new MyDatabase();
                    myDatabase.readProduct();
                    System.out.println();
                }
            }

        }

    }
}

