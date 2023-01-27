package in.mgp.p.designpatterns.commandpattern;

public class DBDataStore {
    public void connectToDb(){
        System.out.println("connected to DB");

    }
    public void maskPiiData() {
        System.out.println("Using MD5 salting to mask");
    }

    public void decideDB()  {
        System.out.println("Depending on the data choose the db");
    }

    public void storeData() {
        System.out.println("stored the data");
    }
}
