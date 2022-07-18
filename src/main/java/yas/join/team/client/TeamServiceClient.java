package yas.join.team.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import yas.join.user.response.UserResponseData;

public interface TeamServiceClient {
    @GetMapping("/team/{teamId}")
    UserResponseData getTeam(@PathVariable("teamId") Long Id);
}
