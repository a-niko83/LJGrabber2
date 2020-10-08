package com.grabber.ljgrabber.entity.lj;


import lombok.*;
import org.jsoup.Jsoup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LJPost {
	
	@XmlElement(name="itemid")
	private long itemid;
	@XmlElement(name="anum")
	private String anum;
	@XmlElement(name="eventtime")
	private String eventtime;
	@XmlElement(name="subject")
	private String subject;	
	@XmlElement(name="url")
	private String url;
	@XmlElement(name="can_comment")
	private String canComment;
	@XmlElement(name="logtime")
	private String logtime;
	@XmlElement(name="event_timestamp")
	private String eventTimestamp;
	@XmlElement(name="lastsync")
	private String lastsync;
	@XmlElement(name="ditemid")
	private String ditemid;
	@XmlElement(name="event")
	private String event;
	@XmlElement(name="reply_count")
	private String replyCount;
	@XmlElement(name="author")
	private String author;

	public String getEventText() {
		return Jsoup.parse(event).text();
	}

	public String getText() {
		return Jsoup.parse(event).text();
	}
}
