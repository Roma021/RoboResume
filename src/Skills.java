public class Skills {
    private String mySkills;
    private String proficiency;

    public Skills(String mySkills, String proficiency) {
        this.mySkills = mySkills;
        this.proficiency = proficiency;


    }

    public String getMySkills() {
        return mySkills;
    }

    public void setMySkills(String mySkills) {
        this.mySkills = mySkills;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "mySkills='" + mySkills + '\'' +
                ", Proficiency='" + proficiency + '\'' +
                '}';
    }
}
