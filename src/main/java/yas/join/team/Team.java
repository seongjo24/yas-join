package yas.join.team;

import yas.join.user.User;

import java.time.LocalDateTime;

public class Team {
    private static final long serialVersionUID = 6529685098267757690L;
    private Long id;
    private String name;
    private Long maxMemberCount;
    private String description;
    private User owner;
    //private List<Join> joins;
    //private TechStackEntity mainTechStack;
    //private TeamStatus status;
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;
}
