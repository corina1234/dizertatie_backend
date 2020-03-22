package com.master.backend.initData;

import com.master.backend.entities.*;
import com.master.backend.enums.Availability;
import com.master.backend.enums.OfficesRoomType;
import com.master.backend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private FloorRepository floorRepository;
    private JobRepository jobRepository;
    private MeetingRoomRepository meetingRoomRepository;
    private OfficeRepository officeRepository;
    private OfficesRoomRepository officesRoomRepository;

    @Autowired
    public DataLoader(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository,
                      FloorRepository floorRepository, JobRepository jobRepository,
                      MeetingRoomRepository meetingRoomRepository, OfficeRepository officeRepository,
                      OfficesRoomRepository officesRoomRepository){
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.floorRepository = floorRepository;
        this.jobRepository = jobRepository;
        this.meetingRoomRepository = meetingRoomRepository;
        this.officeRepository = officeRepository;
        this.officesRoomRepository = officesRoomRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //TODO: add more jobs
        Job javaDev = new Job();
        javaDev.setName("Java Developer");
        jobRepository.save(javaDev);

        Job softDev = new Job();
        softDev.setName("Software Developer");
        jobRepository.save(softDev);

        Job hr = new Job();
        hr.setName("HR");
        jobRepository.save(hr);

        Job po = new Job();
        po.setName("Product Owner");
        jobRepository.save(po);

        Job pm = new Job();
        pm.setName("Project Manager");
        jobRepository.save(pm);

        Job manager = new Job();
        manager.setName("Manager");
        jobRepository.save(manager);

        Job agentVanzari = new Job();
        agentVanzari.setName("Agent Vanzari");
        jobRepository.save(agentVanzari);

        //floors
        Floor parter = new Floor();
        parter.setName("Parter");
        floorRepository.save(parter);

        Floor etaj1 = new Floor();
        etaj1.setName("Etaj 1");
        floorRepository.save(etaj1);

        Floor etaj2 = new Floor();
        etaj2.setName("Etaj 2");
        floorRepository.save(etaj2);

        //departments
        Department developers = new Department();
        developers.setCode("Dev-01-Buc");
        developers.setName("Development & Consulting 1");
        developers.setFloor(parter);
        departmentRepository.save(developers);

        Department productie = new Department();
        productie.setCode("Prod-0X-Buc");
        productie.setName("Productie");
        productie.setFloor(parter);
        departmentRepository.save(productie);

        Department developers2 = new Department();
        developers2.setCode("Dev-02-Buc");
        developers2.setName("Development & Consulting 2");
        developers2.setFloor(etaj1);
        departmentRepository.save(developers2);

        Department consulting = new Department();
        consulting.setCode("Cons-0X-Buc");
        consulting.setName("Consultanta");
        consulting.setFloor(etaj1);
        departmentRepository.save(consulting);

        Department hrDep = new Department();
        hrDep.setCode("HR-0X-Buc");
        hrDep.setName("Human Resources");
        hrDep.setFloor(etaj2);
        departmentRepository.save(hrDep);

        Department accounting = new Department();
        accounting.setCode("Conta-0X-Buc");
        accounting.setName("Contabilitate");
        accounting.setFloor(etaj2);
        departmentRepository.save(accounting);

        Department financiar = new Department();
        financiar.setCode("Fin-0X-Buc");
        financiar.setName("Financiar");
        financiar.setFloor(etaj2);
        departmentRepository.save(financiar);

        Department marketing = new Department();
        marketing.setCode("Mrk-0X-Buc");
        marketing.setName("Marketing");
        marketing.setFloor(etaj2);
        departmentRepository.save(marketing);

        Department procurement = new Department();
        procurement.setCode("Prc-0X-Buc");
        procurement.setName("Procurement");
        procurement.setFloor(etaj2);
        departmentRepository.save(procurement);

        Department vanzari = new Department();
        vanzari.setCode("Vnz-0X-Buc");
        vanzari.setName("Vanzari");
        vanzari.setFloor(etaj2);
        departmentRepository.save(vanzari);

        //meeting rooms
        MeetingRoom mr01 = new MeetingRoom();
        mr01.setCodeId("MR-01");
        mr01.setName("Roma");
        mr01.setAvailability(Availability.AVAILABLE);
        mr01.setFloor(etaj1);
        mr01.setMaxNoPersons(2);
        mr01.setLocationCoordinates("0,0,18%,17%");
        mr01.setDoorCoordinates("M70 -15 50 -15A70 70 0 0 1 70 -25Z");
        meetingRoomRepository.save(mr01);

        MeetingRoom mr02 = new MeetingRoom();
        mr02.setCodeId("MR-02");
        mr02.setName("Madrid");
        mr02.setAvailability(Availability.AVAILABLE);
        mr02.setFloor(etaj1);
        mr02.setMaxNoPersons(5);
        meetingRoomRepository.save(mr02);

        MeetingRoom mr03 = new MeetingRoom();
        mr03.setCodeId("MR-03");
        mr03.setName("Istanbul");
        mr03.setAvailability(Availability.AVAILABLE);
        mr03.setFloor(etaj1);
        mr03.setMaxNoPersons(10);
        meetingRoomRepository.save(mr03);

        MeetingRoom mr04 = new MeetingRoom();
        mr04.setCodeId("MR-04");
        mr04.setName("New York");
        mr04.setAvailability(Availability.BUSY);
        mr04.setFloor(etaj1);
        mr04.setMaxNoPersons(4);
        meetingRoomRepository.save(mr04);

        MeetingRoom mr05 = new MeetingRoom();
        mr05.setCodeId("MR-05");
        mr05.setName("Amsterdam");
        mr05.setAvailability(Availability.BUSY);
        mr05.setFloor(etaj1);
        mr05.setMaxNoPersons(10);
        meetingRoomRepository.save(mr05);

        MeetingRoom mr06 = new MeetingRoom();
        mr06.setCodeId("MR-06");
        mr06.setName("Sydney");
        mr06.setAvailability(Availability.AVAILABLE);
        mr06.setFloor(etaj2);
        mr06.setMaxNoPersons(5);
        meetingRoomRepository.save(mr06);

        MeetingRoom mr07 = new MeetingRoom();
        mr07.setCodeId("MR-07");
        mr07.setName("Londra");
        mr07.setAvailability(Availability.AVAILABLE);
        mr07.setFloor(etaj2);
        mr07.setMaxNoPersons(10);
        meetingRoomRepository.save(mr07);

        MeetingRoom mr08 = new MeetingRoom();
        mr08.setCodeId("MR-08");
        mr08.setName("Barcelona");
        mr08.setAvailability(Availability.BUSY);
        mr08.setFloor(etaj2);
        mr08.setMaxNoPersons(10);
        meetingRoomRepository.save(mr08);

        //offices rooms
        OfficesRoom officesRoom1 = new OfficesRoom();
        officesRoom1.setName("Open Space 1");
        officesRoom1.setFloor(parter);
        officesRoom1.setType(OfficesRoomType.OPEN_SPACE);
        officesRoomRepository.save(officesRoom1);

        OfficesRoom officesRoom2 = new OfficesRoom();
        officesRoom2.setName("Open Space 2");
        officesRoom2.setFloor(etaj1);
        officesRoom2.setType(OfficesRoomType.OPEN_SPACE);
        officesRoomRepository.save(officesRoom2);

        OfficesRoom officesRoom3 = new OfficesRoom();
        officesRoom3.setName("Open Space 3");
        officesRoom3.setFloor(etaj1);
        officesRoom3.setType(OfficesRoomType.OPEN_SPACE);
        officesRoomRepository.save(officesRoom3);

        OfficesRoom officesRoom4 = new OfficesRoom();
        officesRoom4.setName("Open Space 4");
        officesRoom4.setFloor(etaj2);
        officesRoom4.setType(OfficesRoomType.OPEN_SPACE);
        officesRoomRepository.save(officesRoom4);

        OfficesRoom smallRoom1 = new OfficesRoom();
        smallRoom1.setName("SR-01");
        smallRoom1.setFloor(parter);
        smallRoom1.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom1);

        OfficesRoom smallRoom2 = new OfficesRoom();
        smallRoom2.setName("SR-02");
        smallRoom2.setFloor(parter);
        smallRoom2.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom2);

        OfficesRoom smallRoom3 = new OfficesRoom();
        smallRoom3.setName("SR-03");
        smallRoom3.setFloor(etaj2);
        smallRoom3.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom3);

        OfficesRoom smallRoom4 = new OfficesRoom();
        smallRoom4.setName("SR-04");
        smallRoom4.setFloor(etaj2);
        smallRoom4.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom4);

        OfficesRoom smallRoom5 = new OfficesRoom();
        smallRoom5.setName("SR-05");
        smallRoom5.setFloor(etaj2);
        smallRoom5.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom5);

        OfficesRoom smallRoom6 = new OfficesRoom();
        smallRoom6.setName("SR-06");
        smallRoom6.setFloor(etaj2);
        smallRoom6.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom6);

        OfficesRoom smallRoom7 = new OfficesRoom();
        smallRoom7.setName("SR-07");
        smallRoom7.setFloor(etaj2);
        smallRoom7.setType(OfficesRoomType.SMALL_ROOM);
        officesRoomRepository.save(smallRoom7);

        //offices
        //TODO: add more offices
        Office office1 = new Office();
        office1.setName("OS1-01");
        office1.setOfficesRoom(officesRoom1);
        officeRepository.save(office1);

        Office office2 = new Office();
        office2.setName("OS1-02");
        office2.setOfficesRoom(officesRoom1);
        officeRepository.save(office2);

        Office office3 = new Office();
        office3.setName("OS1-03");
        office3.setOfficesRoom(officesRoom1);
        officeRepository.save(office3);

        Office office4 = new Office();
        office4.setName("OS1-04");
        office4.setOfficesRoom(officesRoom1);
        officeRepository.save(office4);

        Office office5 = new Office();
        office5.setName("OS1-05");
        office5.setOfficesRoom(officesRoom1);
        officeRepository.save(office5);

        Office office6 = new Office();
        office6.setName("OS1-06");
        office6.setOfficesRoom(officesRoom1);
        officeRepository.save(office6);

        Office office7 = new Office();
        office7.setName("OS2-01");
        office7.setOfficesRoom(officesRoom2);
        officeRepository.save(office7);

        Office office8 = new Office();
        office8.setName("OS2-02");
        office8.setOfficesRoom(officesRoom2);
        officeRepository.save(office8);

        Office office9 = new Office();
        office9.setName("OS2-03");
        office9.setOfficesRoom(officesRoom2);
        officeRepository.save(office9);

        Office office10 = new Office();
        office10.setName("OS2-04");
        office10.setOfficesRoom(officesRoom2);
        officeRepository.save(office10);

        Office office11 = new Office();
        office11.setName("OS2-05");
        office11.setOfficesRoom(officesRoom2);
        officeRepository.save(office11);

        Office office12 = new Office();
        office12.setName("OS2-06");
        office12.setOfficesRoom(officesRoom2);
        officeRepository.save(office12);

        Office office13 = new Office();
        office13.setName("OS2-07");
        office13.setOfficesRoom(officesRoom2);
        officeRepository.save(office13);

        Office office14 = new Office();
        office14.setName("OS2-08");
        office14.setOfficesRoom(officesRoom2);
        officeRepository.save(office14);

        Office office15 = new Office();
        office15.setName("SM1-01");
        office15.setOfficesRoom(smallRoom1);
        officeRepository.save(office15);

        Office office16 = new Office();
        office16.setName("SM1-02");
        office16.setOfficesRoom(smallRoom1);
        officeRepository.save(office16);

        Office office17 = new Office();
        office17.setName("SM1-03");
        office17.setOfficesRoom(smallRoom1);
        officeRepository.save(office17);

        Office office18 = new Office();
        office18.setName("SM1-04");
        office18.setOfficesRoom(smallRoom1);
        officeRepository.save(office18);

        Office office19 = new Office();
        office19.setName("OS4-01");
        office19.setOfficesRoom(officesRoom4);
        officeRepository.save(office19);

        Office office20 = new Office();
        office20.setName("OS4-02");
        office20.setOfficesRoom(officesRoom4);
        officeRepository.save(office20);

        Office office21 = new Office();
        office21.setName("SR3-01");
        office21.setOfficesRoom(smallRoom3);
        officeRepository.save(office21);

        //employees
        //TODO: add more employees !setDepartment + setOffice
        Employee generalManager = new Employee();
        generalManager.setName("Heilberg John");
        generalManager.setEmail("john.heilberg@yahoo.com");
        generalManager.setPhoneNumber("+407119410");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990,5,1);
        Date startDate = calendar.getTime();
        generalManager.setDateOfEmployment(startDate);
        //  managerVanzari.setOffice(office19);
        generalManager.setJob(manager);
        employeeRepository.save(generalManager);

        Employee managerVanzari = new Employee();
        managerVanzari.setName("Antonescu Sebastian");
        managerVanzari.setEmail("sebastian.antonescu@yahoo.com");
        managerVanzari.setPhoneNumber("+407129410");
        calendar = Calendar.getInstance();
        calendar.set(2001,7,1);
        startDate = calendar.getTime();
        managerVanzari.setDateOfEmployment(startDate);
        managerVanzari.setDepartment(vanzari);
      //  managerVanzari.setOffice(office19);
        managerVanzari.setJob(manager);
        managerVanzari.setManager(generalManager);
        employeeRepository.save(managerVanzari);

        Employee agentVanzari1 = new Employee();
        agentVanzari1.setName("Popescu Maria");
        agentVanzari1.setEmail("maria.popescu@yahoo.com");
        agentVanzari1.setPhoneNumber("+407129420");
        calendar.set(2010,7,1);
        startDate = calendar.getTime();
        agentVanzari1.setDateOfEmployment(startDate);
        agentVanzari1.setDepartment(vanzari);
        agentVanzari1.setOffice(office19);
        agentVanzari1.setJob(agentVanzari);
        agentVanzari1.setManager(managerVanzari);
        employeeRepository.save(agentVanzari1);

        Employee managerAccounting = new Employee();
        managerAccounting.setName("Ionescu Simona");
        managerAccounting.setEmail("simona.ionescu@yahoo.com");
        managerAccounting.setPhoneNumber("+407129421");
        calendar.set(2015,2,10);
        managerAccounting.setDateOfEmployment(calendar.getTime());
        managerAccounting.setDepartment(accounting);
        managerAccounting.setOffice(office21);
        managerAccounting.setJob(manager);
        managerAccounting.setManager(generalManager);
        employeeRepository.save(managerAccounting);

        Employee managerHR = new Employee();
        managerHR.setName("Andrei Ingrid");
        managerHR.setEmail("ingrid.andrei@yahoo.com");
        managerHR.setPhoneNumber("+407129422");
        calendar.set(2019,5,10);
        managerHR.setDateOfEmployment(calendar.getTime());
        managerHR.setDepartment(hrDep);
        managerHR.setOffice(office20);
        managerHR.setJob(manager);
        managerHR.setManager(generalManager);
        employeeRepository.save(managerHR);

        Employee managerConsulting = new Employee();
        managerConsulting.setName("Soare Anastasia");
        managerConsulting.setEmail("anastasia.soare@yahoo.com");
        managerConsulting.setPhoneNumber("+407129423");
        calendar.set(2002,12,1);
        managerConsulting.setDateOfEmployment(calendar.getTime());
        managerConsulting.setDepartment(consulting);
       // managerConsulting.setOffice(office7);
        managerConsulting.setJob(manager);
        managerConsulting.setManager(generalManager);
        employeeRepository.save(managerConsulting);

        Employee pmConsulting = new Employee();
        pmConsulting.setName("Tudor Evelin");
        pmConsulting.setEmail("evelin.tudor@yahoo.com");
        pmConsulting.setPhoneNumber("+407129423");
        calendar.set(2006,12,1);
        pmConsulting.setDateOfEmployment(calendar.getTime());
        pmConsulting.setDepartment(consulting);
        pmConsulting.setOffice(office7);
        pmConsulting.setJob(pm);
        pmConsulting.setManager(managerConsulting);
        employeeRepository.save(pmConsulting);

        Employee javaDevConsulting = new Employee();
        javaDevConsulting.setName("Stan Marcel");
        javaDevConsulting.setEmail("marcel.stan@yahoo.com");
        javaDevConsulting.setPhoneNumber("+407129424");
        calendar.set(2000,3,1);
        javaDevConsulting.setDateOfEmployment(calendar.getTime());
        javaDevConsulting.setDepartment(consulting);
        javaDevConsulting.setOffice(office8);
        javaDevConsulting.setJob(javaDev);
        pmConsulting.setManager(managerConsulting);
        employeeRepository.save(javaDevConsulting);

        Employee softDevConsulting = new Employee();
        softDevConsulting.setName("Pop Andrei");
        softDevConsulting.setEmail("andrei.pop@yahoo.com");
        softDevConsulting.setPhoneNumber("+407129425");
        calendar.set(2019,5,15);
        softDevConsulting.setDateOfEmployment(calendar.getTime());
        softDevConsulting.setDepartment(consulting);
        softDevConsulting.setJob(softDev);
        softDevConsulting.setOffice(office9);
        pmConsulting.setManager(managerConsulting);
        employeeRepository.save(softDevConsulting);

    }
}
