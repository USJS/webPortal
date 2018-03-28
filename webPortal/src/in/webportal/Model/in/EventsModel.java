package in.webportal.Model.in;

import java.util.Date;
import java.util.Map;
import in.webportal.Enum.in.EventStatus;
import in.webportal.Enum.in.EventType;
import in.webportal.Enum.in.Permission;

public class EventsModel {

	private String eventName;
	private String eventId;
	private String eventDescrption;
	private String generatedBy;
	private EventStatus eventStatus;
	private EventType eventType;
	private Map<Permission,String> reqStatus;
	private Date eventTime;
	private Date eventGenTime;
	private Map<String,String> feedBack;

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the eventDescrption
	 */
	public String getEventDescrption() {
		return eventDescrption;
	}
	/**
	 * @param eventDescrption the eventDescrption to set
	 */
	public void setEventDescrption(String eventDescrption) {
		this.eventDescrption = eventDescrption;
	}
	/**
	 * @return the generatedBy
	 */
	public String getGeneratedBy() {
		return generatedBy;
	}
	/**
	 * @param generatedBy the generatedBy to set
	 */
	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}
	/**
	 * @return the eventStatus
	 */
	public EventStatus getEventStatus() {
		return eventStatus;
	}
	/**
	 * @param eventStatus the eventStatus to set
	 */
	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}
	/**
	 * @return the eventType
	 */
	public EventType getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
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
	 * @return the eventTime
	 */
	public Date getEventTime() {
		return eventTime;
	}
	/**
	 * @param eventTime the eventTime to set
	 */
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}
	/**
	 * @return the eventGenTime
	 */
	public Date getEventGenTime() {
		return eventGenTime;
	}
	/**
	 * @param eventGenTime the eventGenTime to set
	 */
	public void setEventGenTime(Date eventGenTime) {
		this.eventGenTime = eventGenTime;
	}
	/**
	 * @return the feedBack
	 */
	public Map<String, String> getFeedBack() {
		return feedBack;
	}
	/**
	 * @param feedBack the feedBack to set
	 */
	public void setFeedBack(Map<String, String> feedBack) {
		this.feedBack = feedBack;
	}
}
