package org.spring.groupAir.member.entity;

import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "position")
public class PositionEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Long id;

    @Column(nullable = false)
    public String positionName;

    @OneToMany(mappedBy = "positionEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<MemberEntity> memberEntityList;
}
