package encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords;

    public OutPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double consultationFee) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient:");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}
