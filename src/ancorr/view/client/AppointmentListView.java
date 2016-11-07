package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Appointment;
import ancorr.view.ListView;

import java.util.List;

public class AppointmentListView extends ListView<Appointment>
{
    public AppointmentListView( List<Appointment> list)
    {
        super(list);
    }

    @Override
    public void onCreate()
    {
        MainApplication.setContent(new AppointmentView(null).getMainPanel());
    }

    @Override
    public void onEdit()
    {
        Appointment appointment = this.getSelectedItem();
        if(appointment != null)
        {
            MainApplication.setContent(new AppointmentView(appointment).getMainPanel());
        }
    }

    @Override
    public void onDelete()
    {
		//TODO:
    }
}
