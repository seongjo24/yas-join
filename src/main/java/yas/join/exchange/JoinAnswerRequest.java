package yas.join.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import yas.join.dto.JoinDto;
import yas.join.enums.JoinStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinAnswerRequest {

    @JsonProperty("status")
    private String status;

    public JoinDto toDto(Long joinId) {
        return JoinDto.builder()
                .id(joinId)
                .status(JoinStatus.valueOf(status))
                .build();
    }
}
