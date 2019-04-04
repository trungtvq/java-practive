package processing;

import running.IProcess;

import java.util.ArrayList;
import java.util.List;

public class Download implements IProcess{
    List<String> listDownload;
    public Download(){
        listDownload=new ArrayList<>() ;
    }
    //implement
    @Override
    public void addDownload(String _p){
        listDownload.add(_p);
    }

    @Override
    public int getRunning() {
        return listDownload.size();
    }

}
