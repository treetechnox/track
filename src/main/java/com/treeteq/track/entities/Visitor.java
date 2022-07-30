package com.treeteq.track.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "visitor")
@Data
@AllArgsConstructor@NoArgsConstructor@ToString
public class Visitor {

    @Id
    @GeneratedValue // (strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String ip;
    private String method;
    private String url;
    private String page;
    private String queryString;
    private String refererPage;
    private String userAgent;
    private LocalDateTime loggedTime;
    private boolean uniqueVisit;



}
