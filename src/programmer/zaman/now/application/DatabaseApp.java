package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        connectDatabase("ari", "rahasia");
        System.out.println("Sukses connect ke database");
    }

    public static void connectDatabase (String username, String password){

        if (username == null || password == null){
            throw new DatabaseError("Gagal connect ke database");
        }
    }
}
