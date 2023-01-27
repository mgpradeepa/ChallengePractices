package in.mgp.p.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mgpradeepa on 06/10/17.
 */
public interface Subject {

    void registerObserver(Observer o);

   void unregisterObserver(Observer o);

 void notifyObserver();

}

class ConnectData implements Subject {
    String dataFormat;
    String dataContent ;
    float dataSize;

    ArrayList<Observer> observerList;

    public ConnectData  () {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);

    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));


    }

    @Override
    public void notifyObserver() {

        for (Observer obs : observerList)
            obs.update(dataFormat, dataContent, dataSize);



    }


    private String  getDataFormat() {
        return "JSON";
    }
    private String getDataContent () {
        return "{  }";
    }

    private float getDataSize() {
        return 1024L;
    }

    public void dataChanged() {
        dataFormat = getDataFormat();
        dataContent = getDataContent();
        dataSize = getDataSize();

        notifyObserver();
    }

}

