package ancorr.controller;

import ancorr.model.client.*;
import ancorr.model.contact.*;
import ancorr.model.employee.*;
import ancorr.model.inventory.*;
import ancorr.model.project.*;
import ancorr.model.vendor.*;

import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestDatabaseAccess implements IDatabaseAccess
{

	@Override
	public void deleteAppointment(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteClient(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteClientBill(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteEmployee(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteEmployeeJobHistory(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteEmployeeMedicalRecord(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deletePayroll(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteEquipmentMaintenance(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteEquipmentSchedule(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteMaterialStock(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteMaterialUsageHistory(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteTransaction(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void setWarehouse(Warehouse warehouse)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteWarehouse(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteProject(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteProjectNote(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deletePurchaseHistory(int id)
	{
		// TODO: Implement this method
	}

	@Override
	public void deleteVendor(int id)
	{
		// TODO: Implement this method
	}
	
    HashMap<Integer, Appointment> appointmentHashMap = new HashMap<>();
    {
        Appointment appointment = new Appointment();
        appointment.id = appointmentHashMap.size();
        appointment.clientId = 0;
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
            appointment.id = appointmentHashMap.size();
        }

        appointmentHashMap.put(appointment.id, appointment);
    }

    private final HashMap<Integer, Client> clients = new HashMap<>();
    {
        Client testClient = new Client();
        testClient.id = clients.size();
        testClient.firstName = "Hurry";
        testClient.lastName = "Botter";
        testClient.clientStatusId = 0;
        testClient.contactId = 0;
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
            client.id = clients.size();
        }

        clients.put(client.id, client);
    }

    private final HashMap<Integer, ClientBill> clientBills = new HashMap<>();
    {
        ClientBill bill = new ClientBill();
        bill.id = clientBills.size();
        bill.billStatusId = 0;
        bill.clientId = 0;
        bill.clientPaymentInfo = "NO MONEY PAID!";
        bill.transactionId = 0;
        clientBills.put(bill.id, bill);
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
            clientBill.id = clientBills.size();
        }
        clientBills.put(clientBill.id, clientBill);
    }

    private final HashMap<Integer, ClientBillStatus> clientBillStatusHashMap = new HashMap<>();
    {
        ClientBillStatus paid = new ClientBillStatus();
        paid.id = clientBillStatusHashMap.size();
        paid.description = "paid";

        clientBillStatusHashMap.put(paid.id, paid);

        ClientBillStatus unpaid = new ClientBillStatus();
        unpaid.id = clientBillStatusHashMap.size();
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
	
	private final HashMap<Integer, ClientStatus> clientStatusHashMap = new HashMap<>();
	{
		ClientStatus clientStatus = new ClientStatus();
		clientStatus.id = clientStatusHashMap.size();
		clientStatus.description = "active";
	}
	
    @Override
    public List<ClientStatus> getClientStatus()
    {
        return this.getValuesAsList(clientStatusHashMap);
    }

    @Override
    public ClientStatus getClientStatus(int id)
    {
        return clientStatusHashMap.get(id);
    }
	
	private final HashMap<Integer, Address> addressHashMap = new HashMap<>();
	{
		Address address = new Address();
		address.id = addressHashMap.size();
		address.street = "12345 Bob white";
		address.zipCodeId = 0;
		address.countryId = 0;
		address.cityId = 0;
		address.stateOrProvinceId = 0;
		addressHashMap.put(address.id, address);
	}
	
    @Override
    public Address getAddress(int id)
    {
        return addressHashMap.get(id);
    }

    @Override
    public void setAddress(Address address)
    {
		if(address.id == null)
		{
			address.id = addressHashMap.size();
		}
		
		addressHashMap.put(address.id, address);
    }
	
	private final HashMap<Integer, City> cityHashMap = new HashMap<>();
	{
		City city = new City();
		city.id = cityHashMap.size();
		city.cityName = "Houston";
		cityHashMap.put(city.id, city);
	}

    @Override
    public List<City> getCities()
    {
        return getValuesAsList(cityHashMap);
    }

    @Override
    public City getCity(int id)
    {
        return cityHashMap.get(id);
    }

    @Override
    public void setCity(City city)
    {
		if(city.id == null)
		{
			city.id = cityHashMap.size();
		}
		
		cityHashMap.put(city.id, city);
    }

	private final HashMap<Integer, Contact> contactHashMap = new HashMap<>();
	{
		Contact contact = new Contact();
		contact.addressId = 0;
		contact.phone = "832-888-1234";
		contact.email = "bob@lamemail.com";
		setContact(contact);
	}
	
    @Override
    public Contact getContact(int id)
    {
        return contactHashMap.get(id);
    }

    @Override
    public void setContact(Contact contact)
    {
		if(contact.id == null)
		{
			contact.id = contactHashMap.size();
		}
		
		contactHashMap.put(contact.id, contact);
    }

	private final HashMap<Integer, Country> countryHashMap = new HashMap<>();
	{
		Country country = new Country();
		country.countryName = "USA";
		setCountry(country);
	}
	
    @Override
    public List<Country> getCountries()
    {
        return getValuesAsList(countryHashMap);
    }

    @Override
    public Country getCountry(int id)
    {
        return countryHashMap.get(id);
    }

    @Override
    public void setCountry(Country country)
    {
		if(country.id == null)
		{
			country.id = countryHashMap.size();
		}
		
		countryHashMap.put(country.id, country);
    }

	private final HashMap<Integer, StateOrProvince> stateorProvinceHashMap = new HashMap<>();
	{
		StateOrProvince state = new StateOrProvince();
		state.stateOrProvinceName = "texas";
		setStateOrProvince(state);
	}
	
    @Override
    public List<StateOrProvince> getStateOrProvinces()
    {
        return getValuesAsList(stateorProvinceHashMap);
    }

    @Override
    public StateOrProvince getStateOrProvince(int id)
    {
        return stateorProvinceHashMap.get(id);
    }

    @Override
    public void setStateOrProvince(StateOrProvince stateOrProvince)
    {
		if(stateOrProvince.id == null)
		{
			stateOrProvince.id = stateorProvinceHashMap.size();
		}
		
		stateorProvinceHashMap.put(stateOrProvince.id, stateOrProvince);
    }

	private final HashMap<Integer, ZipCode> zipCodeHashMap = new HashMap<>();
	{
		ZipCode zip = new ZipCode();
		zip.zipCode = 74848;
		setZipCode(zip);
	}	
	
    @Override
    public List<ZipCode> getZipCodes()
    {
        return getValuesAsList(zipCodeHashMap);
    }

    @Override
    public ZipCode getZipCode(int id)
    {
        return zipCodeHashMap.get(id);
    }

    @Override
    public void setZipCode(ZipCode zipCode)
    {
		zipCodeHashMap.put(zipCode.id, zipCode);
    }

	private final HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
	{
		Employee employee = new Employee();
		employee.firstName = "Zerg";
		employee.lastName = "Overlord";
		employee.employeeStatusId = 0;
		employee.positionId = 0;
		employee.scheduleId = 0;
		setEmployee(employee);
	}
	
    @Override
    public List<Employee> getEmployees()
    {
        return getValuesAsList(employeeHashMap);
    }

    @Override
    public Employee getEmployee(int id)
    {
        return employeeHashMap.get(id);
    }

    @Override
    public void setEmployee(Employee employee)
    {
		if(employee.id == null)
		{
			employee.id = employeeHashMap.size();
		}
		
		employeeHashMap.put(employee.id, employee);
    }

	private final HashMap<Integer, EmployeeBenefitType> employeeBenefitTypeHashMap = new HashMap<>();
	{
		EmployeeBenefitType medical = new EmployeeBenefitType();
		medical.type = "medical";
		medical.id = employeeBenefitTypeHashMap.size();
		employeeBenefitTypeHashMap.put(medical.id, medical);
	}
	
    @Override
    public List<EmployeeBenefitType> getEmployeeBenefitTypes()
    {
        return getValuesAsList(employeeBenefitTypeHashMap);
    }

    @Override
    public EmployeeBenefitType getEmployeeBenefitType(int id)
    {
        return employeeBenefitTypeHashMap.get(id);
    }

	private final HashMap<Integer, EmployeeBenefit> employeeBenefitHashMap = new HashMap<>();
	{
		EmployeeBenefit benefit = new EmployeeBenefit();
		benefit.employeeId = 0;
		benefit.employeeBenefitTypeId = 0;
		setEmployeeBenefit(benefit);
	}
	
    @Override
    public EmployeeBenefit getEmployeeBenefit(int id)
    {
        return employeeBenefitHashMap.get(id);
    }

    @Override
    public void setEmployeeBenefit(EmployeeBenefit employeeBenefit)
    {
		if(employeeBenefit.id == null)
		{
			employeeBenefit.id = employeeBenefitHashMap.size();
		}
		
		employeeBenefitHashMap.put(employeeBenefit.id, employeeBenefit);
    }

    @Override
    public void deleteEmployeeBenefit(int id)
    {
		employeeBenefitHashMap.remove(id);
    }
	
	private final HashMap<Integer, EmployeeJobHistory> employeeJobHistoryHashMap = new HashMap<>();
	{
		EmployeeJobHistory job = new EmployeeJobHistory();
		job.duties = "douchebag";
		job.evaluation = "very douchey";
		setEmployeeJobHistory(job);
	}

    @Override
    public List<EmployeeJobHistory> getEmployeeJobHistories(Employee employee)
    {
        return getValuesAsList(employeeJobHistoryHashMap);
    }

    @Override
    public EmployeeJobHistory getEmployeeJobHistory(int id)
    {
        return employeeJobHistoryHashMap.get(id);
    }

    @Override
    public void setEmployeeJobHistory(EmployeeJobHistory employeeJobHistory)
    {
		if(employeeJobHistory.id == null)
		{
			employeeJobHistory.id = employeeJobHistoryHashMap.size();
		}
		
		employeeJobHistoryHashMap.put(employeeJobHistory.id, employeeJobHistory);
    }

	private final HashMap<Integer, EmployeeMedicalRecord> employeeMedicalRecordHashMap = new HashMap<>();
	{
		EmployeeMedicalRecord record = new EmployeeMedicalRecord();
		record.employeeId = 0;
		record.conditions = "ass cancer";
		record.insuranceProvider = "KIA insurance";
		record.physician = "Dr.strange(after the crash)";
		setEmployeeMedicalRecord(record);
	}
	
    @Override
    public List<EmployeeMedicalRecord> getEmployeeMedicalRecords(Employee employee)
    {
		List<EmployeeMedicalRecord> list = new LinkedList<>();
		for(EmployeeMedicalRecord record : employeeMedicalRecordHashMap.values())
		{
			if(record.employeeId == employee.id)
			{
				list.add(record);
			}
		}
        return list;
    }

    @Override
    public EmployeeMedicalRecord getEmployeeMedicalRecord(int id)
    {
        return employeeMedicalRecordHashMap.get(id);
    }

    @Override
    public void setEmployeeMedicalRecord(EmployeeMedicalRecord employeeMedicalRecord)
    {
		if(employeeMedicalRecord.id == null)
		{
			employeeMedicalRecord.id = employeeMedicalRecordHashMap.size();
		}
		
		employeeMedicalRecordHashMap.put(employeeMedicalRecord.id, employeeMedicalRecord);
    }

	private final HashMap<Integer, EmployeeSchedule> employeeScheduleHashMap = new HashMap<>();
	{
			EmployeeSchedule schedule = new EmployeeSchedule();
			schedule.overTimeHours = new Time(2,3,3);
			schedule.regularHours = new Time(6,6,6);
			schedule.employeeId = 0;
			setEmployeeSchedule(schedule);
	}
	
    @Override
    public EmployeeSchedule getEmployeeSchedule(int id)
    {
        return employeeScheduleHashMap.get(id);
    }

    @Override
    public void setEmployeeSchedule(EmployeeSchedule employeeSchedule)
    {
		if(employeeSchedule.id == null)
		{
			employeeSchedule.id = employeeScheduleHashMap.size();
		}
		
		employeeScheduleHashMap.put(employeeSchedule.id, employeeSchedule);
    }

    @Override
    public void deleteEmployeeSchedule(int id)
    {
		employeeScheduleHashMap.remove(id);
    }

	private final HashMap<Integer, EmployeeShift> employeeShiftHashMap = new HashMap<>();
	{
		EmployeeShift shift = new EmployeeShift();
		shift.endDate = new Date(2020, 9, 30);
		shift.endTime = new Time(3,3,3);
		shift.startDate = new Date(2015, 2, 5);
		shift.startTime = new Time(3,5,6);
		shift.scheduleId = 0;
		setEmployeeShift(shift);
	}
	
    @Override
    public List<EmployeeShift> getEmployeeShifts(EmployeeSchedule EmployeeSchedule)
    {
		List<EmployeeShift> list = new LinkedList<>();
		for(EmployeeShift shift : employeeShiftHashMap.values())
		{
			if(shift.scheduleId == EmployeeSchedule.id)
			{
				list.add(shift);
			}
		}
        return list;
    }

    @Override
    public EmployeeShift getEmployeeShift(int id)
    {
        return employeeShiftHashMap.get(id);
    }

    @Override
    public void setEmployeeShift(EmployeeShift employeeShift)
    {
		if(employeeShift.id == null)
		{
			employeeShift.id = employeeShiftHashMap.size();
		}
		
		employeeShiftHashMap.put(employeeShift.id, employeeShift);
    }

    @Override
    public void deleteEmployeeShift(int id)
    {
		employeeShiftHashMap.remove(id);
    }

	private final HashMap<Integer, EmployeeStatus> employeeStatusHashMap = new HashMap<>();
	{
		EmployeeStatus status = new EmployeeStatus();
		status.id = employeeStatusHashMap.size();
		status.description = "alive";
		employeeStatusHashMap.put(status.id, status);
	}
	
    @Override
    public List<EmployeeStatus> getEmployeeStatus()
    {
        return getValuesAsList(employeeStatusHashMap);
    }

    @Override
    public EmployeeStatus getEmployeeStatus(int id)
    {
        return employeeStatusHashMap.get(id);
    }

	private final HashMap<Integer, Payroll> payrollHashMap = new HashMap<>();
	{
		Payroll payroll = new Payroll();
		payroll.amount = 200;
		payroll.employeeId = 0;
		payroll.transactionId = 0;
		setPayroll(payroll);
	}
	
    @Override
    public List<Payroll> getPayrolls(Employee employee)
    {
		List<Payroll> list = new LinkedList<>();
		for(Payroll payroll : payrollHashMap.values())
		{
			if(payroll.employeeId == employee.id)
			{
				list.add(payroll);
			}
		}
        return list;
    }

    @Override
    public Payroll getPayroll(int id)
    {
        return payrollHashMap.get(id);
    }

    @Override
    public void setPayroll(Payroll payroll)
    {
		if(payroll.id == null)
		{
			payroll.id = payrollHashMap.size();
		}
		
		payrollHashMap.put(payroll.id, payroll);
    }

	private final HashMap<Integer, Position> positionHashMap = new HashMap<>();
	{
		Position position = new Position();
		position.description = "dog";
		position.id = positionHashMap.size();
		positionHashMap.put(position.id, position);
	}
	
    @Override
    public List<Position> getPositions()
    {
        return getValuesAsList(positionHashMap);
    }

    @Override
    public Position getPosition(int id)
    {
        return positionHashMap.get(id);
    }

	private final HashMap<Integer, Supervisor> supervisorHashMap = new HashMap<>();
	{
	}
		
	
    @Override
    public List<Supervisor> getSupervisors()
    {
        return getValuesAsList(supervisorHashMap);
    }
	
	public Supervisor getSupervisor(Employee employee)
	{
		for(Supervisor supervisor: supervisorHashMap.values())
		{
			if(supervisor.employeeId == employee.id)
				return supervisor;
		}
		
		return null;
	}

    @Override
    public Supervisor getSupervisor(int id)
    {
        return supervisorHashMap.get(id);
    }

    @Override
    public void setSupervisor(Supervisor supervisor)
    {
		if(supervisor.id == null)
		{
			supervisor.id = supervisorHashMap.size();
		}
		
		supervisorHashMap.put(supervisor.id, supervisor);
    }

    @Override
    public void deleteSupervisor(int id)
    {
		supervisorHashMap.remove(id);
    }

	private final HashMap<Integer, SupervisorStatus> supervisorStatusHashMap = new HashMap<>();
	{
		SupervisorStatus status = new SupervisorStatus();
		status.description = "active";
		status.id = supervisorHashMap.size();
		supervisorStatusHashMap.put(status.id, status);
	}
	
    @Override
    public List<SupervisorStatus> getSupervisorStatus()
    {
        return getValuesAsList(supervisorStatusHashMap);
    }

    @Override
    public SupervisorStatus getSupervisorStatus(int id)
    {
        return supervisorStatusHashMap.get(id);
    }

    private final HashMap<Integer, SystemUser> systemUsers = new HashMap<>();

    {
        SystemUser systemUser = new SystemUser();
        systemUser.username = "admin";
        systemUser.password = "admin";
        systemUser.employeeId = 0;
        systemUser.systemUserStatusId = 0;

        setSystemUser(systemUser);
    }

    @Override
    public List<SystemUser> getSystemUsers()
    {
        return getValuesAsList(systemUsers);
    }

    @Override
    public SystemUser getSystemUser(int id)
    {
        return systemUsers.get(id);
    }
	
	@Override
	public SystemUser getSystemUser(Employee employee)
	{
		for(SystemUser systemUser : systemUsers.values())
		{
			if(systemUser.employeeId == employeeId)
			{
				return systemUser;
			}
		}
		return null;
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
		if(systemUser.id == null)
		{
			systemUser.id = systemUsers.size();
		}
		
        systemUsers.put(systemUser.id, systemUser);
    }

    @Override
    public void deleteSystemUser(int id)
    {
        systemUsers.remove(id);
    }

	private final HashMap<Integer, SystemUserStatus> systemUserStatusHashMap = new HashMap<>();
	{
		SystemUserStatus status = new SystemUserStatus();
		status.description = "active";
		status.id = systemUserStatusHashMap.size();
		systemUserStatusHashMap.put(status.id, status);
	}
	
    @Override
    public List<SystemUserStatus> getSystemUserStatus()
    {
        return getValuesAsList(systemUserStatusHashMap);
    }

    @Override
    public SystemUserStatus getSystemUserStatus(int id)
    {
        return systemUserStatusHashMap.get(id);
    }
	
	private final HashMap<Integer, Equipment> equipmentHashMap = new HashMap<>();
	{
		
	}
	
    @Override
    public List<Equipment> getEquipments()
    {
        return getValuesAsList(equipmentHashMap);
    }

    @Override
    public Equipment getEquipment(int id)
    {
        return equipmentHashMap.get(id);
    }

    @Override
    public void setEquipment(Equipment equipment)
    {
		if(equipment.id == null)
		{
			equipment.id = equipmentHashMap.size();
		}
		
		equipmentHashMap.put(equipment.id, equipment);
    }

    @Override
    public void deleteEquipment(int id)
    {
		equipmentHashMap.remove(id);
    }

	private final HashMap<Integer, EquipmentMaintenance> equipmentMaintenanceHashMap = new HashMap<>();
	
    @Override
    public List<EquipmentMaintenance> getEquipmentMaintenanceList(Equipment equipment)
    {
        return getValuesAsList(equipmentMaintenanceHashMap);
    }

    @Override
    public EquipmentMaintenance getEquipmentMaintenance(int id)
    {
        return equipmentMaintenanceHashMap.get(id);
    }

    @Override
    public void setEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance)
    {
		if(equipmentMaintenance.id == null)
		{
			equipmentMaintenance.id = equipmentMaintenanceHashMap.size();
		}
		
		equipmentMaintenanceHashMap.put(equipmentMaintenance.id, equipmentMaintenance);
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
