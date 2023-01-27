package in.mgp.p.designpatterns.commandpattern;

public class DBDataFlow implements DataFlow {
    DBDataStore dbData;

    public DBDataFlow(DBDataStore dbData) {
        this.dbData = dbData;

    }


    @Override
    public void flowThrough() {
       dbData.connectToDb();
       dbData.storeData();
    }
}
