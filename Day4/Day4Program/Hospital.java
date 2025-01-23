  import java.util.ArrayList;
import java.util.List;

// Create Doctor Class
class Doctor {
     String name;
     List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a patient to the doctor's list 
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method for coonsultation
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Doctor " + name + " does not have patient " + patient.getName() + " in their list.");
        }
    }

}

// Patient Class
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to communicate with a doctor 
    public void consultWithDoctor(Doctor doctor) {
        if (doctors.contains(doctor)) {
            doctor.consult(this); //  consult method of Doctor class
        } else {
            System.out.println("Patient " + name + " has not been assigned to Doctor " + doctor.getName());
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

  
}

// Hospital Class
class Hospital {
     String name;
     List<Doctor> doctors;
     List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

}


public class HospitalDetail {
    public static void main(String[] args) {
        // Create a hospital object
        Hospital hospital = new Hospital("DB Hospital");

        // Create doctor ibject
        Doctor doctor1 = new Doctor("Dr. Rohan");
        Doctor doctor2 = new Doctor("Dr. JOhn");

        // Create patients object
        Patient patient1 = new Patient("Aman");
        Patient patient2 = new Patient("Avii");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Add doctors to patients
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // Add patients to doctors
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        //consultations
        System.out.println("consultations :");
        patient1.consultWithDoctor(doctor1);  
        patient1.consultWithDoctor(doctor2);  
        patient2.consultWithDoctor(doctor1);  
        patient2.consultWithDoctor(doctor2);  //Fail condition
    }
}