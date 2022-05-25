package in.mgp.p.designpatterns.commandpattern;

public class DBDataMask implements DataFlow {

DBDataStore dbDataStore;

public DBDataMask(DBDataStore dbDataStore) {
    this.dbDataStore = dbDataStore;
}


    @Override
    public void flowThrough() {
        dbDataStore.maskPiiData();
    }
}
