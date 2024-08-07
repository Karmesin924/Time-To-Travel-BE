package logX.TTT.member.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMemberDTO {
    private String username;
    private String profileImageUrl;
    private String introduction;
}
