package in.mgp.p.designpatterns.commandpattern;

import javax.xml.crypto.Data;

public class DataFlowIntegrator {
    DataFlow flower;

    public DataFlowIntegrator() {

    }

    public void flowTheData(DataFlow dataFlow){
        this.flower = dataFlow;

    }

    public void flowInititated() {
        flower.flowThrough();
    }
}
