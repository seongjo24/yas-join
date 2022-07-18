package yas.join.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private static final long serialVersionUID = 6529685098267757690L;
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private String profileImage;
    private LocalDate birth;
    private boolean showsBirth;
    private LocalDate careerStartAt;
    private boolean isActive;
    private LocalDateTime lastPasswordUpdateAt;
    private Integer signInFailCount;
    private boolean isDeleted;
}
