package src;
public class JobSheet {

    private String Status;
    private String MechanicID;
    private String PartsUsed;
    private String JobID;

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public String getStatus()
    {
        return Status;
    }

    public void setMechanicID(String MechanicID) {
        this.MechanicID = MechanicID;
    }
    public String getMechanicID()
    {
        return MechanicID;
    }

    public void setPartsUsed(String PartsUsed) {
        this.PartsUsed = PartsUsed;
    }
    public String getPartsUsed()
    {
        return PartsUsed;
    }

    public void setJobID(String JobID) {
        this.JobID = JobID;
    }
    public String getJobID()
    {
        return JobID;
    }


    JobSheet(String Status, String MechanicID,  String PartsUsed, String JobID) {
        this.Status = Status;
        this.MechanicID = MechanicID;
        this.PartsUsed = PartsUsed;
        this.JobID= JobID;
    }
}
