package Task7;

public class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Prescribe medication");
    }

    void appointDoctor(Patient ob) {
        switch (ob.getTreatmentPlan()) {
            case 1 -> ob.setDoctor(new Surgeon());
            case 2 -> ob.setDoctor(new Dentist());
            default -> ob.setDoctor(new Therapist());
        }
        ob.getDoctor().treat();
    }
}

