package yas.join.exchange;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class JoinSearchRequest {
    private String status;
    private String teamName;
    private String userEmail;
    //private JoinSearchType searchType;
    private String sortType;


}
