package yas.join.team.response;

import yas.join.team.value.TeamStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class TeamRespnseData {
    private Long id;
    private String name;
    private String description;
    private Long maxMemberCount;
    private Long currentUserCount;
    private Long ownerId;
    private Long mainTechStackId;
    private Set<Long> techStackIds;
    private Set<Long> memberIds;
    private TeamStatus teamStatus;
    private LocalDateTime createdAt;
}
