package JunnQuery;

public class QueryUpdate {
	private String updatePerResume = "UPDATE PER_RESUME SET PNAME = ?, PADRESS = ?, PEMAIL=?, PBIRHT=? WHERE PID = ?";
	
	public String getUpPerResume() {
		return updatePerResume;
	}
}