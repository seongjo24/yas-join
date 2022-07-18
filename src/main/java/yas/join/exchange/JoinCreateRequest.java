package yas.join.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import yas.join.dto.JoinDto;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinCreateRequest {


    @JsonProperty("userId")
    private long userId;


    @JsonProperty("teamId")
    private long teamId;

    public JoinDto toDto() {
        return JoinDto.builder()
                .userId(userId)
                .teamId(teamId)
                .build();
    }
}
