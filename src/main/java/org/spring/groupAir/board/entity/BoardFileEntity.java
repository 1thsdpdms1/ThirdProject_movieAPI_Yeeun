package org.spring.groupAir.board.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "boardFile")
public class BoardFileEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardFile_id")
    private Long id;

    @Column(nullable = false)
    public String boardNewFile;

    @Column(nullable = false)
    public String boardOldFile;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private BoardEntity boardEntity;


}
