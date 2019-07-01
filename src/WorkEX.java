public class WorkEX {
    private String company;
    private String jobTitle;
    private String jobDescription;

    public WorkEX(String company, String jobTitle, String jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "WorkEX{" +
                "company='" + company + '\'' +
                ", jonTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
