package homework2reworked;

public class MainHospitalManagement {
    public static void main(String[] args) {
        // Создаем объекты отделений
        Department cardiology = new CardiologyDepartment("Cardiology", 20, 100);
        Department neurology = new NeurologicalDepartment("Neurology", 15, 50);
        Department emergency = new EmergencyDepartment("Emergency", 30, 200);
        Department surgery = new SurgeryDepartment("Surgery", 25, 150);

        // Создаем пациентов для каждого отделения
        Patient patientCardiology = new Patient("John Doe", 45, "Male", "P12345", "Heart Disease", "Cardiology");
        Patient patientNeurology = new Patient("Jane Smith", 30, "Female", "P12346", "Migraine", "Neurology");
        Patient patientEmergency = new Patient("Emily Brown", 60, "Female", "P12347", "Severe Injury", "Emergency");
        Patient patientSurgery = new Patient("Michael White", 50, "Male", "P12348", "Appendicitis", "Surgery");

        // Создаем врачей для каждого отделения
        Doctor cardiologyDoctor = new Doctor("Dr. Smith", 40, "Male", "Cardiologist", "Cardiology");
        Doctor neurologyDoctor = new Doctor("Dr. Johnson", 50, "Female", "Neurologist", "Neurology");
        Doctor emergencyDoctor = new Doctor("Dr. Lee", 35, "Male", "Emergency Specialist", "Emergency");
        Doctor surgeryDoctor = new Doctor("Dr. Clark", 45, "Male", "Surgeon", "Surgery");

        Nurse nurseCardiology = new Nurse("Nurse Mary", 28, "Female", "Cardiology");
        Nurse nurseNeurology = new Nurse("Nurse Lucy", 32, "Female", "Neurology");
        Nurse nurseEmergency = new Nurse("Nurse Sarah", 29, "Female", "Emergency");
        Nurse nurseSurgery = new Nurse("Nurse Olivia", 33, "Female", "Surgery");

        Room roomCardiology = new Room("101A", true, "ICU");
        Room roomNeurology = new Room("102B", false, "General");
        Room roomEmergency = new Room("103C", true, "Emergency");
        Room roomSurgery = new Room("104D", true, "Operating Room");


        Prescription prescriptionCardiology = new Prescription("Aspirin", 100);
        Prescription prescriptionNeurology = new Prescription("Ibuprofen", 200);
        Prescription prescriptionEmergency = new Prescription("Painkiller", 50);
        Prescription prescriptionSurgery = new Prescription("Antibiotics", 200);

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

        System.out.println("----- Prescriptions -----");
        System.out.println(prescriptionCardiology);
        System.out.println(prescriptionNeurology);
        System.out.println(prescriptionEmergency);
        System.out.println(prescriptionSurgery);
        System.out.println();

        System.out.println("----- Department Descriptions -----");
        System.out.println(cardiology.departmentDescription());
        System.out.println(neurology.departmentDescription());
        System.out.println(emergency.departmentDescription());
        System.out.println(surgery.departmentDescription());
        System.out.println();

        System.out.println("----- Comparison of Patients -----");
        System.out.println("patientCardiology equals patientSurgery: " + patientCardiology.equals(patientSurgery));
        System.out.println();

        System.out.println("----- Hash Codes -----");
        System.out.println("patientCardiology hashCode: " + patientCardiology.hashCode());
        System.out.println("patientSurgery hashCode: " + patientSurgery.hashCode());
    }
}


