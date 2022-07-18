package yas.join.user.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserResponseData {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private LocalDate birth;
    private boolean showsBirth;
    private LocalDate careerStartAt;
    private boolean isActive;
    private LocalDateTime lastPasswordUpdateAt;
    private Integer signInFailCount;
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;
}
