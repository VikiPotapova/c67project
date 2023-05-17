package Task7;

public class MainClinic {
    public static void main(String[] args) {
        Patient patient = new Patient(1);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient);
    }
}
