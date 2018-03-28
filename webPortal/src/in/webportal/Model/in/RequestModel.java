package in.webportal.Model.in;

import java.util.Map;

import in.webportal.Enum.in.Permission;

public class RequestModel {
	private String reqId;//reqid and eventid are same
	private String reqBy;
	private long genTime;
    private Map<Permission,String> reqStatus;
    private long processedTime;
    
	/**
	 * 
	 * @return the reqId
	 */
	public String getReqId() {
		return reqId;
	}
	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	/**
	 * @return the reqBy
	 */
	public String getReqBy() {
		return reqBy;
	}
	/**
	 * @param reqBy the reqBy to set
	 */
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	/**
	 * @return the genTime
	 */
	public long getGenTime() {
		return genTime;
	}
	/**
	 * @param genTime the genTime to set
	 */
	public void setGenTime(long genTime) {
		this.genTime = genTime;
	}
	/**
	 * @return the reqStatus
	 */
	public Map<Permission, String> getReqStatus() {
		return reqStatus;
	}
	/**
	 * @param reqStatus the reqStatus to set
	 */
	public void setReqStatus(Map<Permission, String> reqStatus) {
		this.reqStatus = reqStatus;
	}
	/**
	 * @return the processedTime
	 */
	public long getProcessedTime() {
		return processedTime;
	}
	/**
	 * @param processedTime the processedTime to set
	 */
	public void setProcessedTime(long processedTime) {
		this.processedTime = processedTime;
	}
}
