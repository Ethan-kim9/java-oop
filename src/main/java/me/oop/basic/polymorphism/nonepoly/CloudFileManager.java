package me.oop.basic.polymorphism.nonepoly;

import java.io.File;
import java.util.List;

public class CloudFileManager {
    public List<FIleInfo> getFileInfos(CloudId cloudId){
        if(cloudId == CloudId.DROPBOX){
            //DROPBOXService
        }else if( cloudId == CloudId.BOX){
            //BOXService
        }
        return null;
    }

    public void download(FIleInfo file, File localTarget) {
        if (file.getCloudId() == CloudId.DROPBOX) {

        } else if (file.getCloudId() == CloudId.BOX) {

        }
    }
}
