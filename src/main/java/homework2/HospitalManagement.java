package homework2;

public class HospitalManagement {
    public static void main(String[] args) {
        Department cardiology = new CardiologyDepartment("Cardiology", 5, true);
        Department neurology = new NeurologyDepartment("Neurology", 3, 10);
        Department surgery = new SurgeryDepartment("Surgery", 4);

        Doctor doctor1 = new Doctor("Amanda Paw", 29, "Female", "Surgeon", cardiology);
        Doctor doctor2 = new Doctor("John Smith", 45, "Male", "Neurologist", neurology);


        Nurse nurse1 = new Nurse("Lucy Brown", 49, "Female", cardiology);
        Nurse nurse2 = new Nurse("Anna White", 35, "Female", neurology);


        Patient patient1 = new Patient("Bob Gob", 78, "Male", "Heart Attack", 1001, cardiology);
        Patient patient2 = new Patient("Olga Vane", 60, "Female", "Stroke", 1002, neurology);

        DoctorSchedule schedule1 = new DoctorSchedule("Amanda Paw", "9:00 AM - 5:00 PM");
        DoctorSchedule schedule2 = new DoctorSchedule("John Smith", "10:00 AM - 6:00 PM");

        Medication medication1 = new Medication("Aspirin", 500);
        Medication medication2 = new Medication("Statin", 20);


        Insurance insurance1 = new Insurance("HealthCarePlus", 2000.00);
        Insurance insurance2 = new Insurance("MedGuard", 1500.00);


        Appointment appointment1 = new Appointment("2024-11-09", "10:00 AM");
        Appointment appointment2 = new Appointment("2024-11-10", "2:00 PM");


        Treatment treatment1 = new Treatment("Cardiac Surgery", 14);
        Treatment treatment2 = new Treatment("Stroke Rehabilitation", 30);


        LaboratoryTest test1 = new LaboratoryTest("Blood Test", 120.00);
        LaboratoryTest test2 = new LaboratoryTest("MRI Scan", 800.00);


        Room room1 = new Room(101, "Single");
        Room room2 = new Room(102, "Double");


        Bill bill1 = new Bill(1001, 2000.00);
        Bill bill2 = new Bill(1002, 3000.00);


        Payment payment1 = new Payment(1001, 2000.00, 5001, 2000.00);
        Payment payment2 = new Payment(1002, 3000.00, 5002, 1500.00);


        Prescription prescription1 = new Prescription("Ibuprofen", 200);
        Prescription prescription2 = new Prescription("Paracetamol", 500);


        System.out.println("Doctor: " + doctor1.getName() + ", Specialty: " + doctor1.getSpeciality() + ", Department: " + doctor1.getDepartment().getDepartmentName());
        System.out.println("Doctor: " + doctor2.getName() + ", Specialty: " + doctor2.getSpeciality() + ", Department: " + doctor2.getDepartment().getDepartmentName());

        System.out.println("Nurse: " + nurse1.getName() + ", Department: " + nurse1.getNurseDepartment().getDepartmentName());
        System.out.println("Nurse: " + nurse2.getName() + ", Department: " + nurse2.getNurseDepartment().getDepartmentName());

        System.out.println("Patient: " + patient1.getName() + ", Illness: " + patient1.getIllness() + ", Department: " + patient1.getDepartment().getDepartmentName());
        System.out.println("Patient: " + patient2.getName() + ", Illness: " + patient2.getIllness() + ", Department: " + patient2.getDepartment().getDepartmentName());

        System.out.println("Doctor " + schedule1.getDoctorName() + " Schedule: " + schedule1.getShiftTime());
        System.out.println("Doctor " + schedule2.getDoctorName() + " Schedule: " + schedule2.getShiftTime());
        System.out.println("Medication: " + medication1.getMedicationName() + ", Dosage: " + medication1.getDosage());
        System.out.println("Medication: " + medication2.getMedicationName() + ", Dosage: " + medication2.getDosage());

        System.out.println("Insurance Provider: " + insurance1.getInsuranceProvider() + ", Amount: " + insurance1.getInsuranceAmount());
        System.out.println("Insurance Provider: " + insurance2.getInsuranceProvider() + ", Amount: " + insurance2.getInsuranceAmount());

        System.out.println("Appointment: " + appointment1.getAppointmentDate() + ", Time: " + appointment1.getAppointmentTime());
        System.out.println("Appointment: " + appointment2.getAppointmentDate() + ", Time: " + appointment2.getAppointmentTime());

        System.out.println("Treatment Type: " + treatment1.getTreatmentType() + ", Duration: " + treatment1.getDurationInDays() + " days");
        System.out.println("Treatment Type: " + treatment2.getTreatmentType() + ", Duration: " + treatment2.getDurationInDays() + " days");

        System.out.println("Laboratory Test: " + test1.getTestName() + ", Cost: " + test1.getCost());
        System.out.println("Laboratory Test: " + test2.getTestName() + ", Cost: " + test2.getCost());

        System.out.println("Room Number: " + room1.getRoomNumber() + ", Type: " + room1.getRoomType());
        System.out.println("Room Number: " + room2.getRoomNumber() + ", Type: " + room2.getRoomType());

        System.out.println("Bill ID: " + bill1.getBillID() + ", Amount: " + bill1.getAmountToPay());
        System.out.println("Bill ID: " + bill2.getBillID() + ", Amount: " + bill2.getAmountToPay());

        System.out.println("Payment ID: " + payment1.getPaymentId() + ", Amount Paid: " + payment1.getAmountPaid());
        System.out.println("Payment ID: " + payment2.getPaymentId() + ", Amount Paid: " + payment2.getAmountPaid());

        System.out.println("Prescription: " + prescription1.getMedicineName() + ", Dosage: " + prescription1.getMedicineDosage() + " mg");
        System.out.println("Prescription: " + prescription2.getMedicineName() + ", Dosage: " + prescription2.getMedicineDosage() + " mg");
    }
}
