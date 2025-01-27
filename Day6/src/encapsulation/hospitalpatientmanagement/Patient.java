package encapsulation.hospitalpatientmanagement;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // Encapsulation to protect sensitive data
    private String medicalHistory; // Encapsulation to protect sensitive data

    public Patient(String patientId, String name, int age, String diagnosis, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter methods for sensitive data
    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}

