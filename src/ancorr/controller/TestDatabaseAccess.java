package ancorr.controller;

import ancorr.model.client.*;
import ancorr.model.contact.*;
import ancorr.model.employee.*;
import ancorr.model.inventory.*;
import ancorr.model.project.*;
import ancorr.model.vendor.PurchaseHistory;
import ancorr.model.vendor.Vendor;
import ancorr.model.vendor.VendorBidding;
import ancorr.model.vendor.VendorStatus;

import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestDatabaseAccess implements IDatabaseAccess
{
    HashMap<Integer, Appointment> appointmentHashMap = new HashMap<>();
    {
        Appointment appointment = new Appointment();
        appointment.id = 1;
        appointment.clientId = 1;
        appointment.date = new Date(new java.util.Date().getTime());
        appointment.time = new Time(new java.util.Date().getTime());
        appointment.subject = "client meeting";
        appointmentHashMap.put(appointment.id, appointment);
    }

    @Override
    public List<Appointment> getAppointments()
    {
        return getValuesAsList(appointmentHashMap);
    }

    @Override
    public Appointment getAppointment(int id)
    {
        return appointmentHashMap.get(id);
    }

    @Override
    public void setAppointment(Appointment appointment)
    {
        if(appointment.id == null)
        {
            appointment.id = 0;
        }

        appointmentHashMap.put(appointment.id, appointment);
    }

    private final HashMap<Integer, Client> clients = new HashMap<>();
    {
        Client testClient = new Client();
        testClient.id = 1;
        testClient.firstName = "Hurry";
        testClient.lastName = "Botter";
        testClient.clientStatusId = 1;
        testClient.contactId = 1;
        clients.put(testClient.id, testClient);
    }

    @Override
    public List<Client> getClients()
    {
        return getValuesAsList(clients);
    }

    @Override
    public Client getClient(int id)
    {
        return clients.get(id);
    }

    @Override
    public void setClient(Client client)
    {
        if(client.id == null)
        {
            client.id = 0;
        }

        clients.put(client.id, client);
    }

    private final HashMap<Integer, ClientBill> clientBills = new HashMap<>();
    {
        ClientBill bill = new ClientBill();
        bill.id = 1;
        bill.billStatusId = 1;
        bill.clientId = 1;
        bill.clientPaymentInfo = "NO MONEY PAID!";
        bill.transactionId = 1;
        clientBills.put(1, bill);
    }

    @Override
    public List<ClientBill> getClientBills()
    {
        return getValuesAsList(clientBills);
    }

    @Override
    public List<ClientBill> getClientBills(Client client)
    {
        List<ClientBill> list = new LinkedList<>();
        for(ClientBill bill : clientBills.values())
        {
            if(bill.clientId == client.id)
            {
                list.add(bill);
            }
        }

        return list;
    }

    @Override
    public ClientBill getClientBill(int id)
    {
        return clientBills.get(id);
    }

    @Override
    public void setClientBill(ClientBill clientBill)
    {
        if(clientBill.id == null)
        {
            clientBill.id = 0;
        }
        clientBills.put(clientBill.id, clientBill);
    }

    private final HashMap<Integer, ClientBillStatus> clientBillStatusHashMap = new HashMap<>();
    {
        ClientBillStatus paid = new ClientBillStatus();
        paid.id = 1;
        paid.description = "paid";

        clientBillStatusHashMap.put(paid.id, paid);

        ClientBillStatus unpaid = new ClientBillStatus();
        unpaid.id = 2;
        unpaid.description = "pending";

        clientBillStatusHashMap.put(unpaid.id, unpaid);
    }

    @Override
    public List<ClientBillStatus> getClientBillStatus()
    {
        return getValuesAsList(clientBillStatusHashMap);
    }

    @Override
    public ClientBillStatus getClientBillStatus(int id)
    {
        return clientBillStatusHashMap.get(id);
    }

    @Override
    public List<ClientStatus> getClientStatus()
    {
        return null;
    }

    @Override
    public ClientStatus getClientStatus(int id)
    {
        return null;
    }

    @Override
    public Address getAddress(int id)
    {
        return null;
    }

    @Override
    public Address getAddress(Contact contact)
    {
        return null;
    }

    @Override
    public void setAddress(Address address)
    {

    }

    @Override
    public List<City> getCities()
    {
        return null;
    }

    @Override
    public City getCity(int id)
    {
        return null;
    }

    @Override
    public void setCity(City city)
    {

    }

    @Override
    public Contact getContact(int id)
    {
        return null;
    }

    @Override
    public void setContact(Contact contact)
    {

    }

    @Override
    public List<Country> getCountries()
    {
        return null;
    }

    @Override
    public Country getCountry(int id)
    {
        return null;
    }

    @Override
    public void setCountry(Country country)
    {

    }

    @Override
    public List<StateOrProvince> getStateOrProvinces()
    {
        return null;
    }

    @Override
    public StateOrProvince getStateOrProvince(int id)
    {
        return null;
    }

    @Override
    public void setStateOrProvince(StateOrProvince stateOrProvince)
    {

    }

    @Override
    public List<ZipCode> getZipCodes()
    {
        return null;
    }

    @Override
    public ZipCode getZipCode(int id)
    {
        return null;
    }

    @Override
    public void setZipCode(ZipCode zipCode)
    {

    }

    @Override
    public List<Employee> getEmployees()
    {
        return null;
    }

    @Override
    public Employee getEmployee(int id)
    {
        return null;
    }

    @Override
    public void setEmployee(Employee employee)
    {

    }

    @Override
    public List<EmployeeBenefitType> getEmployeeBenefitTypes()
    {
        return null;
    }

    @Override
    public EmployeeBenefitType getEmployeeBenefitType(int id)
    {
        return null;
    }

    @Override
    public EmployeeBenefit getEmployeeBenefit(int id)
    {
        return null;
    }

    @Override
    public void setEmployeeBenefit(EmployeeBenefit employeeBenefit)
    {

    }

    @Override
    public void deleteEmployeeBenefit(int id)
    {

    }

    @Override
    public List<EmployeeJobHistory> getEmployeeJobHistories(Employee employee)
    {
        return null;
    }

    @Override
    public EmployeeJobHistory getEmployeeJobHistory(int id)
    {
        return null;
    }

    @Override
    public void setEmployeeJobHistory(EmployeeJobHistory employeeJobHistory)
    {

    }

    @Override
    public List<EmployeeMedicalRecord> getEmployeeMedicalRecords(Employee employee)
    {
        return null;
    }

    @Override
    public EmployeeMedicalRecord getEmployeeMedicalRecord(int id)
    {
        return null;
    }

    @Override
    public void setEmployeeMedicalRecord(EmployeeMedicalRecord employeeMedicalRecord)
    {

    }

    @Override
    public EmployeeSchedule getEmployeeSchedule(int id)
    {
        return null;
    }

    @Override
    public EmployeeSchedule getEmployeeSchedule(Employee employee)
    {
        return null;
    }

    @Override
    public void setEmployeeSchedule(EmployeeSchedule EmployeeSchedule)
    {

    }

    @Override
    public void deleteEmployeeSchedule(int id)
    {

    }

    @Override
    public List<EmployeeShift> getEmployeeShifts(EmployeeSchedule EmployeeSchedule)
    {
        return null;
    }

    @Override
    public EmployeeShift getEmployeeShift(int id)
    {
        return null;
    }

    @Override
    public void setEmployeeShift(EmployeeShift employeeShift)
    {

    }

    @Override
    public void deleteEmployeeShift(int id)
    {

    }

    @Override
    public List<EmployeeStatus> getEmployeeStatus()
    {
        return null;
    }

    @Override
    public EmployeeStatus getEmployeeStatus(int id)
    {
        return null;
    }

    @Override
    public List<Payroll> getPayrolls(Employee employee)
    {
        return null;
    }

    @Override
    public Payroll getPayroll(int id)
    {
        return null;
    }

    @Override
    public void setPayroll(Payroll payroll)
    {

    }

    @Override
    public List<Position> getPositions()
    {
        return null;
    }

    @Override
    public Position getPosition(int id)
    {
        return null;
    }

    @Override
    public List<Supervisor> getSupervisors()
    {
        return null;
    }

    @Override
    public Supervisor getSupervisor(int id)
    {
        return null;
    }

    @Override
    public void setSupervisor(Supervisor supervisor)
    {

    }

    @Override
    public void deleteSupervisor(int id)
    {

    }

    @Override
    public List<SupervisorStatus> getSupervisorStatus()
    {
        return null;
    }

    @Override
    public SupervisorStatus getSupervisorStatus(int id)
    {
        return null;
    }

    private final HashMap<Integer, SystemUser> systemUsers = new HashMap<>();

    {
        SystemUser systemUser = new SystemUser();
        systemUser.username = "admin";
        systemUser.password = "admin";
        systemUser.id = 1;
        systemUser.employeeId = 1;
        systemUser.systemUserStatusId = 1;

        systemUsers.put(1, systemUser);
    }

    @Override
    public List<SystemUser> getSystemUsers()
    {
        LinkedList<SystemUser> list = new LinkedList<>();
        list.addAll(systemUsers.values());
        return list;
    }

    @Override
    public SystemUser getSystemUser(int id)
    {
        return systemUsers.get(id);
    }

    @Override
    public SystemUser getSystemUser(String username, String password)
    {
        for(Integer id : systemUsers.keySet())
        {
            SystemUser systemUser = systemUsers.get(id);
            if(systemUser.username.equals(username) && systemUser.password.equals(password))
            {
                return systemUser;
            }
        }

        return null;
    }

    @Override
    public void setSystemUser(SystemUser systemUser)
    {
        systemUsers.put(systemUser.id, systemUser);
    }

    @Override
    public void deleteSystemUser(int id)
    {
        systemUsers.remove(id);
    }

    @Override
    public List<SystemUserStatus> getSystemUserStatus()
    {
        return null;
    }

    @Override
    public SystemUserStatus getSystemUserStatus(int id)
    {
        return null;
    }

    @Override
    public List<Equipment> getEquipments()
    {
        return null;
    }

    @Override
    public Equipment getEquipment(int id)
    {
        return null;
    }

    @Override
    public void setEquipment(Equipment equipment)
    {

    }

    @Override
    public void deleteEquipment(int id)
    {

    }

    @Override
    public List<EquipmentMaintenance> getEquipmentMaintenanceList(Equipment equipment)
    {
        return null;
    }

    @Override
    public EquipmentMaintenance getEquipmentMaintenance(int id)
    {
        return null;
    }

    @Override
    public void setEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance)
    {

    }

    @Override
    public List<EquipmentSchedule> getEquipmentSchedules(Equipment equipment)
    {
        return null;
    }

    @Override
    public EquipmentSchedule getEquipmentSchedule(int id)
    {
        return null;
    }

    @Override
    public void setEquipmentSchedule(EquipmentSchedule equipmentSchedule)
    {

    }

    @Override
    public List<EquipmentType> getEquipmentTypes()
    {
        return null;
    }

    @Override
    public EquipmentType getEquipmentType(int id)
    {
        return null;
    }

    @Override
    public List<MaterialStock> getMaterialStocks()
    {
        return null;
    }

    @Override
    public List<MaterialStock> getMaterialStocks(MaterialType materialType)
    {
        return null;
    }

    @Override
    public List<MaterialStock> getMaterialStocks(Warehouse warehouse)
    {
        return null;
    }

    @Override
    public MaterialStock getMaterialStock(int id)
    {
        return null;
    }

    @Override
    public void setMaterialStock(MaterialStock materialStock)
    {

    }

    @Override
    public List<MaterialType> getMaterialTypes()
    {
        return null;
    }

    @Override
    public MaterialType getMaterialType(int id)
    {
        return null;
    }

    @Override
    public List<MaterialUsageHistory> getMaterialUsageHistories()
    {
        return null;
    }

    @Override
    public List<MaterialUsageHistory> getMaterialUsageHistories(MaterialType materialType)
    {
        return null;
    }

    @Override
    public List<MaterialUsageHistory> getMaterialUsageHistories(Project project)
    {
        return null;
    }

    @Override
    public MaterialUsageHistory getMaterialUsageHistory(int id)
    {
        return null;
    }

    @Override
    public void setMaterialUsageHistory(MaterialUsageHistory materialUsageHistory)
    {

    }

    @Override
    public List<Transaction> getTransactions()
    {
        return null;
    }

    @Override
    public List<Transaction> getTransactions(TransactionType transactionType)
    {
        return null;
    }

    @Override
    public Transaction getTransaction(int id)
    {
        return null;
    }

    @Override
    public void setTransaction(Transaction transaction)
    {

    }

    @Override
    public List<TransactionType> getTransactionTypes()
    {
        return null;
    }

    @Override
    public TransactionType getTransactionType(int id)
    {
        return null;
    }

    @Override
    public List<Warehouse> getWarehouses()
    {
        return null;
    }

    @Override
    public Warehouse getWarehouse(int id)
    {
        return null;
    }

    @Override
    public List<WarehouseType> getWarehouseTypes()
    {
        return null;
    }

    @Override
    public WarehouseType getWarehouseType(int id)
    {
        return null;
    }

    @Override
    public List<Assignment> getAssignments(Project project)
    {
        return null;
    }

    @Override
    public List<Assignment> getAssignments(Employee employee)
    {
        return null;
    }

    @Override
    public Assignment getAssignment(int id)
    {
        return null;
    }

    @Override
    public void setAssignment(Assignment assignment)
    {

    }

    @Override
    public void deleteAssignment(int id)
    {

    }

    @Override
    public List<Project> getProjects()
    {
        return null;
    }

    @Override
    public List<Project> getProjects(Client client)
    {
        return null;
    }

    @Override
    public List<Project> getProjects(Supervisor supervisor)
    {
        return null;
    }

    @Override
    public List<Project> getProjects(ProjectStatus projectStatus)
    {
        return null;
    }

    @Override
    public Project getProject(int id)
    {
        return null;
    }

    @Override
    public void setProject(Project project)
    {

    }

    @Override
    public List<ProjectNote> getProjectNotes(Project project)
    {
        return null;
    }

    @Override
    public ProjectNote getProjectNote()
    {
        return null;
    }

    @Override
    public void setProjectNote(ProjectNote projectNote)
    {

    }

    @Override
    public List<ProjectSchedule> getProjectSchedules()
    {
        return null;
    }

    @Override
    public List<ProjectSchedule> getProjectSchedules(Project project)
    {
        return null;
    }

    @Override
    public ProjectSchedule getProjectSchedule(int id)
    {
        return null;
    }

    @Override
    public void setProjectSchedule(ProjectSchedule projectSchedule)
    {

    }

    @Override
    public void deleteProjectSchedule(int id)
    {

    }

    @Override
    public List<ProjectStatus> getProjectStatus()
    {
        return null;
    }

    @Override
    public ProjectStatus getProjectStatus(int id)
    {
        return null;
    }

    @Override
    public List<PurchaseHistory> getPurchaseHistories()
    {
        return null;
    }

    @Override
    public List<PurchaseHistory> getPurchaseHistories(Vendor vendor)
    {
        return null;
    }

    @Override
    public List<PurchaseHistory> getPurchaseHistories(MaterialType materialType)
    {
        return null;
    }

    @Override
    public PurchaseHistory getPurchaseHistory(int id)
    {
        return null;
    }

    @Override
    public PurchaseHistory getPurchaseHistory(Transaction transaction)
    {
        return null;
    }

    @Override
    public PurchaseHistory getPurchaseHistory(MaterialStock materialStock)
    {
        return null;
    }

    @Override
    public void setPurchaseHistory(PurchaseHistory purchaseHistory)
    {

    }

    @Override
    public List<Vendor> getVendors()
    {
        return null;
    }

    @Override
    public Vendor getVendor(int id)
    {
        return null;
    }

    @Override
    public void setVendor(Vendor vendor)
    {

    }

    @Override
    public List<VendorBidding> getVendorBiddingList()
    {
        return null;
    }

    @Override
    public List<VendorBidding> getVendorBiddingList(Vendor vendor)
    {
        return null;
    }

    @Override
    public List<VendorBidding> getVendorBiddingList(MaterialType materialType)
    {
        return null;
    }

    @Override
    public VendorBidding getVendorBidding(int id)
    {
        return null;
    }

    @Override
    public void setVendorBidding(VendorBidding vendorBidding)
    {

    }

    @Override
    public void deleteVendorBidding(int id)
    {

    }

    @Override
    public List<VendorStatus> getVendorStatus()
    {
        return null;
    }

    @Override
    public VendorStatus getVendorStatus(int id)
    {
        return null;
    }

    private <K, V> List<V> getValuesAsList(HashMap<K, V> map)
    {
        LinkedList<V> linkedList = new LinkedList<>();
        linkedList.addAll(map.values());
        return linkedList;
    }
}
