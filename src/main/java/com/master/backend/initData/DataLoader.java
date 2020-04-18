package com.master.backend.initData;

import com.master.backend.entities.*;
import com.master.backend.enums.OfficesRoomType;
import com.master.backend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private FloorRepository floorRepository;
    private JobRepository jobRepository;
    private MeetingRoomRepository meetingRoomRepository;
    private OfficeRepository officeRepository;
    private OfficesRoomRepository officesRoomRepository;

    private BCryptPasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder;
    }

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
        Job javaDev = new Job();
        javaDev.setName("Java Developer");
        jobRepository.save(javaDev);

        Job softDev = new Job();
        softDev.setName("Software Developer");
        jobRepository.save(softDev);

        Job webDev = new Job();
        webDev.setName("Web Developer");
        jobRepository.save(webDev);

        Job hanaDev = new Job();
        hanaDev.setName("Hana Developer");
        jobRepository.save(hanaDev);

        Job fioriDev = new Job();
        fioriDev.setName("Fiori Developer");
        jobRepository.save(fioriDev);

        Job abapDev = new Job();
        abapDev.setName("Abap Developer");
        jobRepository.save(abapDev);

        Job businessAnalist = new Job();
        businessAnalist.setName("Business Analyst");
        jobRepository.save(businessAnalist);

        Job techLead = new Job();
        techLead.setName("Technical Leader");
        jobRepository.save(techLead);

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

        Job contabil = new Job();
        contabil.setName("Contabil");
        jobRepository.save(contabil);

        Job analistFinanciar = new Job();
        analistFinanciar.setName("Analist Financiar");
        jobRepository.save(analistFinanciar);

        Job analistProductie = new Job();
        analistProductie.setName("Analist Productie");
        jobRepository.save(analistProductie);

        Job coordonatorMarketing = new Job();
        coordonatorMarketing.setName("Coordonator Marketing");
        jobRepository.save(coordonatorMarketing);

        Job analistSAPFi = new Job();
        analistSAPFi.setName("Analist SAP FI");
        jobRepository.save(analistSAPFi);

        Job analistSAPCO = new Job();
        analistSAPCO.setName("Analist SAP CO");
        jobRepository.save(analistSAPCO);

        Job analistSAPSales = new Job();
        analistSAPSales.setName("Analist SAP SD");
        jobRepository.save(analistSAPSales);

        Job analistConcur = new Job();
        analistConcur.setName("Analist Concur");
        jobRepository.save(analistConcur);

        Job consultantSAPPM = new Job();
        consultantSAPPM.setName("Consultant SAP PM");
        jobRepository.save(consultantSAPPM);

        Job expertSEO = new Job();
        expertSEO.setName("Expert SEO");
        jobRepository.save(expertSEO);

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

        //meeting rooms
        MeetingRoom mr01 = new MeetingRoom();
        mr01.setCodeId("MR-01");
        mr01.setName("Roma");
        mr01.setFloor(etaj1);
        mr01.setMaxNoPersons(2);
        mr01.setCoordinates("350, 200");
        mr01.setX("0");
        mr01.setY("0");
        mr01.setWidth("18%");
        mr01.setHeight("17%");
        meetingRoomRepository.save(mr01);

        MeetingRoom mr02 = new MeetingRoom();
        mr02.setCodeId("MR-02");
        mr02.setName("Madrid");
        mr02.setFloor(etaj1);
        mr02.setMaxNoPersons(5);
        mr02.setCoordinates("400, 200");
        mr02.setX("18%");
        mr02.setY("0");
        mr02.setWidth("18%");
        mr02.setHeight("17%");
        meetingRoomRepository.save(mr02);

        MeetingRoom mr03 = new MeetingRoom();
        mr03.setCodeId("MR-03");
        mr03.setName("Istanbul");
        mr03.setFloor(etaj1);
        mr03.setMaxNoPersons(10);
        mr03.setCoordinates("650, 550");
        mr03.setX("36%");
        mr03.setY("83%");
        mr03.setWidth("14%");
        mr03.setHeight("17%");
        meetingRoomRepository.save(mr03);

        MeetingRoom mr04 = new MeetingRoom();
        mr04.setCodeId("MR-04");
        mr04.setName("New York");
        mr04.setFloor(etaj1);
        mr04.setMaxNoPersons(4);
        mr04.setCoordinates("750, 550");
        mr04.setX("50%");
        mr04.setY("83%");
        mr04.setWidth("14%");
        mr04.setHeight("17%");
        meetingRoomRepository.save(mr04);

        MeetingRoom mr05 = new MeetingRoom();
        mr05.setCodeId("MR-05");
        mr05.setName("Amsterdam");
        mr05.setFloor(etaj1);
        mr05.setMaxNoPersons(10);
        mr05.setCoordinates("850, 550");
        mr05.setX("64%");
        mr05.setY("83%");
        mr05.setWidth("14%");
        mr05.setHeight("17%");
        meetingRoomRepository.save(mr05);

        MeetingRoom mr06 = new MeetingRoom();
        mr06.setCodeId("MR-06");
        mr06.setName("Sydney");
        mr06.setFloor(etaj2);
        mr06.setMaxNoPersons(5);
        mr06.setCoordinates("350, 600");
        mr06.setX("0");
        mr06.setY("83%");
        mr06.setWidth("12%");
        mr06.setHeight("17%");
        meetingRoomRepository.save(mr06);

        MeetingRoom mr07 = new MeetingRoom();
        mr07.setCodeId("MR-07");
        mr07.setName("Londra");
        mr07.setFloor(etaj2);
        mr07.setMaxNoPersons(10);
        mr07.setCoordinates("450, 600");
        mr07.setX("12%");
        mr07.setY("83%");
        mr07.setWidth("12%");
        mr07.setHeight("17%");
        meetingRoomRepository.save(mr07);

        MeetingRoom mr08 = new MeetingRoom();
        mr08.setCodeId("MR-08");
        mr08.setName("Barcelona");
        mr08.setFloor(etaj2);
        mr08.setMaxNoPersons(10);
        mr08.setCoordinates("600, 600");
        mr08.setX("24%");
        mr08.setY("83%");
        mr08.setWidth("12%");
        mr08.setHeight("17%");
        meetingRoomRepository.save(mr08);

        //offices rooms
        OfficesRoom officesRoom1 = new OfficesRoom();
        officesRoom1.setName("Open Space 1");
        officesRoom1.setFloor(parter);
        officesRoom1.setType(OfficesRoomType.OPEN_SPACE);
        officesRoom1.setCoordinates("400, 400");
        officesRoom1.setX("0");
        officesRoom1.setY("0");
        officesRoom1.setHeight("100%");
        officesRoom1.setWidth("36%");
        officesRoomRepository.save(officesRoom1);

        OfficesRoom officesRoom2 = new OfficesRoom();
        officesRoom2.setName("Open Space 2");
        officesRoom2.setFloor(etaj1);
        officesRoom2.setType(OfficesRoomType.OPEN_SPACE);
        officesRoom2.setCoordinates("400, 400");
        officesRoom2.setX("0");
        officesRoom2.setY("17%");
        officesRoom2.setHeight("83%");
        officesRoom2.setWidth("36%");
        officesRoomRepository.save(officesRoom2);

        OfficesRoom officesRoom3 = new OfficesRoom();
        officesRoom3.setName("Open Space 3");
        officesRoom3.setFloor(etaj1);
        officesRoom3.setType(OfficesRoomType.OPEN_SPACE);
        officesRoom3.setCoordinates("850, 400");
        officesRoom3.setX("36%");
        officesRoom3.setY("37%");
        officesRoom3.setHeight("46%");
        officesRoom3.setWidth("42%");
        officesRoomRepository.save(officesRoom3);

        OfficesRoom officesRoom4 = new OfficesRoom();
        officesRoom4.setName("Open Space 4");
        officesRoom4.setFloor(etaj2);
        officesRoom4.setType(OfficesRoomType.OPEN_SPACE);
        officesRoom4.setCoordinates("400, 400");
        officesRoom4.setX("0");
        officesRoom4.setY("21%");
        officesRoom4.setHeight("62%");
        officesRoom4.setWidth("36%");
        officesRoomRepository.save(officesRoom4);

        OfficesRoom smallRoom2 = new OfficesRoom();
        smallRoom2.setName("SR-01");
        smallRoom2.setFloor(parter);
        smallRoom2.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom2.setCoordinates("850, 550");
        smallRoom2.setX("57%");
        smallRoom2.setY("70%");
        smallRoom2.setWidth("21%");
        smallRoom2.setHeight("30%");
        officesRoomRepository.save(smallRoom2);

        OfficesRoom smallRoom3 = new OfficesRoom();
        smallRoom3.setName("SR-02");
        smallRoom3.setFloor(etaj2);
        smallRoom3.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom3.setCoordinates("650, 550");
        smallRoom3.setX("36%");
        smallRoom3.setY("70%");
        smallRoom3.setHeight("30%");
        smallRoom3.setWidth("14%");
        officesRoomRepository.save(smallRoom3);

        OfficesRoom smallRoom4 = new OfficesRoom();
        smallRoom4.setName("SR-03");
        smallRoom4.setFloor(etaj2);
        smallRoom4.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom4.setCoordinates("750, 550");
        smallRoom4.setX("50%");
        smallRoom4.setY("70%");
        smallRoom4.setHeight("30%");
        smallRoom4.setWidth("14%");
        officesRoomRepository.save(smallRoom4);

        OfficesRoom smallRoom5 = new OfficesRoom();
        smallRoom5.setName("SR-04");
        smallRoom5.setFloor(etaj2);
        smallRoom5.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom5.setCoordinates("850, 550");
        smallRoom5.setX("64%");
        smallRoom5.setY("70%");
        smallRoom5.setHeight("30%");
        smallRoom5.setWidth("14%");
        officesRoomRepository.save(smallRoom5);

        OfficesRoom smallRoom6 = new OfficesRoom();
        smallRoom6.setName("SR-05");
        smallRoom6.setFloor(etaj2);
        smallRoom6.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom6.setCoordinates("650, 400");
        smallRoom6.setX("40%");
        smallRoom6.setY("33%");
        smallRoom6.setHeight("30%");
        smallRoom6.setWidth("14%");
        officesRoomRepository.save(smallRoom6);

        OfficesRoom smallRoom7 = new OfficesRoom();
        smallRoom7.setName("SR-06");
        smallRoom7.setFloor(etaj2);
        smallRoom7.setType(OfficesRoomType.SMALL_ROOM);
        smallRoom7.setCoordinates("750, 400");
        smallRoom7.setX("60%");
        smallRoom7.setY("33%");
        smallRoom7.setHeight("30%");
        smallRoom7.setWidth("14%");
        officesRoomRepository.save(smallRoom7);

        //departments
        Department developers = new Department();
        developers.setCode("Dev-01-Buc");
        developers.setName("Development & Consulting 1");
        developers.setOfficesRoom(officesRoom1);
        departmentRepository.save(developers);

        Department productie = new Department();
        productie.setCode("Prod-0X-Buc");
        productie.setName("Productie");
        productie.setOfficesRoom(smallRoom2);
        departmentRepository.save(productie);

        Department developers2 = new Department();
        developers2.setCode("Dev-02-Buc");
        developers2.setName("Development & Consulting 2");
        developers2.setOfficesRoom(officesRoom2);
        departmentRepository.save(developers2);

        Department consulting = new Department();
        consulting.setCode("Cons-01-Buc");
        consulting.setName("Consultanta 1");
        consulting.setOfficesRoom(officesRoom3);
        departmentRepository.save(consulting);

        Department hrDep = new Department();
        hrDep.setCode("HR-0X-Buc");
        hrDep.setName("Human Resources");
        hrDep.setOfficesRoom(smallRoom4);
        departmentRepository.save(hrDep);

        Department accounting = new Department();
        accounting.setCode("Conta-0X-Buc");
        accounting.setName("Contabilitate");
        accounting.setOfficesRoom(smallRoom7);
        departmentRepository.save(accounting);

        Department financiar = new Department();
        financiar.setCode("Fin-0X-Buc");
        financiar.setName("Financiar");
        financiar.setOfficesRoom(smallRoom6);
        departmentRepository.save(financiar);

        Department marketing = new Department();
        marketing.setCode("Mrk-0X-Buc");
        marketing.setName("Marketing");
        marketing.setOfficesRoom(smallRoom3);
        departmentRepository.save(marketing);

        Department vanzari = new Department();
        vanzari.setCode("Vnz-0X-Buc");
        vanzari.setName("Vanzari");
        vanzari.setOfficesRoom(smallRoom5);
        departmentRepository.save(vanzari);

        Department consultanta2 = new Department();
        consultanta2.setCode("Cons-02-Buc");
        consultanta2.setName("Consultanta 2");
        consultanta2.setOfficesRoom(officesRoom4);
        departmentRepository.save(consultanta2);

        List<OfficesRoom> smallRooms = officesRoomRepository.findAllByType(OfficesRoomType.SMALL_ROOM);
        for(OfficesRoom smallRoom: smallRooms){
            for(int i = 0; i < 6; i++){
                Office sr1_o1 = new Office();
                sr1_o1.setName(smallRoom.getName() + "-0" + (i+1));
                sr1_o1.setOfficesRoom(smallRoom);
                sr1_o1.setX(setCoordinate(smallRoom.getX(), smallRoom.getWidth(), 7, i % 2 == 0 ? 1 : 4));
                sr1_o1.setY(setCoordinate(smallRoom.getY(), smallRoom.getHeight(), 10, i % 3 == 0 ? 1 : i % 3 == 1 ? 4 : 7));
                sr1_o1.setWidth(setDimension(smallRoom.getWidth(), 7));
                sr1_o1.setHeight(setDimension(smallRoom.getHeight(), 10));
                officeRepository.save(sr1_o1);
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 5; j++){
                Office sr1_o1 = new Office();
                sr1_o1.setName("OS1-0" + (i+1));
                sr1_o1.setOfficesRoom(officesRoom1);
                sr1_o1.setX(setCoordinate(officesRoom1.getX(), officesRoom1.getWidth(), 16, (j+1) + j*2));
                sr1_o1.setY(setCoordinate(officesRoom1.getY(), officesRoom1.getHeight(), 25, (i+1) + i*2));
                sr1_o1.setWidth(setDimension(officesRoom1.getWidth(), 16));
                sr1_o1.setHeight(setDimension(officesRoom1.getHeight(), 25));
                officeRepository.save(sr1_o1);
            }
        }

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 5; j++){
                Office sr1_o1 = new Office();
                sr1_o1.setName("OS2-0" + (i+1));
                sr1_o1.setOfficesRoom(officesRoom2);
                sr1_o1.setX(setCoordinate(officesRoom2.getX(), officesRoom2.getWidth(), 16, (j+1) + j*2));
                sr1_o1.setY(setCoordinate(officesRoom2.getY(), officesRoom2.getHeight(), 19, (i+1) + i*2));
                sr1_o1.setWidth(setDimension(officesRoom2.getWidth(), 16));
                sr1_o1.setHeight(setDimension(officesRoom2.getHeight(), 19));
                officeRepository.save(sr1_o1);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                Office sr1_o1 = new Office();
                sr1_o1.setName("OS3-0" + (i+1));
                sr1_o1.setOfficesRoom(officesRoom3);
                sr1_o1.setX(setCoordinate(officesRoom3.getX(), officesRoom3.getWidth(), 13, (j+1) + j*2));
                sr1_o1.setY(setCoordinate(officesRoom3.getY(), officesRoom3.getHeight(), 13, (i+1) + i*2));
                sr1_o1.setWidth(setDimension(officesRoom3.getWidth(), 13));
                sr1_o1.setHeight(setDimension(officesRoom3.getHeight(), 13));
                officeRepository.save(sr1_o1);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                Office sr1_o1 = new Office();
                sr1_o1.setName("OS4-0" + (i+1));
                sr1_o1.setOfficesRoom(officesRoom4);
                sr1_o1.setX(setCoordinate(officesRoom4.getX(), officesRoom4.getWidth(), 16, (j+1) + j*2));
                sr1_o1.setY(setCoordinate(officesRoom4.getY(), officesRoom4.getHeight(), 13, (i+1) + i*2));
                sr1_o1.setWidth(setDimension(officesRoom4.getWidth(), 16));
                sr1_o1.setHeight(setDimension(officesRoom4.getHeight(), 13));
                officeRepository.save(sr1_o1);
            }
        }
        final String encodedPassword = passwordEncoder.encode("test");

        Employee generalManager = new Employee();
        generalManager.setName("Heilberg John");
        generalManager.setEmail("john.heilberg@yahoo.com");
        generalManager.setPhoneNumber("+407119410");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990,5,1);
        Date startDate = calendar.getTime();
        generalManager.setDateOfEmployment(startDate);
        generalManager.setOffice(officeRepository.findById(1L).get());
        generalManager.setJob(manager);
        generalManager.setDepartment(productie);
        generalManager.setPassword(encodedPassword);
        employeeRepository.save(generalManager);

        //vanzari
        Employee managerVanzari = new Employee();
        managerVanzari.setName("Antonescu Sebastian");
        managerVanzari.setEmail("sebastian.antonescu@yahoo.com");
        managerVanzari.setPhoneNumber("+407129410");
        calendar = Calendar.getInstance();
        calendar.set(2001,7,1);
        startDate = calendar.getTime();
        managerVanzari.setDateOfEmployment(startDate);
        managerVanzari.setDepartment(vanzari);
        managerVanzari.setOffice(officeRepository.findById(19L).get());
        managerVanzari.setJob(manager);
        managerVanzari.setManager(generalManager);
        managerVanzari.setPassword(encodedPassword);
        employeeRepository.save(managerVanzari);

        Employee agentVanzari1 = new Employee();
        agentVanzari1.setName("Popescu Maria");
        agentVanzari1.setEmail("maria.popescu@yahoo.com");
        agentVanzari1.setPhoneNumber("+407129420");
        calendar.set(2010,7,1);
        startDate = calendar.getTime();
        agentVanzari1.setDateOfEmployment(startDate);
        agentVanzari1.setDepartment(vanzari);
        agentVanzari1.setOffice(officeRepository.findById(20L).get());
        agentVanzari1.setJob(agentVanzari);
        agentVanzari1.setManager(managerVanzari);
        agentVanzari1.setPassword(encodedPassword);
        employeeRepository.save(agentVanzari1);

        Employee agentVanzari2 = new Employee();
        agentVanzari2.setName("Ion Marcel");
        agentVanzari2.setEmail("ion.marcel@yahoo.com");
        agentVanzari2.setPhoneNumber("+407129123");
        calendar.set(2011,5,1);
        startDate = calendar.getTime();
        agentVanzari2.setDateOfEmployment(startDate);
        agentVanzari2.setDepartment(vanzari);
        agentVanzari2.setOffice(officeRepository.findById(21L).get());
        agentVanzari2.setJob(agentVanzari);
        agentVanzari2.setManager(managerVanzari);
        agentVanzari2.setPassword(encodedPassword);
        employeeRepository.save(agentVanzari2);

        Employee agentVanzari3 = new Employee();
        agentVanzari3.setName("Baicu Elena");
        agentVanzari3.setEmail("elena.baicu@yahoo.com");
        agentVanzari3.setPhoneNumber("+407219420");
        calendar.set(2010,4,14);
        startDate = calendar.getTime();
        agentVanzari3.setDateOfEmployment(startDate);
        agentVanzari3.setDepartment(vanzari);
        agentVanzari3.setOffice(officeRepository.findById(22L).get());
        agentVanzari3.setJob(agentVanzari);
        agentVanzari3.setManager(managerVanzari);
        agentVanzari3.setPassword(encodedPassword);
        employeeRepository.save(agentVanzari3);

        Employee agentVanzari4 = new Employee();
        agentVanzari4.setName("Antonescu Maria");
        agentVanzari4.setEmail("maria.antonescu@yahoo.com");
        agentVanzari4.setPhoneNumber("+4071295420");
        calendar.set(2008,7,1);
        startDate = calendar.getTime();
        agentVanzari4.setDateOfEmployment(startDate);
        agentVanzari4.setDepartment(vanzari);
        agentVanzari4.setOffice(officeRepository.findById(23L).get());
        agentVanzari4.setJob(agentVanzari);
        agentVanzari4.setManager(managerVanzari);
        agentVanzari4.setPassword(encodedPassword);
        employeeRepository.save(agentVanzari4);

        Employee agentVanzari5 = new Employee();
        agentVanzari5.setName("Vasile Oana");
        agentVanzari5.setEmail("oana.vasile@yahoo.com");
        agentVanzari5.setPhoneNumber("+4072229420");
        calendar.set(2005,1,20);
        startDate = calendar.getTime();
        agentVanzari5.setDateOfEmployment(startDate);
        agentVanzari5.setDepartment(vanzari);
        agentVanzari5.setOffice(officeRepository.findById(24L).get());
        agentVanzari5.setJob(agentVanzari);
        agentVanzari5.setManager(managerVanzari);
        agentVanzari5.setPassword(encodedPassword);
        employeeRepository.save(agentVanzari5);

        //contabilitate
        Employee managerAccounting = new Employee();
        managerAccounting.setName("Ionescu Simona");
        managerAccounting.setEmail("simona.ionescu@yahoo.com");
        managerAccounting.setPhoneNumber("+407129421");
        calendar.set(2015,2,10);
        managerAccounting.setDateOfEmployment(calendar.getTime());
        managerAccounting.setDepartment(accounting);
        managerAccounting.setOffice(officeRepository.findById(31L).get());
        managerAccounting.setJob(manager);
        managerAccounting.setManager(generalManager);
        managerAccounting.setPassword(encodedPassword);
        employeeRepository.save(managerAccounting);

        Employee contabil1 = new Employee();
        contabil1.setName("Antonescu Cristina");
        contabil1.setEmail("cristina.antonescu@yahoo.com");
        contabil1.setPhoneNumber("+407129321");
        calendar.set(2015,7,10);
        contabil1.setDateOfEmployment(calendar.getTime());
        contabil1.setDepartment(accounting);
        contabil1.setOffice(officeRepository.findById(32L).get());
        contabil1.setJob(contabil);
        contabil1.setManager(managerAccounting);
        contabil1.setPassword(encodedPassword);
        employeeRepository.save(contabil1);

        Employee contabil2 = new Employee();
        contabil2.setName("Stan Ingrid");
        contabil2.setEmail("ingrid.stan@yahoo.com");
        contabil2.setPhoneNumber("+407129481");
        calendar.set(2020,2,10);
        contabil2.setDateOfEmployment(calendar.getTime());
        contabil2.setDepartment(accounting);
        contabil2.setOffice(officeRepository.findById(33L).get());
        contabil2.setJob(contabil);
        contabil2.setManager(managerAccounting);
        contabil2.setPassword(encodedPassword);
        employeeRepository.save(contabil2);

        //hr
        Employee managerHR = new Employee();
        managerHR.setName("Andrei Ingrid");
        managerHR.setEmail("ingrid.andrei@yahoo.com");
        managerHR.setPhoneNumber("+407129422");
        calendar.set(2019,5,10);
        managerHR.setDateOfEmployment(calendar.getTime());
        managerHR.setDepartment(hrDep);
        managerHR.setOffice(officeRepository.findById(13L).get());
        managerHR.setJob(manager);
        managerHR.setManager(generalManager);
        managerHR.setPassword(encodedPassword);
        employeeRepository.save(managerHR);

        Employee hr1 = new Employee();
        hr1.setName("Neatu Madalina");
        hr1.setEmail("madalina.neatu@yahoo.com");
        hr1.setPhoneNumber("+407339422");
        calendar.set(2019,5,10);
        hr1.setDateOfEmployment(calendar.getTime());
        hr1.setDepartment(hrDep);
        hr1.setOffice(officeRepository.findById(14L).get());
        hr1.setJob(hr);
        hr1.setManager(managerHR);
        hr1.setPassword(encodedPassword);
        employeeRepository.save(hr1);

        Employee hr2 = new Employee();
        hr2.setName("Stanciu Marcela");
        hr2.setEmail("marcela.stanciu@yahoo.com");
        hr2.setPhoneNumber("+407129422");
        calendar.set(2019,5,10);
        hr2.setDateOfEmployment(calendar.getTime());
        hr2.setDepartment(hrDep);
        hr2.setOffice(officeRepository.findById(15L).get());
        hr2.setJob(hr);
        hr2.setManager(managerHR);
        hr2.setPassword(encodedPassword);
        employeeRepository.save(hr2);

        //marketing
        Employee managerMarketing = new Employee();
        managerMarketing.setName("Stancu Silviu");
        managerMarketing.setEmail("silviu.stancu@yahoo.com");
        managerMarketing.setPhoneNumber("+407921422");
        calendar.set(2014,5,21);
        managerMarketing.setDateOfEmployment(calendar.getTime());
        managerMarketing.setDepartment(marketing);
        managerMarketing.setOffice(officeRepository.findById(7L).get());
        managerMarketing.setJob(manager);
        managerMarketing.setManager(generalManager);
        managerMarketing.setPassword(encodedPassword);
        employeeRepository.save(managerMarketing);

        Employee marketing1 = new Employee();
        marketing1.setName("Neatu Ioana");
        marketing1.setEmail("ioana.neatu@yahoo.com");
        marketing1.setPhoneNumber("+407339422");
        calendar.set(2018,5,10);
        marketing1.setDateOfEmployment(calendar.getTime());
        marketing1.setDepartment(marketing);
        marketing1.setOffice(officeRepository.findById(8L).get());
        marketing1.setJob(coordonatorMarketing);
        marketing1.setManager(managerMarketing);
        marketing1.setPassword(encodedPassword);
        employeeRepository.save(marketing1);

        Employee marketing2 = new Employee();
        marketing2.setName("Stoica George");
        marketing2.setEmail("george.stoica@yahoo.com");
        marketing2.setPhoneNumber("+407129432");
        calendar.set(2009,5,10);
        marketing2.setDateOfEmployment(calendar.getTime());
        marketing2.setDepartment(marketing);
        marketing2.setOffice(officeRepository.findById(9L).get());
        marketing2.setJob(expertSEO);
        marketing2.setManager(managerMarketing);
        marketing2.setPassword(encodedPassword);
        employeeRepository.save(marketing2);

        //productie
        Employee managerProductie = new Employee();
        managerProductie.setName("Manoliu Andrei");
        managerProductie.setEmail("andrei.manoliu@yahoo.com");
        managerProductie.setPhoneNumber("+407129475");
        calendar.set(2020,1,10);
        managerProductie.setDateOfEmployment(calendar.getTime());
        managerProductie.setDepartment(productie);
        managerProductie.setOffice(officeRepository.findById(2L).get());
        managerProductie.setJob(manager);
        managerProductie.setManager(generalManager);
        managerProductie.setPassword(encodedPassword);
        employeeRepository.save(managerProductie);

        Employee angajatProd1 = new Employee();
        angajatProd1.setName("Ionescu Patric");
        angajatProd1.setEmail("patric.ionescu@yahoo.com");
        angajatProd1.setPhoneNumber("+407559422");
        calendar.set(2018,5,10);
        angajatProd1.setDateOfEmployment(calendar.getTime());
        angajatProd1.setDepartment(productie);
        angajatProd1.setOffice(officeRepository.findById(3L).get());
        angajatProd1.setJob(analistProductie);
        angajatProd1.setManager(managerProductie);
        angajatProd1.setPassword(encodedPassword);
        employeeRepository.save(angajatProd1);

        Employee angajatProd2 = new Employee();
        angajatProd2.setName("Ciocodeica Mihaela");
        angajatProd2.setEmail("mihaela.ciocodeica@yahoo.com");
        angajatProd2.setPhoneNumber("+407124422");
        calendar.set(2010,4,10);
        angajatProd2.setDateOfEmployment(calendar.getTime());
        angajatProd2.setDepartment(productie);
        angajatProd2.setOffice(officeRepository.findById(4L).get());
        angajatProd2.setJob(analistProductie);
        angajatProd2.setManager(managerProductie);
        angajatProd2.setPassword(encodedPassword);
        employeeRepository.save(angajatProd2);

        //financiar
        Employee managerFinanciar = new Employee();
        managerFinanciar.setName("Bertesteanu Catalina");
        managerFinanciar.setEmail("catalina.bertesteanu@yahoo.com");
        managerFinanciar.setPhoneNumber("+407129421");
        calendar.set(2019,5,21);
        managerFinanciar.setDateOfEmployment(calendar.getTime());
        managerFinanciar.setDepartment(financiar);
        managerFinanciar.setOffice(officeRepository.findById(25L).get());
        managerFinanciar.setJob(manager);
        managerFinanciar.setManager(generalManager);
        managerFinanciar.setPassword(encodedPassword);
        employeeRepository.save(managerFinanciar);

        Employee angajatFi1 = new Employee();
        angajatFi1.setName("Apostol Iuliana");
        angajatFi1.setEmail("iuliana.apostol@yahoo.com");
        angajatFi1.setPhoneNumber("+407339421");
        calendar.set(2019,3,10);
        angajatFi1.setDateOfEmployment(calendar.getTime());
        angajatFi1.setDepartment(financiar);
        angajatFi1.setOffice(officeRepository.findById(26L).get());
        angajatFi1.setJob(analistFinanciar);
        angajatFi1.setManager(managerFinanciar);
        angajatFi1.setPassword(encodedPassword);
        employeeRepository.save(angajatFi1);

        Employee angajatFi2 = new Employee();
        angajatFi2.setName("Toader Adriana");
        angajatFi2.setEmail("adriana.toader@yahoo.com");
        angajatFi2.setPhoneNumber("+407122422");
        calendar.set(2019,2,10);
        angajatFi2.setDateOfEmployment(calendar.getTime());
        angajatFi2.setDepartment(financiar);
        angajatFi2.setOffice(officeRepository.findById(27L).get());
        angajatFi2.setJob(analistFinanciar);
        angajatFi2.setManager(managerFinanciar);
        angajatFi2.setPassword(encodedPassword);
        employeeRepository.save(angajatFi2);

        //consulting 1
        Employee managerConsulting = new Employee();
        managerConsulting.setName("Soare Anastasia");
        managerConsulting.setEmail("anastasia.soare@yahoo.com");
        managerConsulting.setPhoneNumber("+407129423");
        calendar.set(2002,12,1);
        managerConsulting.setDateOfEmployment(calendar.getTime());
        managerConsulting.setDepartment(consulting);
        managerConsulting.setOffice(officeRepository.findById(107L).get());
        managerConsulting.setJob(manager);
        managerConsulting.setManager(generalManager);
        managerConsulting.setPassword(encodedPassword);
        employeeRepository.save(managerConsulting);

        Employee angCons1 = new Employee();
        angCons1.setName("Soare Georgiana");
        angCons1.setEmail("georgiana.soare@yahoo.com");
        angCons1.setPhoneNumber("+407222423");
        calendar.set(2010,11,1);
        angCons1.setDateOfEmployment(calendar.getTime());
        angCons1.setDepartment(consulting);
        angCons1.setOffice(officeRepository.findById(108L).get());
        angCons1.setJob(analistConcur);
        angCons1.setManager(managerConsulting);
        angCons1.setPassword(encodedPassword);
        employeeRepository.save(angCons1);

        Employee angCons2 = new Employee();
        angCons2.setName("Nistorescu Sorina");
        angCons2.setEmail("sorina.nistorescu@yahoo.com");
        angCons2.setPhoneNumber("+407333423");
        calendar.set(2011,12,1);
        angCons2.setDateOfEmployment(calendar.getTime());
        angCons2.setDepartment(consulting);
        angCons2.setOffice(officeRepository.findById(109L).get());
        angCons2.setJob(analistSAPFi);
        angCons2.setManager(managerConsulting);
        angCons2.setPassword(encodedPassword);
        employeeRepository.save(angCons2);

        Employee angCons3 = new Employee();
        angCons3.setName("Moroianu Alexandru");
        angCons3.setEmail("alexandru.moroianu@yahoo.com");
        angCons3.setPhoneNumber("+407444423");
        calendar.set(2019,10,10);
        angCons3.setDateOfEmployment(calendar.getTime());
        angCons3.setDepartment(consulting);
        angCons3.setOffice(officeRepository.findById(110L).get());
        angCons3.setJob(analistSAPFi);
        angCons3.setManager(managerConsulting);
        angCons3.setPassword(encodedPassword);
        employeeRepository.save(angCons3);

        Employee angCons4 = new Employee();
        angCons4.setName("Toma Adelina");
        angCons4.setEmail("adelina.toma@yahoo.com");
        angCons4.setPhoneNumber("+407555423");
        calendar.set(2018,5,4);
        angCons4.setDateOfEmployment(calendar.getTime());
        angCons4.setDepartment(consulting);
        angCons4.setOffice(officeRepository.findById(111L).get());
        angCons4.setJob(analistSAPCO);
        angCons4.setManager(managerConsulting);
        angCons4.setPassword(encodedPassword);
        employeeRepository.save(angCons4);

        Employee angCons5 = new Employee();
        angCons5.setName("Pirlogea Ionut");
        angCons5.setEmail("ionut.pirlogea@yahoo.com");
        angCons5.setPhoneNumber("+407666423");
        calendar.set(2018,5,4);
        angCons5.setDateOfEmployment(calendar.getTime());
        angCons5.setDepartment(consulting);
        angCons5.setOffice(officeRepository.findById(112L).get());
        angCons5.setJob(analistSAPSales);
        angCons5.setManager(managerConsulting);
        angCons5.setPassword(encodedPassword);
        employeeRepository.save(angCons5);

        Employee angCons6 = new Employee();
        angCons6.setName("Bica Bogdan");
        angCons6.setEmail("bogdan.bica@yahoo.com");
        angCons6.setPhoneNumber("+407777423");
        calendar.set(2017,6,16);
        angCons6.setDateOfEmployment(calendar.getTime());
        angCons6.setDepartment(consulting);
        angCons6.setOffice(officeRepository.findById(114L).get());
        angCons6.setJob(analistSAPSales);
        angCons6.setManager(managerConsulting);
        angCons6.setPassword(encodedPassword);
        employeeRepository.save(angCons6);

        Employee angCons7 = new Employee();
        angCons7.setName("Lazu Ionut");
        angCons7.setEmail("ionut.lazu@yahoo.com");
        angCons7.setPhoneNumber("+407888423");
        calendar.set(2019,11,11);
        angCons7.setDateOfEmployment(calendar.getTime());
        angCons7.setDepartment(consulting);
        angCons7.setOffice(officeRepository.findById(115L).get());
        angCons7.setJob(analistSAPFi);
        angCons7.setManager(managerConsulting);
        angCons7.setPassword(encodedPassword);
        employeeRepository.save(angCons7);

        Employee angCons8 = new Employee();
        angCons8.setName("Badea Razvan");
        angCons8.setEmail("razvan.badea@yahoo.com");
        angCons8.setPhoneNumber("+407999423");
        calendar.set(2019,4,4);
        angCons8.setDateOfEmployment(calendar.getTime());
        angCons8.setDepartment(consulting);
        angCons8.setOffice(officeRepository.findById(116L).get());
        angCons8.setJob(analistSAPCO);
        angCons8.setManager(managerConsulting);
        angCons8.setPassword(encodedPassword);
        employeeRepository.save(angCons8);

        Employee angCons9 = new Employee();
        angCons9.setName("Retegan Cosmin");
        angCons9.setEmail("cosmin.retegan@yahoo.com");
        angCons9.setPhoneNumber("+407101423");
        calendar.set(2018,3,12);
        angCons9.setDateOfEmployment(calendar.getTime());
        angCons9.setDepartment(consulting);
        angCons9.setOffice(officeRepository.findById(117L).get());
        angCons9.setJob(analistConcur);
        angCons9.setManager(managerConsulting);
        angCons9.setPassword(encodedPassword);
        employeeRepository.save(angCons9);


        //cons 2
        Employee managerConsulting2 = new Employee();
        managerConsulting2.setName("Cioc Bogdan");
        managerConsulting2.setEmail("bogdan.cioc@yahoo.com");
        managerConsulting2.setPhoneNumber("+407129111");
        calendar.set(2000,11,11);
        managerConsulting2.setDateOfEmployment(calendar.getTime());
        managerConsulting2.setDepartment(consultanta2);
        managerConsulting2.setOffice(officeRepository.findById(129L).get());
        managerConsulting2.setJob(manager);
        managerConsulting2.setManager(generalManager);
        managerConsulting2.setPassword(encodedPassword);
        employeeRepository.save(managerConsulting2);

        Employee angCons2_1 = new Employee();
        angCons2_1.setName("Ionescu Victoria");
        angCons2_1.setEmail("victoria.ionescu@yahoo.com");
        angCons2_1.setPhoneNumber("+407222222");
        calendar.set(2010,12,12);
        angCons2_1.setDateOfEmployment(calendar.getTime());
        angCons2_1.setDepartment(consultanta2);
        angCons2_1.setOffice(officeRepository.findById(130L).get());
        angCons2_1.setJob(analistConcur);
        angCons2_1.setManager(managerConsulting2);
        angCons2_1.setPassword(encodedPassword);
        employeeRepository.save(angCons2_1);

        Employee angCons2_2 = new Employee();
        angCons2_2.setName("Celoiu Florina");
        angCons2_2.setEmail("florina.celoiu@yahoo.com");
        angCons2_2.setPhoneNumber("+407333333");
        calendar.set(2011,5,15);
        angCons2_2.setDateOfEmployment(calendar.getTime());
        angCons2_2.setDepartment(consultanta2);
        angCons2_2.setOffice(officeRepository.findById(131L).get());
        angCons2_2.setJob(analistSAPFi);
        angCons2_2.setManager(managerConsulting2);
        angCons2_2.setPassword(encodedPassword);
        employeeRepository.save(angCons2_2);

        Employee angCons2_3 = new Employee();
        angCons2_3.setName("Ninulescu Teodora");
        angCons2_3.setEmail("teodora.ninulescu@yahoo.com");
        angCons2_3.setPhoneNumber("+407444444");
        calendar.set(2019,12,10);
        angCons2_3.setDateOfEmployment(calendar.getTime());
        angCons2_3.setDepartment(consultanta2);
        angCons2_3.setOffice(officeRepository.findById(133L).get());
        angCons2_3.setJob(analistSAPFi);
        angCons2_3.setManager(managerConsulting2);
        angCons2_3.setPassword(encodedPassword);
        employeeRepository.save(angCons2_3);

        Employee angCons2_4 = new Employee();
        angCons2_4.setName("Iordache Silviu");
        angCons2_4.setEmail("silviu.iordache@yahoo.com");
        angCons2_4.setPhoneNumber("+407555555");
        calendar.set(2018,3,15);
        angCons2_4.setDateOfEmployment(calendar.getTime());
        angCons2_4.setDepartment(consultanta2);
        angCons2_4.setOffice(officeRepository.findById(134L).get());
        angCons2_4.setJob(analistSAPCO);
        angCons2_4.setManager(managerConsulting2);
        angCons2_4.setPassword(encodedPassword);
        employeeRepository.save(angCons2_4);

        Employee angCons2_5 = new Employee();
        angCons2_5.setName("Astanculesei Valentin");
        angCons2_5.setEmail("valentin.astanculesei@yahoo.com");
        angCons2_5.setPhoneNumber("+407666666");
        calendar.set(2018,5,1);
        angCons2_5.setDateOfEmployment(calendar.getTime());
        angCons2_5.setDepartment(consultanta2);
        angCons2_5.setOffice(officeRepository.findById(135L).get());
        angCons2_5.setJob(analistSAPSales);
        angCons2_5.setManager(managerConsulting2);
        angCons2_5.setPassword(encodedPassword);
        employeeRepository.save(angCons2_5);

        Employee angCons2_6 = new Employee();
        angCons2_6.setName("Constantinescu Carmen");
        angCons2_6.setEmail("carmen.constantinescu@yahoo.com");
        angCons2_6.setPhoneNumber("+407777777");
        calendar.set(2017,6,1);
        angCons2_6.setDateOfEmployment(calendar.getTime());
        angCons2_6.setDepartment(consultanta2);
        angCons2_6.setOffice(officeRepository.findById(139L).get());
        angCons2_6.setJob(analistSAPSales);
        angCons2_6.setManager(managerConsulting2);
        angCons2_6.setPassword(encodedPassword);
        employeeRepository.save(angCons2_6);

        Employee angCons2_7 = new Employee();
        angCons2_7.setName("Constantinescu Cosmin");
        angCons2_7.setEmail("cosmin.constantinescu@yahoo.com");
        angCons2_7.setPhoneNumber("+407888888");
        calendar.set(2019,11,1);
        angCons2_7.setDateOfEmployment(calendar.getTime());
        angCons2_7.setDepartment(consultanta2);
        angCons2_7.setOffice(officeRepository.findById(140L).get());
        angCons2_7.setJob(analistSAPFi);
        angCons2_7.setManager(managerConsulting2);
        angCons2_7.setPassword(encodedPassword);
        employeeRepository.save(angCons2_7);

        Employee angCons2_8 = new Employee();
        angCons2_8.setName("Radu Gabriel");
        angCons2_8.setEmail("gabriel.radu@yahoo.com");
        angCons2_8.setPhoneNumber("+407999999");
        calendar.set(2019,5,1);
        angCons2_8.setDateOfEmployment(calendar.getTime());
        angCons2_8.setDepartment(consultanta2);
        angCons2_8.setOffice(officeRepository.findById(141L).get());
        angCons2_8.setJob(analistSAPCO);
        angCons2_8.setManager(managerConsulting2);
        angCons2_8.setPassword(encodedPassword);
        employeeRepository.save(angCons2_8);

        Employee angCons2_9 = new Employee();
        angCons2_9.setName("Radu Elena");
        angCons2_9.setEmail("elena.radu@yahoo.com");
        angCons2_9.setPhoneNumber("+407101101");
        calendar.set(2018,3,1);
        angCons2_9.setDateOfEmployment(calendar.getTime());
        angCons2_9.setDepartment(consultanta2);
        angCons2_9.setOffice(officeRepository.findById(142L).get());
        angCons2_9.setJob(analistConcur);
        angCons2_9.setManager(managerConsulting2);
        angCons2_9.setPassword(encodedPassword);
        employeeRepository.save(angCons2_9);
        
        //dev 1
        Employee managerDev1 = new Employee();
        managerDev1.setName("Gavrila Daniel");
        managerDev1.setEmail("daniel.gavrila@yahoo.com");
        managerDev1.setPhoneNumber("+407129111");
        calendar.set(2001,5,1);
        managerDev1.setDateOfEmployment(calendar.getTime());
        managerDev1.setDepartment(developers);
        managerDev1.setOffice(officeRepository.findById(37L).get());
        managerDev1.setJob(manager);
        managerDev1.setManager(generalManager);
        managerDev1.setPassword(encodedPassword);
        employeeRepository.save(managerDev1);

        Employee dev1_1 = new Employee();
        dev1_1.setName("Bratu Felicia");
        dev1_1.setEmail("felicia.bratu@yahoo.com");
        dev1_1.setPhoneNumber("+407222211");
        calendar.set(2014,12,12);
        dev1_1.setDateOfEmployment(calendar.getTime());
        dev1_1.setDepartment(developers);
        dev1_1.setOffice(officeRepository.findById(38L).get());
        dev1_1.setJob(businessAnalist);
        dev1_1.setManager(managerDev1);
        dev1_1.setPassword(encodedPassword);
        employeeRepository.save(dev1_1);

        Employee dev1_2 = new Employee();
        dev1_2.setName("Andrei Oana");
        dev1_2.setEmail("oana.andrei@yahoo.com");
        dev1_2.setPhoneNumber("+407333311");
        calendar.set(2015,5,15);
        dev1_2.setDateOfEmployment(calendar.getTime());
        dev1_2.setDepartment(developers);
        dev1_2.setOffice(officeRepository.findById(39L).get());
        dev1_2.setJob(businessAnalist);
        dev1_2.setManager(managerDev1);
        dev1_2.setPassword(encodedPassword);
        employeeRepository.save(dev1_2);

        Employee dev1_3 = new Employee();
        dev1_3.setName("Ghinescu Madalina");
        dev1_3.setEmail("madalina.ghinescu@yahoo.com");
        dev1_3.setPhoneNumber("+407444411");
        calendar.set(2018,12,10);
        dev1_3.setDateOfEmployment(calendar.getTime());
        dev1_3.setDepartment(developers);
        dev1_3.setOffice(officeRepository.findById(40L).get());
        dev1_3.setJob(po);
        dev1_3.setManager(managerDev1);
        dev1_3.setPassword(encodedPassword);
        employeeRepository.save(dev1_3);

        Employee dev1_4 = new Employee();
        dev1_4.setName("Ravariu Rares");
        dev1_4.setEmail("rares.ravariu@yahoo.com");
        dev1_4.setPhoneNumber("+407555511");
        calendar.set(2017,5,15);
        dev1_4.setDateOfEmployment(calendar.getTime());
        dev1_4.setDepartment(developers);
        dev1_4.setOffice(officeRepository.findById(41L).get());
        dev1_4.setJob(po);
        dev1_4.setManager(managerDev1);
        dev1_4.setPassword(encodedPassword);
        employeeRepository.save(dev1_4);

        Employee dev1_5 = new Employee();
        dev1_5.setName("Popa Adina");
        dev1_5.setEmail("adina.popa@yahoo.com");
        dev1_5.setPhoneNumber("+407666611");
        calendar.set(2017,4,1);
        dev1_5.setDateOfEmployment(calendar.getTime());
        dev1_5.setDepartment(developers);
        dev1_5.setOffice(officeRepository.findById(42L).get());
        dev1_5.setJob(pm);
        dev1_5.setManager(managerDev1);
        dev1_5.setPassword(encodedPassword);
        employeeRepository.save(dev1_5);

        Employee dev1_6 = new Employee();
        dev1_6.setName("Pirlogea Mihnea");
        dev1_6.setEmail("mihnea.pirlogea@yahoo.com");
        dev1_6.setPhoneNumber("+407777711");
        calendar.set(2017,2,1);
        dev1_6.setDateOfEmployment(calendar.getTime());
        dev1_6.setDepartment(developers);
        dev1_6.setOffice(officeRepository.findById(43L).get());
        dev1_6.setJob(softDev);
        dev1_6.setManager(managerDev1);
        dev1_6.setPassword(encodedPassword);
        employeeRepository.save(dev1_6);

        Employee dev1_7 = new Employee();
        dev1_7.setName("Stan Catalina");
        dev1_7.setEmail("catalina.stan@yahoo.com");
        dev1_7.setPhoneNumber("+407888811");
        calendar.set(2019,1,1);
        dev1_7.setDateOfEmployment(calendar.getTime());
        dev1_7.setDepartment(developers);
        dev1_7.setOffice(officeRepository.findById(44L).get());
        dev1_7.setJob(techLead);
        dev1_7.setManager(managerDev1);
        dev1_7.setPassword(encodedPassword);
        employeeRepository.save(dev1_7);

        Employee dev1_8 = new Employee();
        dev1_8.setName("Ursu Bianca");
        dev1_8.setEmail("bianca.ursu@yahoo.com");
        dev1_8.setPhoneNumber("+407999911");
        calendar.set(2019,5,1);
        dev1_8.setDateOfEmployment(calendar.getTime());
        dev1_8.setDepartment(developers);
        dev1_8.setOffice(officeRepository.findById(47L).get());
        dev1_8.setJob(webDev);
        dev1_8.setManager(managerDev1);
        dev1_8.setPassword(encodedPassword);
        employeeRepository.save(dev1_8);

        Employee dev1_9 = new Employee();
        dev1_9.setName("Toma Ana");
        dev1_9.setEmail("ana.toma@yahoo.com");
        dev1_9.setPhoneNumber("+407101111");
        calendar.set(2019,3,12);
        dev1_9.setDateOfEmployment(calendar.getTime());
        dev1_9.setDepartment(developers);
        dev1_9.setOffice(officeRepository.findById(48L).get());
        dev1_9.setJob(techLead);
        dev1_9.setManager(managerDev1);
        dev1_9.setPassword(encodedPassword);
        employeeRepository.save(dev1_9);

        Employee pmConsulting = new Employee();
        pmConsulting.setName("Tudor Evelin");
        pmConsulting.setEmail("evelin.tudor@yahoo.com");
        pmConsulting.setPhoneNumber("+407129423");
        calendar.set(2006,12,1);
        pmConsulting.setDateOfEmployment(calendar.getTime());
        pmConsulting.setDepartment(developers);
        pmConsulting.setOffice(officeRepository.findById(49L).get());
        pmConsulting.setJob(pm);
        pmConsulting.setManager(managerDev1);
        pmConsulting.setPassword(encodedPassword);
        employeeRepository.save(pmConsulting);

        Employee javaDevConsulting = new Employee();
        javaDevConsulting.setName("Stan Marcel");
        javaDevConsulting.setEmail("marcel.stan@yahoo.com");
        javaDevConsulting.setPhoneNumber("+407129424");
        calendar.set(2000,3,1);
        javaDevConsulting.setDateOfEmployment(calendar.getTime());
        javaDevConsulting.setDepartment(developers);
        javaDevConsulting.setOffice(officeRepository.findById(50L).get());
        javaDevConsulting.setJob(javaDev);
        javaDevConsulting.setManager(managerDev1);
        javaDevConsulting.setPassword(encodedPassword);
        employeeRepository.save(javaDevConsulting);

        Employee softDevConsulting = new Employee();
        softDevConsulting.setName("Pop Andrei");
        softDevConsulting.setEmail("andrei.pop@yahoo.com");
        softDevConsulting.setPhoneNumber("+407129425");
        calendar.set(2019,5,15);
        softDevConsulting.setDateOfEmployment(calendar.getTime());
        softDevConsulting.setDepartment(developers);
        softDevConsulting.setJob(softDev);
        softDevConsulting.setOffice(officeRepository.findById(52L).get());
        softDevConsulting.setManager(managerDev1);
        softDevConsulting.setPassword(encodedPassword);
        employeeRepository.save(softDevConsulting);

        Employee javaDevConsulting2 = new Employee();
        javaDevConsulting2.setName("Benchea Bianca");
        javaDevConsulting2.setEmail("bianca.benchea@yahoo.com");
        javaDevConsulting2.setPhoneNumber("+407129455");
        calendar.set(2019,3,1);
        javaDevConsulting2.setDateOfEmployment(calendar.getTime());
        javaDevConsulting2.setDepartment(developers);
        javaDevConsulting2.setOffice(officeRepository.findById(53L).get());
        javaDevConsulting2.setJob(javaDev);
        javaDevConsulting2.setManager(managerDev1);
        javaDevConsulting2.setPassword(encodedPassword);
        employeeRepository.save(javaDevConsulting2);

        Employee softDevConsulting2 = new Employee();
        softDevConsulting2.setName("Cernica Adela");
        softDevConsulting2.setEmail("adela.cernica@yahoo.com");
        softDevConsulting2.setPhoneNumber("+407129445");
        calendar.set(2018,5,15);
        softDevConsulting2.setDateOfEmployment(calendar.getTime());
        softDevConsulting2.setDepartment(developers);
        softDevConsulting2.setJob(softDev);
        softDevConsulting2.setOffice(officeRepository.findById(54L).get());
        softDevConsulting2.setManager(managerDev1);
        softDevConsulting2.setPassword(encodedPassword);
        employeeRepository.save(softDevConsulting2);

        Employee javaDevConsulting3 = new Employee();
        javaDevConsulting3.setName("Stanescu Anastasia");
        javaDevConsulting3.setEmail("anastasia.stanescu@yahoo.com");
        javaDevConsulting3.setPhoneNumber("+407129451");
        calendar.set(2019,5,1);
        javaDevConsulting3.setDateOfEmployment(calendar.getTime());
        javaDevConsulting3.setDepartment(developers);
        javaDevConsulting3.setOffice(officeRepository.findById(55L).get());
        javaDevConsulting3.setJob(javaDev);
        javaDevConsulting3.setManager(managerDev1);
        javaDevConsulting3.setPassword(encodedPassword);
        employeeRepository.save(javaDevConsulting3);

        Employee softDevConsulting3 = new Employee();
        softDevConsulting3.setName("Irimia Mirela");
        softDevConsulting3.setEmail("mirela.irimia@yahoo.com");
        softDevConsulting3.setPhoneNumber("+407129115");
        calendar.set(2018,5,10);
        softDevConsulting3.setDateOfEmployment(calendar.getTime());
        softDevConsulting3.setDepartment(developers);
        softDevConsulting3.setJob(softDev);
        softDevConsulting3.setOffice(officeRepository.findById(56L).get());
        softDevConsulting3.setManager(managerDev1);
        softDevConsulting3.setPassword(encodedPassword);
        employeeRepository.save(softDevConsulting3);

        Employee javaDevConsulting4 = new Employee();
        javaDevConsulting4.setName("Enache Marius");
        javaDevConsulting4.setEmail("marius.enache@yahoo.com");
        javaDevConsulting4.setPhoneNumber("+407219455");
        calendar.set(2018,4,1);
        javaDevConsulting4.setDateOfEmployment(calendar.getTime());
        javaDevConsulting4.setDepartment(developers);
        javaDevConsulting4.setOffice(officeRepository.findById(57L).get());
        javaDevConsulting4.setJob(javaDev);
        javaDevConsulting4.setManager(managerDev1);
        javaDevConsulting4.setPassword(encodedPassword);
        employeeRepository.save(javaDevConsulting4);

        Employee softDevConsulting4 = new Employee();
        softDevConsulting4.setName("Anton Catalina");
        softDevConsulting4.setEmail("catalina.anton@yahoo.com");
        softDevConsulting4.setPhoneNumber("+407169445");
        calendar.set(2019,4,10);
        softDevConsulting4.setDateOfEmployment(calendar.getTime());
        softDevConsulting4.setDepartment(developers);
        softDevConsulting4.setJob(softDev);
        softDevConsulting4.setOffice(officeRepository.findById(58L).get());
        softDevConsulting4.setManager(managerDev1);
        softDevConsulting4.setPassword(encodedPassword);
        employeeRepository.save(softDevConsulting4);

        Employee softDevConsulting5 = new Employee();
        softDevConsulting5.setName("Danciu Madalina");
        softDevConsulting5.setEmail("madalina.danciu@yahoo.com");
        softDevConsulting5.setPhoneNumber("+407124445");
        calendar.set(2018,5,10);
        softDevConsulting5.setDateOfEmployment(calendar.getTime());
        softDevConsulting5.setDepartment(developers);
        softDevConsulting5.setJob(softDev);
        softDevConsulting5.setOffice(officeRepository.findById(59L).get());
        softDevConsulting5.setManager(managerDev1);
        softDevConsulting5.setPassword(encodedPassword);
        employeeRepository.save(softDevConsulting5);
        
        //dev 2
        Employee managerDev2 = new Employee();
        managerDev2.setName("Aron Alexandru");
        managerDev2.setEmail("alexandru.aron@yahoo.com");
        managerDev2.setPhoneNumber("+407129123");
        calendar.set(2000,5,1);
        managerDev2.setDateOfEmployment(calendar.getTime());
        managerDev2.setDepartment(developers2);
        managerDev2.setOffice(officeRepository.findById(83L).get());
        managerDev2.setJob(manager);
        managerDev2.setManager(generalManager);
        managerDev2.setPassword(encodedPassword);
        employeeRepository.save(managerDev2);

        Employee dev2_1 = new Employee();
        dev2_1.setName("Andrei Roxana");
        dev2_1.setEmail("roxana.andrei@yahoo.com");
        dev2_1.setPhoneNumber("+407222223");
        calendar.set(2015,12,12);
        dev2_1.setDateOfEmployment(calendar.getTime());
        dev2_1.setDepartment(developers2);
        dev2_1.setOffice(officeRepository.findById(84L).get());
        dev2_1.setJob(businessAnalist);
        dev2_1.setManager(managerDev2);
        dev2_1.setPassword(encodedPassword);
        employeeRepository.save(dev2_1);

        Employee dev2_2 = new Employee();
        dev2_2.setName("Scarlat Denisa");
        dev2_2.setEmail("denisa.scarlat@yahoo.com");
        dev2_2.setPhoneNumber("+407333322");
        calendar.set(2014,5,15);
        dev2_2.setDateOfEmployment(calendar.getTime());
        dev2_2.setDepartment(developers2);
        dev2_2.setOffice(officeRepository.findById(85L).get());
        dev2_2.setJob(fioriDev);
        dev2_2.setManager(managerDev2);
        dev2_2.setPassword(encodedPassword);
        employeeRepository.save(dev2_2);

        Employee dev2_3 = new Employee();
        dev2_3.setName("Circiumaru Teodor");
        dev2_3.setEmail("teodor.circiumaru@yahoo.com");
        dev2_3.setPhoneNumber("+407444412");
        calendar.set(2013,12,10);
        dev2_3.setDateOfEmployment(calendar.getTime());
        dev2_3.setDepartment(developers2);
        dev2_3.setOffice(officeRepository.findById(86L).get());
        dev2_3.setJob(fioriDev);
        dev2_3.setManager(managerDev2);
        dev2_3.setPassword(encodedPassword);
        employeeRepository.save(dev2_3);

        Employee dev2_4 = new Employee();
        dev2_4.setName("Lautaru Andreea");
        dev2_4.setEmail("andreea.lautaru@yahoo.com");
        dev2_4.setPhoneNumber("+407555512");
        calendar.set(2017,3,15);
        dev2_4.setDateOfEmployment(calendar.getTime());
        dev2_4.setDepartment(developers2);
        dev2_4.setOffice(officeRepository.findById(92L).get());
        dev2_4.setJob(hanaDev);
        dev2_4.setManager(managerDev2);
        dev2_4.setPassword(encodedPassword);
        employeeRepository.save(dev2_4);

        Employee dev2_5 = new Employee();
        dev2_5.setName("Buse Daniel");
        dev2_5.setEmail("daniel.buse@yahoo.com");
        dev2_5.setPhoneNumber("+407666612");
        calendar.set(2017,5,1);
        dev2_5.setDateOfEmployment(calendar.getTime());
        dev2_5.setDepartment(developers2);
        dev2_5.setOffice(officeRepository.findById(87L).get());
        dev2_5.setJob(hanaDev);
        dev2_5.setManager(managerDev2);
        dev2_5.setPassword(encodedPassword);
        employeeRepository.save(dev2_5);

        Employee dev2_6 = new Employee();
        dev2_6.setName("Stanescu Ioana");
        dev2_6.setEmail("ioana.stanescu@yahoo.com");
        dev2_6.setPhoneNumber("+407777712");
        calendar.set(2017,5,1);
        dev2_6.setDateOfEmployment(calendar.getTime());
        dev2_6.setDepartment(developers2);
        dev2_6.setOffice(officeRepository.findById(88L).get());
        dev2_6.setJob(hanaDev);
        dev2_6.setManager(managerDev2);
        dev2_6.setPassword(encodedPassword);
        employeeRepository.save(dev2_6);

        Employee dev2_7 = new Employee();
        dev2_7.setName("Mitrut Silvia");
        dev2_7.setEmail("silvia.mitrut@yahoo.com");
        dev2_7.setPhoneNumber("+407888812");
        calendar.set(2019,10,1);
        dev2_7.setDateOfEmployment(calendar.getTime());
        dev2_7.setDepartment(developers2);
        dev2_7.setOffice(officeRepository.findById(89L).get());
        dev2_7.setJob(abapDev);
        dev2_7.setManager(managerDev2);
        dev2_7.setPassword(encodedPassword);
        employeeRepository.save(dev2_7);

        Employee dev2_8 = new Employee();
        dev2_8.setName("Lupu Alexandru");
        dev2_8.setEmail("alexandru.lupu@yahoo.com");
        dev2_8.setPhoneNumber("+407999912");
        calendar.set(2018,5,1);
        dev2_8.setDateOfEmployment(calendar.getTime());
        dev2_8.setDepartment(developers2);
        dev2_8.setOffice(officeRepository.findById(90L).get());
        dev2_8.setJob(abapDev);
        dev2_8.setManager(managerDev2);
        dev2_8.setPassword(encodedPassword);
        employeeRepository.save(dev2_8);

        Employee dev2_9 = new Employee();
        dev2_9.setName("Raducanu Diana");
        dev2_9.setEmail("diana.raducanu@yahoo.com");
        dev2_9.setPhoneNumber("+407101112");
        calendar.set(2017,3,1);
        dev2_9.setDateOfEmployment(calendar.getTime());
        dev2_9.setDepartment(developers2);
        dev2_9.setOffice(officeRepository.findById(91L).get());
        dev2_9.setJob(abapDev);
        dev2_9.setManager(managerDev2);
        dev2_9.setPassword(encodedPassword);
        employeeRepository.save(dev2_9);

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/employees.txt").getAbsolutePath()))){
            String st;
            while ((st = reader.readLine()) != null){
                String[] st2 = st.split(",");
                    Employee newEmpl = new Employee();
                    newEmpl.setName(st2[0].trim());
                    newEmpl.setEmail(st2[1].trim());
                    newEmpl.setPassword(passwordEncoder.encode(st2[2].trim()));
                    newEmpl.setPhoneNumber(st2[3].trim());
                    newEmpl.setDateOfEmployment(new SimpleDateFormat("yyyy-MM-dd").parse(st2[4].trim()));
                    newEmpl.setOffice(officeRepository.findById(Long.parseLong(st2[5].trim())).get());
                    newEmpl.setJob(jobRepository.findById(Long.parseLong(st2[6].trim())).get());
                    if(!StringUtils.isEmpty(st2[7].trim())){
                        newEmpl.setManager(employeeRepository.findById(Long.parseLong(st2[7].trim())).get());
                    }
                    newEmpl.setDepartment(departmentRepository.findByCode(st2[8].trim()));
                    employeeRepository.save(newEmpl);
            }
    }

    }

    private String setCoordinate(String x0, String width, Integer nrElements, Integer multiplier){
        Integer x0N = Integer.parseInt(x0.replace("%",""));
        Integer widthN = Integer.parseInt(width.replace("%",""));
        return String.valueOf(x0N + widthN/nrElements * multiplier).concat("%");
    }

    private String setDimension(String totalMeasure, int nrElements){
        Integer totalMeasureN = Integer.parseInt(totalMeasure.replace("%",""));
        return String.valueOf(totalMeasureN/nrElements*2).concat("%");
    }
}
