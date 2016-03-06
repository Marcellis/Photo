package org.mobile_development.marcellis.photo;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * Created by Marcellis on 6-3-2016.
 */
public class Picture
{


    private File mPhotoFile;
    private String name;


    public File getmPhotoFile() {
        return mPhotoFile;
    }

    public void setmPhotoFile(Context context) {

        {
             File externalFilesDir =
             context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);

            this.mPhotoFile = new File (externalFilesDir, this.getPhotoFilename());
        }


    }

    public String getPhotoFilename() {
        return "IMG_"+ getName() + ".jpg";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
