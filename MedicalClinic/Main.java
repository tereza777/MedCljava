package MedicalClinic;

public class Main {
    public static void main(String[] args) {
        Doctors doctors = new Doctors();
        doctors.setDoctorName("Dr. Simeon Hill");
        System.out.println(doctors.getDoctorName());
        Patients patients = new Patients();
        patients.setFirstname("Lyudovikos");
        System.out.println(patients.getFirstname());
    }
}
