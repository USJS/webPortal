package in.webportal.Model.in;

import java.util.Date;
import java.util.List;

public class CsvModel {
private String name;
private String empId;
private List<Date> in ;
private List<Date> out ;
private long total_In;
private Date currentDate;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public List<Date> getIn() {
	return in;
}
public void setIn(List<Date> in) {
	this.in = in;
}
public List<Date> getOut() {
	return out;
}
public void setOut(List<Date> out) {
	this.out = out;
}
public long getTotal_In() {
	return total_In;
}
public void setTotal_In(long total_In) {
	this.total_In = total_In;
}
public Date getCurrentDate() {
	return currentDate;
}
public void setCurrentDate(Date currentDate) {
	this.currentDate = currentDate;
}

}
