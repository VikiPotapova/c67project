package Task7;

public class MainClinic {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setTreatmentPlan(1);
        System.out.println(patient.getTreatmentPlan());
        Therapist therapist = new Therapist();
        therapist.appointDoctor();
    }
}
