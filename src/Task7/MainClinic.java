package Task7;

public class MainClinic {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Therapist therapist = new Therapist();
        patient.setTreatmentPlan(1);
        therapist.plan = patient.getTreatmentPlan();
        therapist.appointDoctor();
    }
}
