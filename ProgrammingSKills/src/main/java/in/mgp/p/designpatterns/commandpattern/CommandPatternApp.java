package in.mgp.p.designpatterns.commandpattern;

public class CommandPatternApp {
    public static void main(String[] args) {
       DataFlowIntegrator dataFlowIntegrator  = new DataFlowIntegrator();
       DBDataStore dataStore = new DBDataStore();
       // general data store
       dataFlowIntegrator.flowTheData(new DBDataFlow(dataStore));
       dataFlowIntegrator.flowInititated();

// mask
       dataFlowIntegrator.flowTheData(new DBDataMask(dataStore));
       dataFlowIntegrator.flowInititated();

        

    }
}
