package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Appointment;
import ancorr.view.ListView;

import java.util.List;

public class AppointmentListView extends ListView<Appointment>
{
    public AppointmentListView(List<Appointment> list)
    {
        super(list);
    }

    @Override
    public void onCreate()
    {
        //TODO; finish it.
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
