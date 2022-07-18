package yas.join.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import yas.join.enums.JoinStatus;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinDto {
    private Long id;
    private Long userId;
    private Long teamId;
    private String updatedBy;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private JoinStatus status;
    private Boolean isAlive;

    public static JoinDto ofAccepted(Long userId, Long teamId) {
        return JoinDto.builder()
                .userId(userId)
                .teamId(teamId)
                .status(JoinStatus.ACCEPT)
                .isAlive(Boolean.TRUE)
                .createdBy(String.valueOf(userId))
                .createdAt(LocalDateTime.now())
                .updatedBy(String.valueOf(userId))
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
