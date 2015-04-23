package persistencia.aulapersistenciaandroid;

import android.app.Application;
import android.content.Context;

/**
 * Created by sanderson on 22/04/2015.
 */
public class MyApp extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        MyApp.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApp.context;
    }
}
