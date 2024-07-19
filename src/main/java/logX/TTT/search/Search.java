package logX.TTT.search;

import jakarta.persistence.*;
import logX.TTT.member.Member;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "search_history")
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "query", nullable = false)
    private String query;

    @Column(name = "searched_at", nullable = false)
    private LocalDateTime searchedAt;
}
