package ancorr.model.client;


public class ClientAppointment
{
    private int clientAppointmentId;
    private int clientId;
    private int appointmentId;

    public int getClientAppointmentId()
    {
        return clientAppointmentId;
    }

    public void setClientAppointmentId(int clientAppointmentId)
    {
        this.clientAppointmentId = clientAppointmentId;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public int getAppointmentId()
    {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId)
    {
        this.appointmentId = appointmentId;
    }
}
