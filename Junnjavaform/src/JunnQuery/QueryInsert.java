package JunnQuery;

public class QueryInsert {
	private String insertPerResume = "INSERT INTO PER_RESUME (PID, PNAME, PADRESS, PEMAIL, PBIRTH) VALUES (?,?,?,?,?)";
	
	public String getInPerResume() {
		return insertPerResume;
	}
}
