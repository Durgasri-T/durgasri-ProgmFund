package Q1;

public class HrDept extends AdminDept{
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill out today's timesheet and mark your attendence";
	}
    public String doActivity() {
    	return "Team lunch";
    }
}
