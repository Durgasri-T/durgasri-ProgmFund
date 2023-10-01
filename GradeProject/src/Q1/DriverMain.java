package Q1;

public class DriverMain {
	public static void main(String[] args) {
		AdminDept admindept = new AdminDept();
		HrDept hrdept = new HrDept();
		TechDept techdept = new TechDept();
        System.out.println("Welcome to the "+admindept.departmentName());
        System.out.println(admindept.getTodaysWork());
        System.out.println(admindept.getWorkDeadline());
        System.out.println(admindept.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to the "+hrdept.departmentName());
        System.out.println(hrdept.doActivity());
        System.out.println(hrdept.getTodaysWork());
        System.out.println(hrdept.getWorkDeadline());
        System.out.println(hrdept.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to the "+techdept.departmentName());
        System.out.println(techdept.getTodaysWork());
        System.out.println(techdept.getWorkDeadline());
        System.out.println(techdept.getTechStackInformation());
        System.out.println(techdept.isTodayAHoliday());
	}
}

