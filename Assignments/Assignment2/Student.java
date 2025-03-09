public class Student {
    // declare variables
    private String _studentName;
    private int _id;
    private double _gpa;
    private double _creditsEarned;
    private boolean _onProbation;

    public Student(String studentName, int id) {
        this._studentName = studentName;
        this._id = id;
        this._gpa = 0.0;
        this._creditsEarned = 0.0;
        this._onProbation = false;
    }

    public void addCredits(double credits) {
        if (credits > 0) {
            this._creditsEarned += credits; // add credits
        }
    }

    public void changeProbation() {
        this._onProbation = !_onProbation; // this not operator will just toggle the state of _onProbation
    }

    public String getStudentName() {
        return _studentName;
    }

    public int getId() {
        return _id;
    }

    public double getGpa() {
        return _gpa;
    }

    public double getCreditsEarned() {
        return _creditsEarned;
    }

    public boolean isOnProbation() {
        return _onProbation;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this._gpa = gpa; // updates gpa
        }
    }

    public void setCreditsEarned(double creditsEarned) {
        if (creditsEarned >= 0) {
            this._creditsEarned = creditsEarned;
        }
    }

    public void setOnProbation(boolean onProbation) {
        this._onProbation = onProbation;
    }
}
