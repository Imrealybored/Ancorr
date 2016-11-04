package ancorr;

import ancorr.controller.MainApplication;

public class Main
{
    public static void main(String[] args)
    {
        //TODO: supply the mainApplication with the real databaseAccess object.
        MainApplication mainApplication = new MainApplication(null);

        mainApplication.start();

    }
}
