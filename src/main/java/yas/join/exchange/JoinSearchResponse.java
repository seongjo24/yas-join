package yas.join.exchange;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import yas.join.dto.JoinDto;
import yas.join.enums.JoinStatus;

import java.time.LocalDateTime;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class JoinSearchResponse {
    private Long id;
    private Long userId;
    private Long teamId;
    private String updatedBy;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private JoinStatus status;
    private Boolean isAlive;

    public static JoinSearchResponse of(JoinDto dto) {
        return JoinSearchResponse.builder()
                .id(dto.getId())
                .userId(dto.getUserId())
                .teamId(dto.getTeamId())
                .updatedBy(dto.getUpdatedBy())
                .updatedAt(dto.getUpdatedAt())
                .createdBy(dto.getCreatedBy())
                .createdAt(dto.getCreatedAt())
                .status(dto.getStatus())
                .isAlive(dto.getIsAlive())
                .build();
    }
}
