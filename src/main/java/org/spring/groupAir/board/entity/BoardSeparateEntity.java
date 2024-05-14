package org.spring.groupAir.board.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;
import org.spring.groupAir.schedule.entity.ScheduleEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "boardSeparate")
public class BoardSeparateEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardSeparate_id")
    private Long id;

    @Column(nullable = false)
    public String boardSeparateName;

    @OneToMany(mappedBy = "boardSeparateEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<BoardEntity> boardEntityList;
}
