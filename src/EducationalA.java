
public class EducationalA {
    private String degreeType;
    private String major;
    private String university;
    private int graduationYear;

    public EducationalA (String degreeType, String major, String university, int graduationYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.university = university;
        this.graduationYear = graduationYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        return "EducationalA{" +
                "degreeType='" + degreeType + '\'' +
                ", major='" + major + '\'' +
                ", university='" + university + '\'' +
                ", graduationYear=" + graduationYear +
                '}';

    }
}
