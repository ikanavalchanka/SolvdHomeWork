package com.solvd.Hospital;

import java.util.Arrays;

public class MainHospitalManagement {
    public static void main(String[] args) {
        Doctor cardiologyDoctor = new Doctor("Dr. Smith", 40, "Male", "Cardiologist");
        Doctor neurologyDoctor = new Doctor("Dr. Johnson", 50, "Female", "Neurologist");
        Doctor emergencyDoctor = new Doctor("Dr. Lee", 35, "Male", "Emergency Specialist");
        Doctor surgeryDoctor = new Doctor("Dr. Clark", 45, "Male", "Surgeon");

        Patient patientCardiology = new Patient("John Doe", 45, "Male", "P12345", "Heart Disease", "Cardiology");
        Patient patientNeurology = new Patient("Jane Smith", 30, "Female", "P12346", "Migraine", "Neurology");
        Patient patientEmergency = new Patient("Emily Brown", 60, "Female", "P12347", "Severe Injury", "Emergency");
        Patient patientSurgery = new Patient("Michael White", 50, "Male", "P12348", "Appendicitis", "Surgery");

        Nurse nurseCardiology = new Nurse("Nurse Mary", 28, "Female", "Cardiology", 5);
        Nurse nurseNeurology = new Nurse("Nurse Lucy", 32, "Female", "Neurology", 7);
        Nurse nurseEmergency = new Nurse("Nurse Sarah", 29, "Female", "Emergency", 3);
        Nurse nurseSurgery = new Nurse("Nurse Olivia", 33, "Female", "Surgery", 6);

        Department cardiology = new CardiologyDepartment("Cardiology", 20, 100, Arrays.asList(cardiologyDoctor), 1, true);
        Department neurologyDepartment = new NeurologicalDepartment("Neurology", 15, 50, Arrays.asList(neurologyDoctor), 1, 5);
        Department emergency = new EmergencyDepartment("Emergency", 30, 200, Arrays.asList(emergencyDoctor), 1, true);
        Department surgery = new SurgeryDepartment("Surgery", 25, 150, Arrays.asList(surgeryDoctor), 1, true);

        Receptionist receptionist1 = new Receptionist("Hanna Leen", 29,"female",1,"day");

        Room roomCardiology = new Room(RoomType.ICU, 101);
        Room roomNeurology = new Room(RoomType.GENERAL, 102);
        Room roomEmergency = new Room(RoomType.EMERGENCY, 103);
        Room roomSurgery = new Room(RoomType.OPERATING, 104);

        Appointment appointmentCardiology = new Appointment(cardiologyDoctor, patientCardiology, "2024-12-01");
        Appointment appointmentNeurology = new Appointment(neurologyDoctor, patientNeurology, "2024-12-02");
        Appointment appointmentEmergency = new Appointment(emergencyDoctor, patientEmergency, "2024-12-03");
        Appointment appointmentSurgery = new Appointment(surgeryDoctor, patientSurgery, "2024-12-04");

        Prescription prescriptionCardiology = new Prescription("Aspirin", 100);
        Prescription prescriptionNeurology = new Prescription("Ibuprofen", 200);
        Prescription prescriptionEmergency = new Prescription("Painkiller", 50);
        Prescription prescriptionSurgery = new Prescription("Antibiotics", 200);

        LaboratoryTest labTestCardiology = new LaboratoryTest("ECG", 50.0);
        LaboratoryTest labTestNeurology = new LaboratoryTest("EEG", 75.0);
        LaboratoryTest labTestEmergency = new LaboratoryTest("X-ray", 100.0);
        LaboratoryTest labTestSurgery = new LaboratoryTest("Blood Test", 30.0);

        Medication medicationCardiology = new Medication("Aspirin", "Tablet", "100mg");
        Medication medicationNeurology = new Medication("Ibuprofen", "Tablet", "200mg");
        Medication medicationEmergency = new Medication("Painkiller", "Injection", "50mg");
        Medication medicationSurgery = new Medication("Antibiotics", "Capsule", "200mg");

        Payment paymentCardiology = new Payment(500.0, "2024-12-05");
        Payment paymentNeurology = new Payment(600.0, "2024-12-06");
        Payment paymentEmergency = new Payment(300.0, "2024-12-07");
        Payment paymentSurgery = new Payment(800.0, "2024-12-08");

        Insurance insuranceCardiology = new Insurance("HealthCorp", "HC123");
        Insurance insuranceNeurology = new Insurance("MediCare", "MC456");
        Insurance insuranceEmergency = new Insurance("LifeHealth", "LH789");
        Insurance insuranceSurgery = new Insurance("MediPlus", "MP012");

        Treatment treatmentCardiology = new Treatment("Cardiac Surgery", "Surgical procedure to treat heart disease");
        Treatment treatmentNeurology = new Treatment("Neuro Surgery", "Surgical procedure for neurological conditions");
        Treatment treatmentEmergency = new Treatment("Trauma Surgery", "Emergency procedure for traumatic injuries");
        Treatment treatmentSurgery = new Treatment("Appendectomy", "Surgical removal of the appendix");

        Bill billCardiology = new Bill(patientCardiology, 1200.0);
        Bill billNeurology = new Bill(patientNeurology, 1300.0);
        Bill billEmergency = new Bill(patientEmergency, 1000.0);
        Bill billSurgery = new Bill(patientSurgery, 1500.0);

        System.out.println("----- Hospital System Initialized -----");
        System.out.println("Hospital rules: " + HospitalRules.getRules());
        System.out.println("Total patients in the hospital: " + Hospital.getTotalPatients());
        System.out.println();

        cardiologyDoctor.addPatient(patientCardiology);
        neurologyDoctor.addPatient(patientNeurology);
        emergencyDoctor.addPatient(patientEmergency);
        surgeryDoctor.addPatient(patientSurgery);

        cardiologyDoctor.treatPatient(patientCardiology);
        neurologyDoctor.treatPatient(patientNeurology);
        emergencyDoctor.treatPatient(patientEmergency);
        surgeryDoctor.treatPatient(patientSurgery);

        nurseCardiology.startShift();
        nurseCardiology.endShift();
        nurseNeurology.startShift();
        nurseNeurology.endShift();
        nurseEmergency.startShift();
        nurseEmergency.endShift();
        nurseSurgery.startShift();
        nurseSurgery.endShift();

        receptionist1.processPayment(paymentCardiology);
        receptionist1.processPayment(paymentNeurology);
        receptionist1.processPayment(paymentEmergency);
        receptionist1.processPayment(paymentSurgery);

        NeurologicalDepartment neurology = (NeurologicalDepartment) neurologyDepartment; // Приведение типа
        neurology.addEquipment("MRI Machine");
        neurology.addEquipment("CT Scanner");
        System.out.println(neurology.getEquipmentStatus());
        neurology.removeEquipment("CT Scanner");
        System.out.println(neurology.getEquipmentStatus());
        System.out.println();

        System.out.println("----- Patients -----");
        System.out.println(patientCardiology);
        System.out.println(patientNeurology);
        System.out.println(patientEmergency);
        System.out.println(patientSurgery);
        System.out.println();

        System.out.println("----- Doctors -----");
        System.out.println(cardiologyDoctor);
        System.out.println(neurologyDoctor);
        System.out.println(emergencyDoctor);
        System.out.println(surgeryDoctor);
        System.out.println();

        System.out.println("----- Nurses -----");
        System.out.println(nurseCardiology);
        System.out.println(nurseNeurology);
        System.out.println(nurseEmergency);
        System.out.println(nurseSurgery);
        System.out.println();

        System.out.println("----- Rooms -----");
        System.out.println(roomCardiology);
        System.out.println(roomNeurology);
        System.out.println(roomEmergency);
        System.out.println(roomSurgery);
        System.out.println();

        System.out.println("----- Appointments -----");
        System.out.println(appointmentCardiology);
        System.out.println(appointmentNeurology);
        System.out.println(appointmentEmergency);
        System.out.println(appointmentSurgery);
        System.out.println();

        System.out.println("----- Prescriptions -----");
        System.out.println(prescriptionCardiology);
        System.out.println(prescriptionNeurology);
        System.out.println(prescriptionEmergency);
        System.out.println(prescriptionSurgery);
        System.out.println();

        System.out.println("----- Laboratory Tests -----");
        System.out.println(labTestCardiology);
        System.out.println(labTestNeurology);
        System.out.println(labTestEmergency);
        System.out.println(labTestSurgery);
        System.out.println();

        System.out.println("----- Medications -----");
        System.out.println(medicationCardiology);
        System.out.println(medicationNeurology);
        System.out.println(medicationEmergency);
        System.out.println(medicationSurgery);
        System.out.println();

        System.out.println("----- Payments -----");
        System.out.println(paymentCardiology);
        System.out.println(paymentNeurology);
        System.out.println(paymentEmergency);
        System.out.println(paymentSurgery);
        System.out.println();

        System.out.println("----- Insurance -----");
        System.out.println(insuranceCardiology);
        System.out.println(insuranceNeurology);
        System.out.println(insuranceEmergency);
        System.out.println(insuranceSurgery);
        System.out.println();

        System.out.println("----- Treatments -----");
        System.out.println(treatmentCardiology);
        System.out.println(treatmentNeurology);
        System.out.println(treatmentEmergency);
        System.out.println(treatmentSurgery);
        System.out.println();

        System.out.println("----- Department Descriptions -----");
        System.out.println(cardiology.departmentDescription());
        System.out.println(neurology.departmentDescription());
        System.out.println(emergency.departmentDescription());
        System.out.println(surgery.departmentDescription());
        System.out.println();

        System.out.println("----- Bills -----");
        System.out.println(billCardiology);
        System.out.println(billNeurology);
        System.out.println(billEmergency);
        System.out.println(billSurgery);
        System.out.println();

        System.out.println("----- Comparison of Patients -----");
        System.out.println("patientCardiology equals patientSurgery: " + patientCardiology.equals(patientSurgery));
        System.out.println();

        System.out.println("----- Hash Codes -----");
        System.out.println("patientCardiology hashCode: " + patientCardiology.hashCode());
        System.out.println("patientSurgery hashCode: " + patientSurgery.hashCode());
    }
}