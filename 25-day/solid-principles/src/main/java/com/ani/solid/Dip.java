package com.ani.solid;

public class Dip {

    public static void main(String[] args) {
        
        System.gc();

        Runtime.getRuntime().gc();

        // CrudOperations db = new UserDb(); // slower db

        // CrudOperations db = new FastUserDb(); // faster userdb

        CrudOperations db = new CloudUserDb();

        UserController controller = new UserController(db);

        UserMenu menu = new UserMenu(controller);
    }
}


interface CrudOperations {
    void create();

    void read();

    void update();

    void delete();
}
// solower user db
class UserDb implements CrudOperations {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    } 
   
}

class FastUserDb implements CrudOperations {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}

class CloudUserDb implements CrudOperations {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}

class UserController {

    // we are not creating object of UserDb here
    // object create process is done by some one else
    // this is called as dependency inversion
    private CrudOperations db;

    // user controller is dependent on user db class
    // dependency is satisfied by passing userdb via constructor
    // constructor injection
    public UserController(CrudOperations db) { 
        this.db = db;
    }

    // dependency is satisfied by passing userdb via setter method
    // setter injection
    public void setDb(UserDb db) {
        this.db = db;
    }
    
    public void addUser() { db.save();  }
}

class UserMenu {

    private final UserController controller;
    
    public UserMenu(UserController controller) {
        this.controller = controller;
    }

    public void performAction() {
        controller.addUser();
    }
}