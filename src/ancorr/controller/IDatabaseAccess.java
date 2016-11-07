package ancorr.controller;

import ancorr.model.client.*;
import ancorr.model.contact.*;
import ancorr.model.employee.*;
import ancorr.model.inventory.*;
import ancorr.model.project.*;
import ancorr.model.vendor.*;
import java.util.List;

/**
* Setter methods are responsible for creating and altering data, but not deleting data, null check is not required.<br>
* argument of setter methods may not contain an ID, which means it needs to be created.<br>
* Getter methods which requires a list as return type are responsible to get all the data entry of a type,<br> 
* or all data related to a given argument(if exists)<br>
* Getter methods that return a list will never return null, if no data is found, an empty list should be returned.
*/
public interface IDatabaseAccess
{
	//Client: ///////////////////////////////
	List<Appointment> getAppointments();
	Appointment getAppointment(int id);
	void setAppointment(Appointment appointment);
	
	List<Client> getClients();
	Client getClient(int id);
	void setClient(Client client);
	
	List<ClientBill> getClientBills();
	List<ClientBill> getClientBills(Client client);
	ClientBill getClientBill(int id);
	void setClientBill(ClientBill clientBill);
	
	List<ClientBillStatus> getClientBillStatus();
	ClientBillStatus getClientBillStatus(int id);
	
	List<ClientStatus> getClientStatus();
	ClientStatus getClientStatus(int id);
	
	//Contact: ///////////////////////////////////
	Address getAddress(int id);
	Address getAddress(Contact contact);
	void setAddress(Address address);
	
	List<City> getCities();
	City getCity(int id);
	void setCity(City city);
	
	Contact getContact(int id);
	void setContact(Contact contact);
	
	List<Country> getCountries();
	Country getCountry(int id);
	void setCountry(Country country);
	
	List<StateOrProvince> getStateOrProvinces();
	StateOrProvince getStateOrProvince(int id);
	void setStateOrProvince(StateOrProvince stateOrProvince);
	
	List<ZipCode> getZipCodes();
	ZipCode getZipCode(int id);
	void setZipCode(ZipCode zipCode);
	
	//Employee: ////////////////////////////
	List<Employee> getEmployees();
	Employee getEmployee(int id);
	void setEmployee(Employee employee);
	
	List<EmployeeBenefitType> getEmployeeBenefitTypes();
	EmployeeBenefitType getEmployeeBenefitType(int id);
	
	EmployeeBenefit getEmployeeBenefit(int id);
	void setEmployeeBenefit(EmployeeBenefit employeeBenefit);
	void deleteEmployeeBenefit(int id);
	
	List<EmployeeJobHistory> getEmployeeJobHistories(Employee employee);
	EmployeeJobHistory getEmployeeJobHistory(int id);
	void setEmployeeJobHistory(EmployeeJobHistory employeeJobHistory);
	
	List<EmployeeMedicalRecord> getEmployeeMedicalRecords(Employee employee);
	EmployeeMedicalRecord getEmployeeMedicalRecord(int id);
	void setEmployeeMedicalRecord(EmployeeMedicalRecord employeeMedicalRecord);
	
	EmployeeSchedule getEmployeeSchedule(int id);
	EmployeeSchedule getEmployeeSchedule(Employee employee);
	void setEmployeeSchedule(EmployeeSchedule EmployeeSchedule);
	void deleteEmployeeSchedule(int id);
	
	List<EmployeeShift> getEmployeeShifts(EmployeeSchedule EmployeeSchedule);
	EmployeeShift getEmployeeShift(int id);
	void setEmployeeShift(EmployeeShift employeeShift);
	void deleteEmployeeShift(int id);
	
	List<EmployeeStatus> getEmployeeStatus();
	EmployeeStatus getEmployeeStatus(int id);
	
	List<Payroll> getPayrolls(Employee employee);
	Payroll getPayroll(int id);
	void setPayroll(Payroll payroll);
	
	List<Position> getPositions();
	Position getPosition(int id);
	
	List<Supervisor> getSupervisors();
	Supervisor getSupervisor(int id);
	void setSupervisor(Supervisor supervisor);
	void deleteSupervisor(int id);
	
	List<SupervisorStatus> getSupervisorStatus();
	SupervisorStatus getSupervisorStatus(int id);

	List<SystemUser> getSystemUsers();
	SystemUser getSystemUser(int id);
	/**
	 * use WHERE to find the systemUser, if not found, return null.
	 */
	SystemUser getSystemUser(String username, String password);
	void setSystemUser(SystemUser systemUser);
	void deleteSystemUser(int id);
	
	List<SystemUserStatus> getSystemUserStatus();
	SystemUserStatus getSystemUserStatus(int id);
	
	//Inventory: ///////////////////////////
	List<Equipment> getEquipments();
	Equipment getEquipment(int id);
	void setEquipment(Equipment equipment);
	void deleteEquipment(int id);
	
	List<EquipmentMaintenance> getEquipmentMaintenanceList(Equipment equipment);
	EquipmentMaintenance getEquipmentMaintenance(int id);
	void setEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance);
	
	List<EquipmentSchedule> getEquipmentSchedules(Equipment equipment);
	EquipmentSchedule getEquipmentSchedule(int id);
	void setEquipmentSchedule(EquipmentSchedule equipmentSchedule);
	
	List<EquipmentType> getEquipmentTypes();
	EquipmentType getEquipmentType(int id);
	
	List<MaterialStock> getMaterialStocks();
	List<MaterialStock> getMaterialStocks(MaterialType materialType);
	List<MaterialStock> getMaterialStocks(Warehouse warehouse);
	MaterialStock getMaterialStock(int id);
	void setMaterialStock(MaterialStock materialStock);
	
	List<MaterialType> getMaterialTypes();
	MaterialType getMaterialType(int id);
	
	List<MaterialUsageHistory> getMaterialUsageHistories();
	List<MaterialUsageHistory> getMaterialUsageHistories(MaterialType materialType);
	List<MaterialUsageHistory> getMaterialUsageHistories(Project project);
	MaterialUsageHistory getMaterialUsageHistory(int id);
	void setMaterialUsageHistory(MaterialUsageHistory materialUsageHistory);
	
	List<Transaction> getTransactions();
	List<Transaction> getTransactions(TransactionType transactionType);
	Transaction getTransaction(int id);
	void setTransaction(Transaction transaction);
	
	List<TransactionType> getTransactionTypes();
	TransactionType getTransactionType(int id);
	
	List<Warehouse> getWarehouses();
	Warehouse getWarehouse(int id);
	
	List<WarehouseType> getWarehouseTypes();
	WarehouseType getWarehouseType(int id);
	
	//project: ////////////////////////////////
	
	List<Assignment> getAssignments(Project project);
	List<Assignment> getAssignments(Employee employee);
	Assignment getAssignment(int id);
	void setAssignment(Assignment assignment);
	void deleteAssignment(int id);
	
	List<Project> getProjects();
	List<Project> getProjects(Client client);
	List<Project> getProjects(Supervisor supervisor);
	List<Project> getProjects(ProjectStatus projectStatus);
	Project getProject(int id);
	void setProject(Project project);
	
	//List<ProjectNote> getProjectNotes();
	List<ProjectNote> getProjectNotes(Project project);
	ProjectNote getProjectNote();
	void setProjectNote(ProjectNote projectNote);
	
	List<ProjectSchedule> getProjectSchedules();
	List<ProjectSchedule> getProjectSchedules(Project project);
	ProjectSchedule getProjectSchedule(int id);
	void setProjectSchedule(ProjectSchedule projectSchedule);
	void deleteProjectSchedule(int id);
	
	List<ProjectStatus> getProjectStatus();
	ProjectStatus getProjectStatus(int id);
	
	//Vendor: ///////////////////////////
	List<PurchaseHistory> getPurchaseHistories();
	List<PurchaseHistory> getPurchaseHistories(Vendor vendor);
	List<PurchaseHistory> getPurchaseHistories(MaterialType materialType);
	PurchaseHistory getPurchaseHistory(int id);
	PurchaseHistory getPurchaseHistory(Transaction transaction);
	PurchaseHistory getPurchaseHistory(MaterialStock materialStock);
	void setPurchaseHistory(PurchaseHistory purchaseHistory);
	
	List<Vendor> getVendors();
	Vendor getVendor(int id);
	void setVendor(Vendor vendor);
	
	List<VendorBidding> getVendorBiddingList();
	List<VendorBidding> getVendorBiddingList(Vendor vendor);
	List<VendorBidding> getVendorBiddingList(MaterialType materialType);
	VendorBidding getVendorBidding(int id);
	void setVendorBidding(VendorBidding vendorBidding);
	void deleteVendorBidding(int id);
	
	List<VendorStatus> getVendorStatus();
	VendorStatus getVendorStatus(int id);
}
