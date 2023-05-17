package Task7;

public class Therapist extends Doctor {
    @Override
    public void treat() {

        System.out.println("Prescribe medication");
    }

    public void appointDoctor() {
        Patient p = new Patient();
        Surgeon s = new Surgeon();
        Therapist t = new Therapist();
        Dentist d = new Dentist();

        if (p.getTreatmentPlan() == 1) {
            p.setDr("Surgeon");
            s.treat();
        } else if (p.getTreatmentPlan() == 2) {
            p.setDr("Dentist");
            d.treat();
        } else {
            p.setDr("Therapist");
            t.treat();
        }
    }
}
