package yas.join.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import yas.join.user.response.UserResponseData;

@FeignClient
public interface UserServiceClient {
    @GetMapping("user/{userId}")
    UserResponseData getUser(@PathVariable("userId") Long Id);
}
