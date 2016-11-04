package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Appointment;
import ancorr.view.ListView;

public class AppointmentListView extends ListView<Appointment>
{
    public AppointmentListView(MainApplication mainApplication)
    {
        super(mainApplication.getDatabaseAccess().getAppointments());
    }

    @Override
    public void onCreate()
    {

    }

    @Override
    public void onEdit()
    {

    }

    @Override
    public void onDelete()
    {

    }
}
